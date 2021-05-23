<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/my-test2.css"
    rel="stylesheet">
<link href="resources/image/download.jpg"
    rel="stylesheet">
<title>HELLO CUSTOMER</title>
</head>
<body>

<div class="form-style-10" align="center">
<h1>Customer Info Page </h1>

<form:form action="login" method="post" modelAttribute="CustModel">
       <div class="inner-wrap">
            <table border="0">
                <tr>
                    <td>Customer Name:</td>
                    <td><form:input type="text" path="names" pattern=".[A-Za-z]{1,15}" required="required" /></td>
                </tr>
                <tr>
                    <td>Phone no:</td>
                    <td><form:input type="number" path="Phno" pattern=".{10,10}" required="required"/></td>
                </tr>

				<img src="resources/image/download.jpg" align="left" alt="Customer">
                <tr>
                    <td>E-mail:</td>
                    <td><form:input type="email" path="email" required="required"/></td>
                </tr>
                <tr>
                    <td>Aadhar no:</td>
                    <td><form:input type="number" path="aadharNo" pattern=".{12,12}" required="required"/></td>
                </tr>
                <tr>
                    <td>Sex:</td>
                    <td>Male: <form:radiobutton path="sex" value="M" required="required"/>
Female: <form:radiobutton path="sex" value="F"/></td>
                </tr>
                <tr>
				<tr>
                    <td>House no:</td>
                    <td><form:input path="house_no" required="required"/></td>
                </tr>
				<tr>
                    <td>City:</td>
                    <td><form:input path="city" required="required"/></td>
                </tr>
				<tr>
                    <td>State:</td>
                    <td><form:select path="state" items="${states}" /></td>
                </tr>
				<tr>
                    <td>Pincode:</td>
                    <td><form:input type="number" path="pincode"  required="required"/></td>
                </tr>
                    <td colspan="2" align="center"><input type="submit" value="SUBMIT" /></td>
                </tr>
            </table>
</div>
</form:form>
</div>

</body>
</html>