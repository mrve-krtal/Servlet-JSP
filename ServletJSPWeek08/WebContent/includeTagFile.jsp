<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="myTag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<myTag:header> test test test bunlar iki tag arasına yazılsa dahi göstermez. </myTag:header>

<myTag:headar2 title="my title value"></myTag:headar2>

<myTag:header3>
	it is works!
</myTag:header3>

</body>
</html>