<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Integer a=(Integer)request.getAttribute("statusobj");
%>
<div align="center">
<h1> <%=a%>Not Found</h1>


</div>


</body>
</html>