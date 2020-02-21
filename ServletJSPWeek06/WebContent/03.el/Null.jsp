<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${none} <%-- ilgili attribute yoksa hata vermez, çıktı vermez --%>

${none.property} <%-- Birincisi varsa ikinci property yoksa yada yanlış yazdıysak hata alıyoruz. aksi halde hata almıyoruz.  --%>

${10+number} <%-- 0 olarak değerlendirilir. çarpma bölme de hata vermez iken mod işleminde hata verir. --%>
${10/number}
${10-number}

<%-- ${10%number}  java.lang.ArithmeticException: / by zero hatası verecektir. --%>

${true and none} <%-- none false değer olduğu için and operatöründen dolayı false döndürecektir. --%>

<%-- Boolean bir değerde de false dönecektir. --%>


</body>
</html>