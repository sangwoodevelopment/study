package com.example.erp.board;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

import com.example.erp.dto.BoardDTO;
import com.example.erp.dto.BoardFileDTO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class BoardController {
	private BoardService service;
	private FileUploadService fileuploadService;
	@Autowired
	public BoardController(BoardService service, FileUploadService fileuploadService) {
		super();
		this.service = service;
		this.fileuploadService = fileuploadService;
	}
	@GetMapping("/list")
	public ModelAndView list(@RequestParam("category") String category) {
		System.out.println(category+"===========");
		ModelAndView mav = new ModelAndView("board/boardlist");
		System.out.println("컨트롤러");
		//서비스메소드를 호출
		List<BoardDTO> boardlist =  service.findByCategory(category);
		System.out.println(boardlist);
		//데이터공유
		mav.addObject("boardlist", boardlist);
		mav.addObject("category", category);
		return mav;
	}
	
	@GetMapping("/write")
	public String writePage() {
		return "board/writepage";//view이름
	}
	//게시글등록을 위해 사용자가 입력한 내용과 첨부한 파일이 업로드되도록 처리
	@PostMapping("/write")
	public String insert(BoardDTO board,HttpSession session)
									throws IllegalStateException, IOException {
		System.out.println("파일업로드:"+board);
		//1. MultipartFile정보를 추출
		List<MultipartFile> file = board.getFiles();
		//2. 업로드될 서버의 실제 위치를 추출
		//   - 실제 서버에서 인식하는 업로드될 파일이 저장될 폴더의 경로를 추출하기 
		//   - context내부에 있으므로 ServletContext객체를 이용
		//   - ServletContext객체는 프로젝트(context)에 대한 정보를 담고 있는 객체이고 이 안에 실제 경로를 
		//     구할 수 있는 기능이 있음
		//   - ServletContext는 세션객체를 통해 생성
		String path = WebUtils.getRealPath(session.getServletContext(),"/WEB-INF/upload");
		
		System.out.println("^^^^^^^^^"+path);
		
		//3. 업로드로직을 처리하는 서비스의 메소드를 호출
		List<BoardFileDTO> boardfiledtolist =  fileuploadService.uploadFiles(file, path);
		System.out.println(boardfiledtolist);
		service.insert(board,boardfiledtolist);
		return "redirect:/board/list?category=all";
	}
	//동적쿼리를 테스트
	//사용자가 select에서 어떤 option을 선택하냐에 따라 다른 쿼리가 실행되어야 한다.
	@PostMapping("/search")
	public ModelAndView search(@RequestParam("tag") String tag,@RequestParam("search") String search) {
		ModelAndView mav = new ModelAndView("board/boardlist");
		System.out.println("컨트롤러");
		//서비스메소드를 호출
		List<BoardDTO> boardlist =  service.search(tag,search);
		System.out.println(boardlist);
		//데이터공유
		mav.addObject("boardlist", boardlist);
		return mav;
	}
	//Model타입의 변수를 매개변수에 정의하면 스프링MVC내부에서 데이터를 담을 수 있는 모델객체를 만들어서 넘겨준다.
	@GetMapping("/read")
	public String read(@RequestParam("board_no") String board_no,@RequestParam("action") String action,Model model) {
		BoardDTO board =  service.getBoardInfo(board_no);
		List<BoardFileDTO> boardfiledtolist = service.getFileList(board_no);
		System.out.println("**************************"+board);
		String view="";
		if(action.equals("READ")) {
			view = "board/board_read";
		}else {
			view = "board/update";
		}
		//스프링이 만들어준 모델객체에 공유할 데이터를 공유한다.
		model.addAttribute("board", board);
		model.addAttribute("boardfiledtolist", boardfiledtolist);
		//모델객체에 데이터를 공유했으므로 뷰정보만 리턴
		//=> 리턴되면서 DispatcherServlet에 ModelAndView객체로 만들어져서 리턴된다.
		return view;
	}
	@PostMapping("/update")
	public String update(BoardDTO board) {
		System.out.println(board);
		service.update(board);
		return "redirect:/board/list?category=all";
	}
	@GetMapping("/delete")
	public String delete(String board_no) {
		service.delete(board_no);
		return "redirect:/board/list?category=all";
	}
	//PathVariable을 사용하는 경우 요청path에 {}를 이용해서 path에서 변수 처리할 부분을 명시 
	//메소드의 매개변수에 path에 명시한 변수를 동일하게 사용
	//ResponseEntity는 spring mvc에서 http응답을 지정하기 위해서 사용하는 클래스
	//사용자가 원하는 응답형식으로 응답하는 경우
	@GetMapping("/download/{id}/{board_no}/{boardFileno}")
	public ResponseEntity<UrlResource> downloadFile(@PathVariable String id, @PathVariable String board_no,
							@PathVariable String boardFileno,HttpSession session) 
									throws MalformedURLException, FileNotFoundException {
//		System.out.println(id+","+board_no+","+boardFileno);
		//1. 파일을 다운로드 하기 위해 디비에 저장된 파일의 정보를 가져오기 - 다운로드를 요청한 파일의 정보
		BoardFileDTO selectfileinfo = service.getFile(boardFileno);
		System.out.println("파일정보:"+selectfileinfo);
		//2. BoardFileDTO객체에서 다운로드할 파일을 실제 파일객체로 변환하는 작업처리 -서버의 경로와 실제 파일정보를 정의
		//UrlResource resource = new UrlResource ("file:"+파일의 full path)
		//                                                ----------------
		//                                                  실제 파일이 있는 위치
		//업로드된 서버의 위치에서 다운로드할 경로와 파일명을 연결해서 full path를 생성
		//session.getServletContext()를 getRealPath메소드를 호출하면서 매개변수로 전달하는 이유는 
		//ServletContext내부의 메소드를 사용해서 realpath를 가져오기 위해서
		//file:은 가져올 자원이 파일시스템에 존재한다는 것을 명시
		UrlResource resource = 
			new UrlResource("file:"+WebUtils.getRealPath(session.getServletContext(), 
							"/WEB-INF/upload/"+selectfileinfo.getStoreFilename()));
		//3. 파일명(다운로드되는 파일명)에 한글이 있는 경우 오류가 발생되지 않도록 하기 위해서 처리 
		String encodedFilename = UriUtils.encode(selectfileinfo.getOriginalFilename(), "UTF-8");
		//4. 파일을 다운로드형식으로 응답하기 위해서 응답정보를 수정 - 응답헤더에 값을 추가(파일다운로드로 인식시키기 위해서)
		//  =>response를 파일다운로드형식으로 만들기 위해서 응답헤더에 셋팅
		//     attachment; filename="a.jpg"
		String mycontenttype="attachment; filename=\""+encodedFilename+"\"";
		//응답메시지만들기
		//=>response가 정상처리되었다는 것을 인식시키기 위해서 셋팅(200번응답코드를 셋팅)
//		BodyBuilder builder = ResponseEntity.ok();
//		builder.header(HttpHeaders.CONTENT_DISPOSITION, mycontenttype);
//		ResponseEntity<UrlResource> response =  builder.body(resource);
//		return response;
		return ResponseEntity.ok()
				     .header(HttpHeaders.CONTENT_DISPOSITION, mycontenttype)
				     .body(resource);
	}
	//mainContent.jsp에서 ajax로 요청될 메소드
	@GetMapping("/ajax/list")
	@ResponseBody
	public List<BoardDTO> ajaxlist(String category){
		List<BoardDTO> jsonarr = service.findByCategory(category);
		System.out.println(jsonarr+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		return jsonarr;
	}
}


















