package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
		@RequestMapping(name="/showpost", method = RequestMethod.GET)
		public String showpage() {
			return "test/post";
		}
		@RequestMapping(name="/showform", method = RequestMethod.POST)
		public ModelAndView runpost(PostDTO post) {
			ModelAndView mav = new ModelAndView("test/postResult");
			mav.addObject("post", post);
			return mav;
	}
}
