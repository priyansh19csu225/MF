<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/my-test2.css">
<link href="resources/image/download.jpg"
    rel="stylesheet">
<meta charset="ISO-8859-1">
<title>HELLO CUSTOMER</title>
</head>
<body>
<div class="form-style-10" align="center">
<h1>Your Details are :</h1>
       <div class="inner-wrap">
            <table border="0">
				<tr>
					<td>Customer Name:</td>
					<td>${cust.names}</td>
				</tr>
				 <tr>
                    <td>Password :</td>
                    <td>${cust.password}</td>
                </tr>
                <tr>
                    <td>Phone no:</td>
                    <td>${cust.getPhno()}</td>
                </tr>
<img src="resources/image/download.jpg" align="left" alt="Customer">
                <tr>
                    <td>E-mail:</td>
                    <td>${cust.email}</td>
                </tr>
                <tr>
                    <td>Aadhar no:</td>
                    <td>${cust.getAadharNo()}</td>
                </tr>
                <tr>
                    <td>Sex:</td>
                    <td>${cust.sex}</td>
                </tr>
                <tr>
                    <td>Course Code:</td>
                    <td>${cust.courseCode}</td>
                </tr>
				<tr>
                    <td>House no:</td>
                    <td>${cust.house_no}</td>
                </tr>
				<tr>
                    <td>City:</td>
                    <td>${cust.city}</td>
                </tr>
				<tr>
                    <td>State:</td>
                    <td>${cust.state}</td>
                </tr>
				<tr>
                    <td>Pincode:</td>
                    <td>${cust.pincode}</td>
                </tr>
            </table>
<!-- Click here to view the session attributes -->
  
  <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <a href="${contextPath}/info">session data</a>
</div>
</div>
</body>
</html>