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

session.setAttribute("setAttribute1", 1000);
request.setAttribute("requestAttribute", 100);

application.setAttribute("applicationAttribute", "ApplicationAttributeValue");

pageContext.setAttribute("key", "value", PageContext.SESSION_SCOPE);

%>

</body>
</html>