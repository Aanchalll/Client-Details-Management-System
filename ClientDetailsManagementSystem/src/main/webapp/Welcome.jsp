<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Cornsilk">
<center>
<h1> Welcome To SafeAsBeans</h1>
<h2> Login Here:</h2>
<font color=red size=5>${MSG}</font>
<form action="login.do" method="post">
<h3>
<tr>
<td>UserName(Email)</td>
<td><input type="text" name="username"></td>
</tr>
</h3>

<h3><tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr></h3>

<h3><tr>
<td align="center"><input type="submit" value="login"></td>
</tr></h3>
</form>
<h2><a href="register.jsp">New? Register Here.</a></h2>

</center>
</body>
</html>