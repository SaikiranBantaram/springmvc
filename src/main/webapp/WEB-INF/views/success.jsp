<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h3 class="text-center">${Header }</h3>
		<p class="text-center">${Desc }</p>
		<hr>
		<h1>Created with userid ${msg }</h1>
<h1>Welcome ${user.userName }</h1>
<h1>Your email address is ${user.email }</h1>

<h1>Your password is ${user.password }  secure your password</h1>
</body>
</html>