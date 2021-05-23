package com.ncu.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PasswordConstraintValidator implements ConstraintValidator<Password, String> {

	String pwd;
	String pattern = "^([A-Z](?=.{0,}[0-9])(?=.{0,17}[a-z])(?=.*[@-_#$%]).{7,20})";
	Pattern r = Pattern.compile(pattern);
	
    @Override
    public void initialize(Password arg0) {
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        
    	boolean result = false;
    	
    	if(password != null) {
    		
    		if(password.length() < 8) {
    			return result;
    		}
    		
    		Matcher m = r.matcher(password);
    		boolean flag = m.matches();
    		
    		if(flag) {
    			result = true;
    			return result;
    		}
    		
    	}
    	else {
    		result = true;
    	}
    	
		return result;
    }
}