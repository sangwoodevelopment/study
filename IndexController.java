package com.example.bootErp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bootErp.board.BoardService;
import com.example.bootErp.dto.BoardDTO;

@Controller
public class IndexController {
	private BoardService service;
	@Autowired
	public IndexController(BoardService service) {
		super();
		this.service = service;
	}
	@GetMapping("/index.do")
	public String index(Model model) {
		//첫 페이지가 로딩될때 필요한 데이터를 가져오기 위해서 서비스랑 연결(게시판데이터)
		List<BoardDTO>  boardlist = service.findByCategory("게시판");
		model.addAttribute("boardlist", boardlist);
		return "layout/indexLayout";
	}
	@GetMapping("/emp/login.do")
	public String loginPage() {
		return "login";
	}
	@GetMapping("/menu/board.do")
	public String boardPage() {
		return "menu/board";
	}
}
