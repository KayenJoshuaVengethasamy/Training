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
	<%--java comments cannot be used in expressions, it can only be used in scriptlets
	<%= //x %>
	HTML comments can be used as well like normal. This is not reliable because it only prevents printable characters from 
	being shown. Whereas if there is a method call or unprintable characters, there will be no impact
	Always rely on JSP comments in a JSP page
	<!-- <%
	int x = 52;
	/*out.print("Value of X : ");
	out.print(x);*/
	%> -->
	<!-- 	<%=x%> -->
	
	 --%>
	 <!-- Despite being commented out, this will redirect to google -->
	<!-- <%	response.sendRedirect("Https://google.co.za");%>-->
	
</body>
</html>