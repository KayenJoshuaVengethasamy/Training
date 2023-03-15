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
	<%
	int x = 25;
	out.println(x);
	if (x > 25) {
		out.println("X is greater than 25");
	} else {

		out.println("X is less than 25");
	}
	
	for(int i = 0; i< 10; i++){
		out.print("<br/>");
		out.print(i);
	}
	%>
	<%=x%>
</body>
</html>