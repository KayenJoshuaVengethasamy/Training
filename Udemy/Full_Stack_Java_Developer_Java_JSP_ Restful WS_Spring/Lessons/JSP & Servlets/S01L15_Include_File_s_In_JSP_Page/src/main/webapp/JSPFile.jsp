<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
</head>
<body>
	<%--There are various ways to include a file in JSP --%>
	<%-- 
Method 1 is for adding static content
When we work with the %@ symbol or the Directive element, we can include a file, but the file has to be of a static nature
If we add a file, for example, of a dynamic nature and make changes, the changes might not reflect correctly
Essentially, the content from the file will be copied and pasted onto the webpage and it will be treated as part of the JSP file itself
 
--%>
	<%@ include file="File1.txt"%>
	<br />
	<%-- Method 2 is for dynamic content--%>
	<jsp:include page="File2.txt"></jsp:include>
	<%--The reason we do not use the jsp:include all the time is because if we are adding static content, it will be pointless to continously fetch the information
over and over again. It will slow down the app --%>
</body>
</html>