<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Login Application</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/LoginServlet" method="post">
	<br>
	userName : <input type="text" name="userName"><br>
	password : <input type="password" name="password"><br>
	<input type="submit" name="submit">
	</form>
</body>
</html>