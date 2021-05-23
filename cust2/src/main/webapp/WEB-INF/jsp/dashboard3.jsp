<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
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
<h1>Your Details have been saved:</h1>
<>
  
  <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <a href="${contextPath}/seeDetail">see your details</a>
  <a href="${contextPath}/info">session data</a>
</div>
</div>
</body>
</html>