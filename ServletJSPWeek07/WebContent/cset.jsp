<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="sessionAttribute" scope="session" value="my session value"></c:set>
<c:out value="${sessionAttribute}" ></c:out>

<br>
<%

java.util.Map map=new java.util.HashMap();
request.setAttribute("myMap", map);
%>

<c:set target="${myMap}" property="key1" value="value1"></c:set>
<c:set target="${myMap}" property="key2" value="value2"></c:set>
<c:set target="${myMap}" property="key3" value="value3"></c:set>

<c:out value="${myMap.key1}"></c:out>
${myMap.key2}
${myMap.key3}


</body>
</html>