package com.ncu.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.Models.Student;

@Controller
public class ControllerOne {

	
	
	@RequestMapping("/register")
	public String showForm(Model model) {
		
		model.addAttribute("Student", new Student());
		
		
		return "registration";
	}
	
	@RequestMapping("/welcome")
	public String processForm(
			@Valid @ModelAttribute("Student") Student stu,BindingResult theBindingResult, Model model) {
		
		
		if (theBindingResult.hasErrors()) {
			return "registration";
		}
		else {
			return "welcome";
		}
	}
}
