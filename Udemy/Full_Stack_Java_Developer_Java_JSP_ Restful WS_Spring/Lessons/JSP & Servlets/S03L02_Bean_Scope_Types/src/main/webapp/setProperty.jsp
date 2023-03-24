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
*scope defines the availability of the bean and visibility of the bean
*session is based on browsing session. If a new browser session is to be created, then a new bean would be created in the background
*application has an impact on the entire application. A bean could be shared throughout the entire application. This scope is the widest of all. 
Whenever we create a bean with this scope, only a single bean would be created and the bean would be accessed and used within the application
*page scope is specific to the webpage. It will not have an impact on other pages. If we wish to change values on another page, it will not work. The values have to be on the same page
Whenever the page scope is used, a single bean is created per page only 
 --%>
<jsp:useBean id="user" class="org.lessons.beans.User" scope="session"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Kayen"/>
<jsp:setProperty property="lastName" name="user" value="Vengethasamy"/>
Values have been set
</body>
</html>