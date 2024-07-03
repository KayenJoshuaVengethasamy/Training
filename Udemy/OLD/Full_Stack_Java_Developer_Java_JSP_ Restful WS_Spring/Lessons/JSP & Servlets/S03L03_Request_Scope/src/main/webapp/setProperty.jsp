<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Property</title>
</head>
<body>
<%--
*request is based on request object. whenever a jsp file is created and executed, a seperate copy of request and response object will become available for that file
The reason why we are unable to get the updated values is because when we are setting the values the request object is different
Using forwarding mechanism, we can send info to another page
 --%>
<jsp:useBean id="user" class="org.lessons.beans.User" scope="request"></jsp:useBean>
First Name : <jsp:getProperty property="firstName" name="user"/><br/>
Last Name : <jsp:getProperty property="lastName" name="user"/><br/>
<jsp:setProperty property="firstName" name="user" value="Kayen"/>
<jsp:setProperty property="lastName" name="user" value="Vengethasamy"/>
Values have been set<br/>
First Name : <jsp:getProperty property="firstName" name="user"/><br/>
Last Name : <jsp:getProperty property="lastName" name="user"/><br/>
</body>
</html>