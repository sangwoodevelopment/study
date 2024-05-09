package com.multi.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("board/list");
		System.out.println("컨트롤러");
		//서비스메소드를 호출
		List<BoardDTO> boardlist = service.boardList();
		//데이터공유
		mav.addObject("boardlist", boardlist);
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
		return "redirect:/board/list";
	}
}
