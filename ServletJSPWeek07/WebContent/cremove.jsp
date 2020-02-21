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

<c:set var="myAttribute" scope="session" value="my session attribute"></c:set>

<c:out value="${myAttribute}"></c:out>

<br>

<c:remove var="myAttribute"/>

after c:remove<c:out value="${myAttribute}"></c:out>

</body>
</html>