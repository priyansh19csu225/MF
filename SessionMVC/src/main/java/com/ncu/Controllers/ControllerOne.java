package com.ncu.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.Models.User;

@Controller
@SessionAttributes("user")
public class ControllerOne {
	

	@ModelAttribute("user")
	public User setUpAttributes(){
	      return new User();
	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/signin")
	public String showForm(Model model) {
		model.addAttribute("userModel", new User());
		return "Form";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public String homepage(@ModelAttribute("userModel") User user,Model model) {
		
		if (user.getEmail().equalsIgnoreCase("priyansh@g.com") && user.getPassword().equals("12345678")) {
	         user.setName("GullyBoy");
	         user.setEmail("priyansh@g.com");
	    	 user.setAge(20);
	    	 user.setCity("Gurugram");
	    	 user.setState("Haryana");
	    	 user.setInterest("Playing");
	    	 
	         model.addAttribute("user",user);
	         return "welcome";
		}
		else {
	         model.addAttribute("message","Login failed. Enter correct details and Try again!");
	         return "Form";
	      }
	 }
	
	
	
	
}
	
