<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
                    <td>${names}</td>
                </tr>
               
<img src="resources/image/download.jpg" align="left" alt="Customer">
                <tr>
                    <td>E-mail:</td>
                    <td>${email}</td>
                </tr>
                
            </table>
</div>
</div>
</body>
</html>