package com.ncu.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.models.Customer;
@Controller
@SessionAttributes("cust")
public class MainController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping("/home")
	public String Home(Model model) {
		//model.addAttribute("CustModel", new Customer("Priyansh","9990001234","12345678","priyansh@google","M","gurgaon","2345","haryana","122003"));
		model.addAttribute("CustModel",new Customer());
//		  List<String> states = new ArrayList<>();
//	        states.add("Haryana");
//	        states.add("Rajasthan");
//	        states.add("Uttrakhand");
//	        model.addAttribute("states", states);
		return "home-login3";
	}
//	@RequestMapping(path = "/login",method = RequestMethod.POST)
//	public String doLogin(HttpServletRequest request, Model model) {
//		String name = request.getParameter("names");
//		String email = request.getParameter("email");
//	System.out.println(name + " " + email );
//		model.addAttribute("names",name);
//		model.addAttribute("email",email);
//		return "dashboard2";
//		}
//	@RequestMapping(path = "/login",method = RequestMethod.POST)
//	public String doLogin(@RequestParam("email") String email, @RequestParam("names") String name, Model model) {
//		model.addAttribute("cust.names",name);
//	    model.addAttribute("cust.email",email);
//		return "dashboard";
//	}
	
//	@RequestMapping(path = "/login",method = RequestMethod.POST)
//	public String doLogin(@Valid @ModelAttribute("CustModel") Customer cust , Model model) {
//		
//			model.addAttribute("cust",cust);
//		
//		return "dashboard";
//	}
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String doLogin(@Valid @ModelAttribute("CustModel") Customer cust,BindingResult theBindingResult,Model model) {
		
		
		if (theBindingResult.hasErrors()) {
			return "home-login3";
		}
		else {
			model.addAttribute("cust",cust);
			return "dashboard";
		}
		
		
			
	}
	
	

//	@RequestMapping(path="/seeDetail", method = RequestMethod.POST)
//	 public String userInfo((@Valid @ModelAttribute("CustModel") Customer cust,BindingResult theBindingResult,Model model) {
////
////	      System.out.println("Email: " + cust.getEmail());
////	      System.out.println("First Name: " + cust.getNames());
////       if(cust!=null)
////       {
////    	   return "home-login"; 
////       }
//	      return "dashboard";
//	   }
}
