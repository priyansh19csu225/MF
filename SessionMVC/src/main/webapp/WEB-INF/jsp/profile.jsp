<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<spring:url value="/resources/css/myCSS.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<title>User Profile | MVC</title>
</head>
<body>
	
	<div class="header">
	<h1 style="text-align:center;"> USER PROFILE PAGE 1 </h1>
	</div>
	
	<div class="details">
	 Name : ${user.name } <br>
	 Age : ${user.age }	<br>
	 Registered E-mail : ${user.email } <br>
	 City : ${user.city } <br>
	 State : ${user.state } <br>
	 Interest : ${user.interest } <br>
	</div>
	
</body>
</html>