<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="_01.expression.language.model.Employee" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

((Employee)request.getAttribute("myEmployee")).getDepartment().getDepartmentName();

%>
<p>${myEmployee.ad}</p>
<p>${myEmployee.department.departmentName}</p>

<!-- NOKTA OPERATORUNUN KULLANIMI -->
<p>${myMap.key1}</p>
<p>${myMap.key2}</p>
<p>${myMap.key3}</p>

<!-- PARANTEZ OPERATORUNUN KULLANIMI -->
<p>${myAtrribute}</p>


</body>
</html>