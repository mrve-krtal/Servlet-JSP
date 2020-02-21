<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${fn:toUpperCase("test")}
<br>
<c:set var="sessionAttribute" scope="session" value="my session value"/>

${fn:contains(sessionAttribute,"my")}

<br>

	<%
		String[] myArray={"test1"," test2"," test3"};
		request.setAttribute("myArrays",myArray);
	
	%>
	
	${fn:join(myArrays,';')}

</body>
</html>