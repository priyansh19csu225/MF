<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/my-test.css"
    rel="stylesheet">

<title>HELLO CUSTOMER</title>
</head>
<body>
<h1>User profile Page</h1>
  <table>
    <tr>
      <td>First Name</td>
      <td>${cust.names}</td>
    </tr>
    <tr>
      <td>Phone no</td>
      <td>${cust.getPhno()}</td>
    </tr>
    <tr>
      <td>Email</td>
      <td>${cust.email}</td>
    </tr>
  </table>

</body>
</html>