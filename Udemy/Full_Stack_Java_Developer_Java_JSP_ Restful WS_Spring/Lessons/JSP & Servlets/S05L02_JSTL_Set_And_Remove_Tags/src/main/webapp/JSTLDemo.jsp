<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- In order to use JSTL tags, we need to import JSTL taglibs, which is similar to import -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
<c:set var="name" value="Kayen"></c:set>
<!-- This will not display the name variable but rather the actual word 'name'. The value of 'value'
<c:out value="name"></c:out>
It is good practice to make use of the expression element when using the out tag-->
<c:out value="${name}"></c:out>
<!-- Also valid -->
${name}
<!-- This will remove the variable from memory -->
<c:remove var="name"/>
<!-- This will not display anything -->
${name}
<!-- Expression language is nothing but a set of expressions which can help us to speed up our work -->
${param.msg}
</body>
</html>