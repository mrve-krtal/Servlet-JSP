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

<c:out value="Hello JSTL"></c:out>

<%

request.setAttribute("username", "admin");

%>

<br>

<c:out value="${username}"></c:out>
 
<br>
 

<br>

<%="<h1> h1 tag </h1>" %>

<c:out value="<h1> h1 tag </h1>"></c:out>

<br>

<c:out value="<h1> h1 tag </h1>" escapeXml="false"></c:out>


</body>
</html>