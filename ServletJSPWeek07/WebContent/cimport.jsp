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

<!-- dinamik yaklaşım -->
<jsp:include page="header.html"></jsp:include>

<h2>after jsp:include</h2>

<c:import url="header.html"/>

<h2>after c:import</h2>

<!-- static yaklaşım -->
<%@include file="header.html" %>

<h2>after include file</h2>


<jsp:include page="footer.jsp"></jsp:include>
<c:import url="footer.jsp"></c:import>
<%@include file="footer.jsp" %>

<c:import url="https://mrvkrtal.blogspot.com/"></c:import>



</body>
</html>