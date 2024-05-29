package com.example.thymeleafPro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th")
public class ThymeleafBasicTestController {
	@GetMapping("/text")
	public String basic(Model model) {
		model.addAttribute("msg", "thymeleaf사용하기");
		model.addAttribute("data", "test");
		return "basic/text_test";
	}
	@GetMapping("/oprtest")
	public String oprtest(Model model) {
		return "basic/opr_test";
	}
	@GetMapping("/iftest")
	public String iftest(Model model) {
		model.addAttribute("myval", 78);
		model.addAttribute("age", 50);
		return "basic/if_test";
	}
	@GetMapping("/foreachtest")
	public String foreachtest(Model model) {
		PersonDTO p1 = new PersonDTO("bts1","1234","진",95);
		PersonDTO p2 = new PersonDTO("bts2","1234","슈가",89);
		PersonDTO p3 = new PersonDTO("bts3","1234","남준",84);
		PersonDTO p4 = new PersonDTO("bts4","1234","뷔",100);
		List<PersonDTO> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		//DB에서 조회한 데이터 공유
		model.addAttribute("list", list);
		model.addAttribute("person", p1);
		return "basic/foreach_test";
	}
	@GetMapping("/linktest")
	public String getRequest(Model model, String id, String data1) {
		System.out.println("id=>"+id);
		System.out.println("data1=>"+data1);
		return "redirect:/";
	}
}
