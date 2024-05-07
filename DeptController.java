package com.multi.erp.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dept")
public class DeptController {
	private DeptService service;

	@Autowired
	public DeptController(DeptService service) {
		super();
		this.service = service;
	}

	// 부서등록페이지가 보여지도록 실행
	@GetMapping("/insert")
	public String showInsertPage() {
		return "dept/register";
	}
	//부서를 DB에 등록하는 작업을 실행
	@PostMapping("/insert")
	public String insert(DeptDTO dept) {
		System.out.println(dept);
		service.insert(dept);
		//기본값이 forward이나 redirect를 하고 싶은 경우 redirect:을 추가하고 뒤에 path를 정의
		//뷰만 forward하면 컨트롤러에서 공유한 데이터가 있는 경우 오류가 발생할 수 있다
		//실행중인 컨트롤러에서 공유한 데이터를 출력하는 뷰가 아닌 이상은 redirect로 재요청
		return "redirect:/index.do";
	}
	//전체 부서 정보를 조회
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("dept/list");
		List<DeptDTO> deptlist =  service.select();
		mav.addObject("deptlist", deptlist);
		return mav;
	}
}
