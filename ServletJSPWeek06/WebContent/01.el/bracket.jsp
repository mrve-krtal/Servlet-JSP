<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>MAP</h1>
<p>${myMap.key1}</p>
<p>${myMap["key2"]}</p>
<p>${myMap['key3']}</p>

<h1>LIST</h1>
<p>${myList[0]}</p>
<p>${myList["1"]}</p>
<p>${myList['2']}</p>


<h1>ARRAY</h1>
<p>${myArray[0]}</p>
<p>${myArray["1"]}</p>
<p>${myArray['2']}</p>
<p>${myArray[3]}</p>
<p>${myArray[4]}</p> <!-- myArray[4] dediğimizde böyle bir property var mı ? ona bakacak. -->



</body>
</html>