package test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamTestController {
	@RequestMapping("/showview")
	public String showpage() {
		return "test/paramtest";
	}
	//뷰에 대한 정보를 지정하지 않으면 요청 path와 동일한 뷰가 response된다
	//get방식으로 /springmvc/paramtest로 요청하면 실행되는 메소드
	//method속성에 RequestMethod.GET으로 지정하면 get방식으로 요청
	//4.3이후 @GetMapping, @PostMappin을 각각지원
	@RequestMapping(value = "/paramtest", method = RequestMethod.GET)
	public ModelAndView paramtest(HttpServletRequest request, 
								@RequestParam("data")  String data2, String info) {
		String param = request.getParameter("data");
		System.out.println("data=>"+data2);
		System.out.println("info=>"+info);
		System.out.println("param=>"+param);
		ModelAndView mav = new ModelAndView("test/paramresult");
		//데이터 공유하기 - request.setAttribute("name", 공유객체
		mav.addObject("msg", "스프링이 공유해 준 데이터");
		mav.addObject("data", data2);
		return mav;
	}
	//post방식으로
	//파라미터로 전달받은 값을 공유하고 출력할 수 있도록 메소드를 수정(paramtest2.jsp로 작업 - EL로 출력)
	@RequestMapping(value ="paramtest", method=RequestMethod.POST)
	public ModelAndView posttest(String data,String id,String pass) {
		System.out.println("data=>"+data);
		System.out.println("id=>"+id);
		System.out.println("pass=>"+pass);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("test/paramresult2");
		mav.addObject("data", data);
		mav.addObject("id", id);
		mav.addObject("pass", pass);
		return mav;
	}
	@RequestMapping(value = "/cmdtest", method = RequestMethod.POST)
	public ModelAndView cmdtest(ParamDTO dto) {
		System.out.println(dto);
		ModelAndView mav = new ModelAndView("test/paramresult3");
		mav.addObject("dto", dto);
		return mav;
	}
}
