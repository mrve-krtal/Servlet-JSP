<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="salary" value="20000"></c:set>

<c:choose >

	<c:when test="${salary<1000}">
		<p>Low salary</p>
	</c:when>
	
	<c:when test="${salary<10000}">
		<p>Good Salary</p>
	</c:when>
	
	<c:otherwise>
		<p>GREAT SALARY :) </p>
	</c:otherwise>
</c:choose>

</body>
</html>