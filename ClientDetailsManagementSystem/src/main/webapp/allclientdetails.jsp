<%@ page language="java" import="com.demo.service.UserService" 
import="com.demo.service.UserServiceImpl "
import="com.demo.to.UserTo" import ="java.util.List"
contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
  padding: 5px;
}
table {
  border-spacing: 1px;
}
</style>
</head>
<h1>Client Details</h1>
<body bgcolor="AntiqueWhite">
<table style="width:100%">
				<thead>
					<tr>
						<th>Client ID</th>
						<th>Organization Name</th>
						<th>Contact Name</th>
						<th>Phone Number</th>
						<th>Address</th>
						<th>Business Type</th>
						<th>Service Required</th>
					</tr>
				</thead>
<%
UserService service=new UserServiceImpl();
List<UserTo> list=service.getclientdetails();
%>
<tbody>
   <c:forEach var="user" items="${listUser}">
      <tr>
	        <td><c:out value="${user.clientid}" /></td>
    		<td><c:out value="${user.orgname}" /></td>
    		<td><c:out value="${user.contactname}" /></td>
			<td><c:out value="${user.phone}" /></td>
			<td><c:out value="${user.address}" /></td>
			<td><c:out value="${user.buisnesstype}" /></td>
			<td><c:out value="${user.reqdservice}" /></td>
      </tr>
    </c:forEach>
</tbody>
</table>
</body>
</html>