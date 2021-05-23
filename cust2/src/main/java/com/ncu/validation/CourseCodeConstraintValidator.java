package com.ncu.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourseCode, String> {
	private String[] coursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix = theCourseCode.value();
		System.out.println(coursePrefix);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		
		boolean result = false;
		if(value!=null) {
		
		for(String tempPrefix : coursePrefix) {
//		if(value!=null) {
			result=value.startsWith(tempPrefix);
		if(result)
		{
			break;
		}
		}
		}
		else {
			result=true;
		}
		
		return result;
	}
}
	


