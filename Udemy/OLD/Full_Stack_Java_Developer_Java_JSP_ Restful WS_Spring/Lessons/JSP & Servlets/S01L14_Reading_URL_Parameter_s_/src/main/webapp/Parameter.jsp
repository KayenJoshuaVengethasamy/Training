<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
<%--The exact same as the ParameterServlet.java file --%>
<%

out.println("Value 1 : "+request.getParameter("getValue1"));
out.println("Value 2 : "+request.getParameter("getValue2"));

%>
</body>
</html>