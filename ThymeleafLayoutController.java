package com.example.thymeleafPro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class ThymeleafLayoutController {
	@GetMapping("/fragmenttest")
	public String fragment_test() {
		return "fragment/main";
	}
	@GetMapping("/mypage")
	public String mypage() {
//		return "layout/mypageLayout"; //1차작업 - 타임리프프레그먼트를 이용해서 작업
		return "member/mypage";
	}
	@GetMapping("/prdlist")
	public String prdlist() {
//		return "layout/prdlistLayout";//1차작업 - 타임리프프레그먼트를 이용해서 작업
		return "product/prdlist";
	}
	@GetMapping("/prdread")
	public String prdread() {
		return "product/prdread";
	}
}
