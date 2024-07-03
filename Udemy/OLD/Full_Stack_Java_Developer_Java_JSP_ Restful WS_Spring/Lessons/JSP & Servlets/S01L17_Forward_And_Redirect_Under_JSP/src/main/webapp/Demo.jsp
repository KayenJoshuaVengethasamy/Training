<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
	It's from the original file
	<%--As the name suggests, we simply forward the file from the current to a new file
	The file that forwards the request would be inbetween
	Whenever the programmer does not want to expose the original source of the file, make use of jsp:forward
	<jsp:forward page="Forward.jsp"></jsp:forward>
	--%>
	<%--using generic piece of code for redirecting --%>
	<%
	//request.getRequestDispatcher("Forward.jsp").forward(request, response);
	response.sendRedirect("Redirect.jsp");
	%>
</body>
</html>