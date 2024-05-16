package com.multi.erp.etc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.multi.erp.board.BoardDTO;
import com.multi.erp.board.BoardService;

//@Controller
//@ResponseBody
@RestController
public class EtcViewController {
	private BoardService service;
	@Autowired
	public EtcViewController(BoardService service) {
		super();
		this.service = service;
	}

	@GetMapping("/json/showpage")
	public String showJsonPage() {
		return "etcview/json";
	}
	//기본컨트롤러에서 응답데이터는 html문서이므로 응답데이터가 문자열이라고 알려 주어야 한다
	//컨트롤러의 메소드 위에 @ResponseBody를 추가하면 이제 더 이상 뷰를 응답하지 않고 response하겠다는 의미
	@GetMapping("/json/getString")
	public @ResponseBody String responseString() {
		return "text data";
	}
	@GetMapping("/json/getJsonObj")
//	@ResponseBody
	//스프링MVC(jackson-databind)가 BoardDTO를 JSON문자열로 만들어서 리턴
	public BoardDTO responseJsonObj() {
		return service.getBoardInfo("7");
	}
	//메소드명 : responseJsonArr
	@GetMapping("/json/getJsonArr")
//	@ResponseBody
	public List<BoardDTO> responseJsonArr() {
		System.out.println("restcontroller요청");
		return service.boardList();
	}
}
