package com.ncu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ncu.models.Customer;



@Controller
public class UserController {

	@RequestMapping(value="/info", method = RequestMethod.GET)
	 public String userInfo(@SessionAttribute(name="cust",required=false) Customer cust) {
//
//	      System.out.println("Email: " + cust.getEmail());
//	      System.out.println("First Name: " + cust.getNames());
       if(cust!=null)
       {
    	   return "home-login"; 
       }
	      return "no-session";
	   }
}
