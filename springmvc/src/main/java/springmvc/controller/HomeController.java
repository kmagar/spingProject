package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	public String home() {
		System.out.println("hello this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page ");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelandView=new ModelAndView();
		modelandView.addObject("name","Kishor Magar");
		modelandView.setViewName("help");
		
		return modelandView;
	}
		
}
