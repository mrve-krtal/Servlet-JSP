<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="_03.model.Person" %> <!-- önemli aynı zamanda class adım. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Person person=(Person)request.getAttribute("personAttribute");

%>

<%=person.getName() %>
<%=person.getSurname() %>
<%=person.getAge() %>

<br/>

<!-- scriplet ile jsp action veya jstl tagları ile kod yazmak daha temiz. -->
<!-- yukarıda ki scriplet ile aşağıda yazdığımız jsp action aynı işi yapmaktadır.-->

<jsp:useBean id="personAttribute" class="_03.model.Person" scope="request"/>

<jsp:getProperty property="name" name="personAttribute"/> <!-- property alanında ulaşmak istediğimiz instance variable veriyoruz. Name alanı ise useBean'deki id oluyor bu şekilde band ediyoruz.-->
<jsp:getProperty property="surname" name="personAttribute"/>
<jsp:getProperty property="age" name="personAttribute"/>

<br/>

<jsp:useBean id="noBean" class="_03.model.Person" scope="request"/>

<jsp:setProperty property="name" name="noBean" value="admin name"/>
<jsp:setProperty property="surname" name="noBean" value="admin surname"/>
<jsp:setProperty property="age" name="noBean" value="25"/>

<jsp:getProperty property="name" name="noBean"/>
<jsp:getProperty property="surname" name="noBean"/>
<jsp:getProperty property="age" name="noBean"/>


</body>
</html>