package com.multi.erp.member;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/member")
@Controller
public class MemberController {
	private MemberService service;
	private HttpServletRequest request;
	@Autowired
	public MemberController(MemberService service) {
		super();
		this.service = service;
	}
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("member/list");
		List<MemberDTO> memberlist = service.getMemberList();
		//데이터공유
		mav.addObject("memberlist", memberlist);
		return mav;
	}
	@PostMapping("/login")
	public String login(MemberDTO loginUserInfo, HttpServletRequest requst) {
		String view = "";
		System.out.println("********"+loginUserInfo);
		MemberDTO user = service.login(loginUserInfo);
		if(user!=null) {
			view = "redirect:/index.do";
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		}else {
			view = "redirect:/emp/login.do";
		}
		return view;
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		if(session!=null) {
			session.invalidate();
		}
		return "redirect:/index.do";
	}
}
