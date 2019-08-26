<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="ApplicationsView.jsp">Applications</a></li>
      <li><a href="#">ExamSchedule</a></li>
      <li><a href="#">View</a></li>
    </ul>
  </div>
</nav>
<% 
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 

if(session.getAttribute("user")==null)
	response.sendRedirect("AdminLogin.jsp");

String user=(String)session.getAttribute("user");

%>

<h1>welcome  <%= user %></h1> 
  


</body>
</html>