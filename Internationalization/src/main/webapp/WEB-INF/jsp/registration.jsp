<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>

<style type="text/css">

	.error {
		color:red;
		text-align:right;
	}
	
	.message{
		color:green;
		font-size:18px;
		font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
	}
	
</style>
<link href="resources/css/my-test2.css"
    rel="stylesheet">

</head>
<body>

	<div >
		<br>
		<h1> SIGN UP FORM </h1>
		
		
	

<div >
	<form:form action="welcome" modelAttribute="Student">
	
		<p>First name : <form:input path="firstName" /></p>
		
		<p>Last name : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors></p>	
		
		<p>Course Code : <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" /></p>

		<input style="width:100px; height:30px;"type="submit" value="Submit" />
	</form:form>
</div>

			<h4><spring:message code="welcome.message" /></h4>
		
		<a id="en" href="register?lang=en">English</a> | <a id="fr" href="register?lang=fr">French</a> | <a id="hn" href="register?lang=hn">Hindi</a>
		<div>&nbsp;</div>
		<hr>
	</div>

</body>
</html>


