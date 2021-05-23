package com.ncu.models;

import java.util.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ncu.validation.CourseCode;
import com.ncu.validation.Password;

public class Customer {
@NotNull(message="is required")
@Size(min=2, message="is required")
private String names;
@NotNull(message="is required")
@Pattern(regexp= "[0-9]{10}", message="Only 10 digits allowed")
private String Phno;
@Password(message="must have atleast 8 characters")
private String password;
private String aadharNo;
@NotNull(message="is required")
@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.[a-z]+$", message="email required")
private String email;
private String sex;
@NotNull(message="is required")
private String city;
@NotNull(message="is required")
private String house_no;
@NotNull(message="is required")
private String state;
private String pincode;
@CourseCode(value={"CSE","ECE","CSL","SOM"}, message="must start with CSE or ECE or CSL or SOM")
private String courseCode;

public String getCourseCode() {
	return courseCode;
}

public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHouse_no() {
	return house_no;
}
public void setHouse_no(String house_no) {
	this.house_no = house_no;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}


public Customer() {
	super();
}
public Customer(String names, String phno, String aadharNo, String email,String sex,String city, String house_no, String state,
		String pincode) {
	super();
	this.names = names;
	Phno = phno;
	this.aadharNo = aadharNo;
	this.email = email;
	this.sex = sex;
	this.city = city;
	this.house_no = house_no;
	this.state = state;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Customer [names=" + names + ", Phno=" + Phno + ", aadharNo=" + aadharNo + ", email=" + email + ", city="
			+ city + ", house_no=" + house_no + ", state=" + state + ", pincode=" + pincode + "]";
}
public String getNames() {
	return names;
}

public void setNames(String names) {
	this.names = names;
}

public String getPhno() {
	return Phno;
}

public void setPhno(String phno) {
	Phno = phno;
}

public String getAadharNo() {
	return aadharNo;
}

public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}





