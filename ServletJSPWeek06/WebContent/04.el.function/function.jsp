<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="h" uri="testURI" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		${h:myFunction(10,20)} <br />
		
		${h:myFunction2(10,20)} <br /> 
		
		<!--   ${h:myFunction3(10,20)} <br />  -->
		
	</p>
	
	

</body>
</html>