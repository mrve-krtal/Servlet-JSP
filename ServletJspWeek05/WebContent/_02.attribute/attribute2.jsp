<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- JSP EXCEPTION İLE YAZDIRALIM.. -->
<%=session.getAttribute("setAttribute1")%>
<br>
<%=request.getAttribute("requestAttribute")%>
<br>
<%=application.getAttribute("applicationAttribute")%>
<br>
<%=pageContext.getAttribute("key")%>

</body>
</html>