<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LavenderBlush">
<center>
<h1> Welcome To SafeAsBeans</h1>
<h2> Register Here:</h2>
<font color=red size=5>${MSG}</font>
<form action="register.do" method="post">
<h3>
<tr>
<td>Full Name</td>
<td><input type="text" name="name"></td>
</tr>
</h3>
<h3>
<tr>
<td>Email</td>
<td><input type="text" name="email"></td>
</tr>
</h3>
<h3>
<tr>
<td>Password</td>
<td><input type="text" name="password"></td>
</tr>
</h3>
<h3>
<tr>
<td colspan="4" align="center" ><input type="submit" value="Register" ></td>
</tr>
</h3>
</form>
</center>
</body>
</html>