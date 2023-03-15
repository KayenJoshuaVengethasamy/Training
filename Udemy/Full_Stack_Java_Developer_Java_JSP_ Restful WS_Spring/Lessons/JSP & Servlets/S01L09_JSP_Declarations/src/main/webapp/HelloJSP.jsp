<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%--
	 This will crash
	 Scriptlets cannot use accessors
	 In declarations, we can make use of accessors
	 This is minor, but the most important, the declaration is used to declare methods
	<% public int x = 33;%> 
	 --%>
	<%!public int x = 33;%>
	<%!String message(int x) {
	return "I love JSP" + x;
}%>
	<%=x%>
	<%=message(x)%>
</body>
</html>