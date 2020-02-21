<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="myPerson3" class="_04.model.Person"/>

<jsp:setProperty property="name" name="myPerson3"/>
<jsp:setProperty property="surname" name="myPerson3"/>
<jsp:setProperty property="age" name="myPerson3"/>

<jsp:getProperty property="name" name="myPerson3"/>
<jsp:getProperty property="surname" name="myPerson3"/>
<jsp:getProperty property="age" name="myPerson3"/>

<br/>

<jsp:useBean id="myPerson4" class="_04.model.Person"></jsp:useBean>
<jsp:setProperty property="*" name="myPerson4"/> <!--  *  karakteri ile bütün property'lerde ki ilhi değerleri görecek. -->

<jsp:getProperty property="name" name="myPerson4"/>
<jsp:getProperty property="surname" name="myPerson4"/>
<jsp:getProperty property="age" name="myPerson4"/>

</body>
</html>