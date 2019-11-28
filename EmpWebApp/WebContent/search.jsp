<%@page import="com.ust.webapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");
%>
<body>
	<a href='./home'>home</a>
	<a style='float: right' href='./logout'>logout</a>
	<%if(info!=null) { %>
	<fieldset>
	<legend>Employee Info</legend>
	<table align='center' border='1'>

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<tr>
			<td><%=info.getId() %><</td>
			<td><%=info.getName() %></td>
			<td><%=info.getEmail() %></td>
		</tr>
		</fieldset>
	</table>
	<%} else { %>
	<h1>No data found </h1>
	<%} %>
</body>
</html>