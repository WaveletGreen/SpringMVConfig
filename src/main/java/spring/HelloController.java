package spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("greeting", "Hello Spring MVC");
		return "hello";
	}

	@RequestMapping(value = "helloAgain", method = RequestMethod.GET)
	public String helloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello Spring MVC,again!!");
		return "hello";
	}
}
