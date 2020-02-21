<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List, java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- HTML YORUM SATIRI  --> 
<body>

<%
//Jsp scriptlet
System.out.println("Scriptlen..");
for(int i=0;i<5;i++){
	System.out.println("i:"+i);
	out.println("i: "+i);
}
%>
<br>

<% String username="test user"; %>
<%=username %>

<br>

<%! 
	public int add(int number1, int number2){
			return number1+number2;
	//JSP Declaration ile metot tanımı yapmak doğru değil. Genel olarak kullanımı böyle.
}
	
%>
<%=add(10,20) %>

</body>
</html>