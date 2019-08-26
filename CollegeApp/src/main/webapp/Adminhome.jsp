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
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 

if(session.getAttribute("user")==null)
	response.sendRedirect("AdminLogin.jsp");

String user=(String)session.getAttribute("user");

%>
<h1>welcome  <%= user %></h1>   
<form action="AdminLogout">


</form><input type="submit" value="logout" style="background-color: Silver; height: 35px; width: 51px">

</body>
</html>