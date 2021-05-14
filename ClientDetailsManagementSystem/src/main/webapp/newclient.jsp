<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
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
<form action="newclient.do" method="post">
<h3>
<tr>
<td>Organisation Name:</td>
<td><input type="text" name="orgname"></td>
</tr>
</h3>
<h3>
<tr>
<td>Contact Name:</td>
<td><input type="text" name="contactname"></td>
</tr>
</h3>
<h3>
<tr>
<td>Contact Phone Number:</td>
<td><input type="text" name="phone"></td>
</tr>
</h3>
<h3>
<tr>
<td>Address:</td>
<td><input type="text" name="address"></td>
</tr>
</h3>
<h3>
<tr>
<td>Type Of Buisness:</td>
<td><input type="text" name="buisnesstype"></td>
</tr>
</h3>
<h3>
<tr>
<td>Type Of Service Required:</td>
</tr>
<tr>
<td>
<select name="reqdservice">
<option value="Select">Select</option>
<option value="PermanentGuards">Permanent Guards</option>
<option value="NightGuards">Night Guards</option>
<option value="PatrolByGuards">Patrol By Guards</option>
</select>
</td>
</tr>

<h2>
<tr>
<td><input type="submit" value="Submit"/></td>
</tr>
</h2>

</h3>
</form>
</center>
</body>
</html>