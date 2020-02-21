<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
pageContext.setAttribute("myAttribute", "page scope myAttribute",PageContext.PAGE_SCOPE);
%>

<p>${myAttribute}</p>
<p>${requestScope.myAttribute}</p>
<p>${sessionScope.myAttribute}</p>
<p>${applicationScope.myAttribute}</p>
<p>${pageScope.myAttribute}</p>


<%--
page scope -> request scope ->session scope -> application scope oncelik sırası vardır.
 --%>

</body>
</html>