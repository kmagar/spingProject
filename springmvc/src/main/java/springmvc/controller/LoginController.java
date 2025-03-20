package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/contact")
	public String Login()
	{
		System.out.println("this is contact");
		return "contact";
	}
	
	@RequestMapping(path="/processform" ,method=RequestMethod.POST)
	public String Process(@RequestParam("email") String email,@RequestParam("password") String pass)
	{
		
		System.out.println("User's emial is: "+email);
		System.out.println("User's password is: "+pass);
		
		
		return "about";
	}
}
