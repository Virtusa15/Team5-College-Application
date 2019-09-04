<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.college.web.service.AdminLoginService"%>
     <%@page import="com.college.web.model.PlacementDetails"%>
     <%@ page import="com.college.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminLoginService sevices=new AdminLoginService();
List<PlacementDetails> pd=services.getAllPlacements();


%>

</body>
</html>