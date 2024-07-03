<%@ page import="java.util.Date,org.lessons.UserDefined"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
</head>
<body>
	<%--After tidying up --%>
	<%=new Date()%>
	<%
	out.print(new UserDefined().Demo());
	%>
	<%-- This is cumbersone as we have to completely declare it each and every time
<% out.print(new java.util.Date()); %>
<br/> --%>
	<%-- The directive element can help with this 
The difference between include and imports is that includes we can include a file, whereas with import we can only import type
--%>
	<%--
This will result in an error, we can import a type or user defined type
<%@ page import="java.util.Date())" %>
 --%>
	<%-- once this has been imported, we can work with it easily --%>
	<%--before tidying up
 
 
 <%@ page import="java.util.Date" %>
 <%= new Date() %>
 <br/>
 <%@ page import="org.lessons.UserDefined" %>
 <% scriptlet %>
 <% out.print(new UserDefined().Demo()); %>
 --%>
</body>
</html>