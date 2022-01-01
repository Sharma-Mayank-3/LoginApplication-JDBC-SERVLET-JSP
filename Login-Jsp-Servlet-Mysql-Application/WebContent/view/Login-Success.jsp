<%@page import="com.login.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to the Application...</title>
</head>
<body>
	<% Employee employee = (Employee)request.getAttribute("employee"); %>
	welcome Mr <br>
	<%=employee.getUserNAme() %><br>
	<%=employee.getAddress() %><br>
	<%=employee.getAge() %><br>
	
</body>
</html>