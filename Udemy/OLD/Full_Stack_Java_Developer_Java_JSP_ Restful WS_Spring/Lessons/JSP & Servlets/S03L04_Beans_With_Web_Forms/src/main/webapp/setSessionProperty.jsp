<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.lessons.beans.User" scope="session"></jsp:useBean>
<form action="getSessionProperty.jsp" method="post">
First Name : <input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/>'><br/>
Last Name : <input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>'><br/>
<input type="submit" value = "Submit">
</form>
</body>
<%-- A bean is an encapsulated data set of independent properties, objects. By using beans, it becomes easier for the developer
to send or receive information. In the case of a big application where the information needs to be passed to multiple files, beans can be very useful
 --%>
</html>
