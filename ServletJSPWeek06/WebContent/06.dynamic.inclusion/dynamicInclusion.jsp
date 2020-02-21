<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="includeMe.jsp"></jsp:include>

<!-- <jsp:include page="/includeServlet"/>  -->


<br/>

<%
pageContext.include("/includeServlet");
%>

<br/>
<br/>

<%
RequestDispatcher dispacther=request.getRequestDispatcher("/includeServlet");
dispacther.include(request, response);
%>

<br/>
</body>
</html>