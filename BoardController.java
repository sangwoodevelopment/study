package com.multi.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
	private BoardService service;
	@Autowired
	public BoardController(BoardService service) {
		super();
		this.service = service;
	}
	@GetMapping("/list")
	public ModelAndView list(String category) {
		System.out.println(category+"==========");
		ModelAndView mav = new ModelAndView("board/list");
		System.out.println("컨트롤러");
		//서비스메소드를 호출
		List<BoardDTO> boardlist = service.findByCategory(category);
		//데이터공유
		mav.addObject("boardlist", boardlist);
		mav.addObject("category", category);
		return mav;
	}
	@GetMapping("/write")
	public String writePage() {
		return "board/writepage";
	}
	@PostMapping("/write")
	public String insert(BoardDTO board) {
		System.out.println(board);
		service.insert(board);
		return "redirect:/board/list?category=all";
	}
	@PostMapping("/search")
	public ModelAndView search(String search,String tag) {
		ModelAndView mav = new ModelAndView("board/list");
		List<BoardDTO> list = 
		List<BoardDTO> boardlist = service.search(search);
		mav.addObject("boardlist",boardlist);
		return mav;
	}
	@GetMapping("/read")
	public String read(String board_no, String action, Model model) {
		BoardDTO board = service.getBoardInfo(board_no);
		System.out.println("=========="+board);
		String view="";
		if(action.equals("READ")) {
			view = "board/read";
		}else {
			view = "board/update";
		}
		model.addAttribute("board", board);
		//모델객체에 데이터를 공유했으므로 뷰정보만 리턴
		//=> 리턴되면서 DispatcherServlet에 ModelAndView객체로 만들어져서 리턴된다
		return view;
	}
	@GetMapping("/delete")
	public String delete(String board_no) {
		service.delete(board_no);
		return "redirect:/board/list?category=all";
	}
	@PostMapping("/update")
	public String update(BoardDTO board) {
		service.update(board);
		return "redirect:/board/list?category=all";
	}
}
