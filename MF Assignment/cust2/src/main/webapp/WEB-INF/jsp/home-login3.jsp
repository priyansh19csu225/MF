<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/my-test2.css"
    rel="stylesheet">
<link href="resources/image/download.jpg"
    rel="stylesheet">
<title>HELLO CUSTOMER</title>
<style>
		.error {color:red}
	</style>
</head>
<body>

<div class="form-style-10" align="center">
<h1>Customer Info Page </h1>
<div >
		<br>
		
		
			<h4><spring:message code="welcome.message" /></h4>
		<br>
		<a id="en" href="home?lang=en">English</a> | <a id="fr" href="home?lang=fr">French</a> | <a id="hn" href="home?lang=hn">Hindi</a>
		<div>&nbsp;</div>
		<hr>
	</div>

<form:form action="login" method="post" modelAttribute="CustModel">
       <div class="inner-wrap">
            <table border="0">
                <tr>
                    <td>Customer Name:</td>
                    <td><form:input type="text" path="names"  />
<form:errors path="names" cssClass="error" /></td>
                </tr>
<tr>
                    <td>Course Code:</td>
                    <td><form:input type="text" path="courseCode"  />
<form:errors path="courseCode" cssClass="error" /></td>
                </tr>
<tr>
                    <td>Password :</td>
                    <td><form:input type="text" path="password"  />
<form:errors path="password" cssClass="error" /></td>
                </tr>
                <tr>
                    <td>Phone no:</td>
                    <td><form:input type="text" path="Phno" />
<form:errors path="Phno" cssClass="error" /></td>
                </tr>

				<img src="resources/image/download.jpg" align="left" alt="Customer">
                <tr>
                    <td>E-mail:</td>
                    <td><form:input type="text" path="email" />
<form:errors path="email" cssClass="error" /></td>
                </tr>
                <tr>
                    <td>Aadhar no:</td>
                    <td><form:input type="number" path="aadharNo" /></td>
                </tr>
                <tr>
                    <td>Sex:</td>
                    <td>Male: <form:radiobutton path="sex" value="M" required="required"/>
Female: <form:radiobutton path="sex" value="F"/></td>
                </tr>
                <tr>
				<tr>
                    <td>House no:</td>
                    <td><form:input path="house_no" /></td>
                </tr>
				<tr>
                    <td>City:</td>
                    <td><form:input path="city" /></td>
                </tr>
				<tr>
                    <td>State:</td>
                    <td><form:select path="state">
		<form:option value="Haryana" label="Haryana"/>  
        <form:option value="Rajasthan" label="Rajasthan"/>  
        <form:option value="Uttarakhand" label="Uttarakhand"/>  
        <form:option value="UP" label="UP"/>
        </form:select>
          </td>
                </tr>
				<tr>
                    <td>Pincode:</td>
                    <td><form:input type="number" path="pincode"  /></td>
                </tr>
                    <td colspan="2" align="center"><input type="submit" value="SUBMIT" /></td>
                </tr>
            </table> 
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<a href="${contextPath}/info">session data</a>
</div>
</form:form>
</div>
</body>
</html>