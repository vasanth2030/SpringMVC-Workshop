package com.vasanth.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@RequestMapping("/")
	public String welcomePage(Model theModel)
	{
		return "formPage";
	}

	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest req, Model theModel)
	{
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		
		theModel.addAttribute("firstname",fname);
		theModel.addAttribute("lastname",lname);
		
		
		return "welcomepage";
	}
	
	@RequestMapping("processFormRequestParam")
	public String processFormRequestParam(@RequestParam("fname")String fname,
			@RequestParam("lname")String lname,Model theModel)
	{
		theModel.addAttribute("firstname",fname);
		theModel.addAttribute("lastname",lname);
		
		
		return "welcomepage";
		
	}
	

	@RequestMapping("springmvcform")
	public String mvcForm(Model theModel)
	{
		List<String> gender=new ArrayList<>();
		gender.add("Male");
		gender.add("Female");
		Student stu=new Student();
		
		theModel.addAttribute("gender",gender);
		theModel.addAttribute("student",stu);
		return "springmvcform";
	}
	
	
	@RequestMapping("/springmvcProcessForm")
	public String mvcProcessForm(@ModelAttribute("student") Student s,Model theModel)
	{
		theModel.addAttribute("stu",s);
		return "welcomepage";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
