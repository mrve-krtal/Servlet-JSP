<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="myPerson" class="_04.model.Person"></jsp:useBean>

<jsp:setProperty property="name" name="myPerson" value='<%=request.getParameter("firstName") %>'/>
<jsp:setProperty property="surname" name="myPerson" value='<%=request.getParameter("lastName") %>'/>
<jsp:setProperty property="age" name="myPerson" value='<%=Integer.parseInt(request.getParameter("age"))%>'/>

<jsp:getProperty property="name" name="myPerson"/>
<jsp:getProperty property="surname" name="myPerson"/>
<jsp:getProperty property="age" name="myPerson"/>

<br/>
<jsp:useBean id="myPerson2" class="_04.model.Person"></jsp:useBean>

<jsp:setProperty property="name" name="myPerson2" param="firstName"/>
<jsp:setProperty property="surname" name="myPerson2" param="lastName"/>
<jsp:setProperty property="age" name="myPerson2" param="age"/>

<jsp:getProperty property="name" name="myPerson2"/>
<jsp:getProperty property="surname" name="myPerson2"/>
<jsp:getProperty property="age" name="myPerson2"/>


</body>
</html>