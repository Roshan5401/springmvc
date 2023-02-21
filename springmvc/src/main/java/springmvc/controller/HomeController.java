package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index")
	public String home(Model model)
	{
		//this is used to send data to the jsp file
		model.addAttribute("name","Roshan singh");
		System.out.println("Yup");
		return "index";
	}
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("name","Roshan");
		return "about";
	}
}
