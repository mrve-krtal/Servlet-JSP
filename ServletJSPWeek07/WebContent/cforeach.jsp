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

<c:forEach var="i" begin="1" end="10">

	<c:out value="${i}"/>

</c:forEach>

<%

int numbers[]={10,20,30,40,50,6,5,4,3,100};
request.setAttribute("myNumbers", numbers);

%>

<br> <br>

<c:forEach var="n" items="${myNumbers}" varStatus="status">
	${status.index} : <c:out value="${n}"></c:out> <br>
</c:forEach>

<br><br>

<% 
java.util.List myList=new java.util.ArrayList();
myList.add("element1");
myList.add("element2");
myList.add("element3");
myList.add("element4");

session.setAttribute("myList",myList);
%>
	
	<c:forEach var="e" items="${myList}">
		${e}
	</c:forEach>

<br> <br>

<% 
java.util.Map myMap=new java.util.HashMap();
myMap.put("key1","value1");
myMap.put("key2","value2");
myMap.put("key3","value3");

session.setAttribute("myMaps",myMap);
%>
	
	<c:forEach var="maps" items="${myMaps}">
		${maps.key}, ${maps.value} <br>
	</c:forEach>

<br><br>









</body>
</html>