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
	
	@RequestMapping("/processFormv2")
	public String processFormv2(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		String nameUpper= name.toUpperCase();
		model.addAttribute("name", nameUpper);
		return "HelloWorld";
	}

}
