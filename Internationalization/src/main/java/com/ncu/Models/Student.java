package com.ncu.Models;

import javax.validation.constraints.NotNull;

public class Student {

	@NotNull(message="This field is required")
	String firstName;
	
	@NotNull(message="This field is required")
	String LastName;
	
	String courseCode;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	
}
