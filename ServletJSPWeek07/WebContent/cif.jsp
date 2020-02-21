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

<%--

== 	eq
!= ne
< It
<= le
> gt
>= ge
&& and
|| or
! not

 --%>


<c:set var="point" value="70"></c:set>

<c:if test="${point gt 60}">
	<h1>Başarılı</h1>
</c:if>


<c:if test="${point <= 40}">
	<h1>BAŞARISIZ</h1>
</c:if>


<!--   

<c:if test="${point le 60}">
	<h1>BAŞARISIZ</h1>
</c:if> 

<c:if test="${point < 60}">
	<h1>Başarılı</h1>
</c:if>

-->



</body>
</html>