package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.service.*;
import springmvc.model.*;

@Controller
public class ContactController {
	@Autowired
	UserService userService;
	@RequestMapping("/contact")
	public String home()
	{
		return "contact";
	}
	
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String processform(HttpServletRequest request,Model model)
	{
		//it will fetch the email which is given as input in jsp file
		String email=(String) request.getParameter("email");
		String username=(String) request.getParameter("username");
		String password=(String) request.getParameter("password");
		System.out.println(email);
		
		User u=new User(email,username,password);
		this.userService.createUser(u);
		
		model.addAttribute("email",email);
		return "process";
	}
	
	//do it today 
	//not done completely
	@RequestMapping(path="/alluser",method=RequestMethod.POST)
	public String alluser(HttpServletRequest request,Model model)
	{	
		List<User> lis=this.userService.getalluser();
//		for(User l:lis)
//		{
//			System.out.println(l);
//		}
		return "alluser";
		
	}
	
}
