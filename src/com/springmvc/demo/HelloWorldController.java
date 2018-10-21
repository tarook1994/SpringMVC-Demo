package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//First we need to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//Then we need to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "HelloWorld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		String formString = request.getParameter("studentName");
		
		String upper = formString.toUpperCase();
		
		String result = "YO "+ upper;
		
		model.addAttribute("name",result);
		
		return "shoutNameLoud";
		
	}

}
