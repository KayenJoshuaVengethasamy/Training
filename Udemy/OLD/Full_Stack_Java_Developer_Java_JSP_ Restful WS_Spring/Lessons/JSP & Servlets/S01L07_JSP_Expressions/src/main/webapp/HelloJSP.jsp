<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1>HELLO JSP</h1>
	<%--Expression examples--%>
	<%--
	Whenever there is a single line or something small calculation, operation, expressions are used.
	Moreover, whenever you would like to call a method again, it can be used.
	Finally, in order to display the value of a variable an expression can be used 
	 --%>
	<%--
	This will crash
	<%= int x = 22  %>
	 --%>
	<%--This will work --%>
	<%!public int x = 22;%>
	<%=x%>
	<br />
	<%=new Integer(22)%>
	<br />
	<%=new String("Kayen")%>
	<br />
	<%=new java.util.Date()%>
	<br />
	<%=25 * 4%>
	<br />
	<%=25 > 4%>
</body>
</html>