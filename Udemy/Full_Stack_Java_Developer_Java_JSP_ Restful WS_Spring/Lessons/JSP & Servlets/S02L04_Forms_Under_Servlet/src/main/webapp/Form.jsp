<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/Controller" method="get">
		Full name : <input type="text" name="name"><br /> Gender : <input
			type="radio" name="gender" value="male">Male <input
			type="radio" name="gender" value="female">Female <br />
		Languages known : <input type="checkbox" name="language"
			value="english">English <input type="checkbox"
			name="language" value="hindi">Hindi <input type="checkbox"
			name="language" value="french">French <br /> Country : <select
			name="country">
			<option value="south africa">South Africa</option>
			<option value="india">India</option>
			<option value="canada">Canada</option>
			<option value="UK">UK</option>
			<option value="fiji">Fiji</option>
		</select><br /> <input type="submit" value="Submit">
	</form>

</body>
</html>