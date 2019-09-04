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
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
  border-right:1px solid #bbb;
}

li:last-child {
  border-right: none;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
</style>
</head>
<body>


<% 
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 

if(session.getAttribute("user")==null)
	response.sendRedirect("AdminLogin.jsp");

String user=(String)session.getAttribute("user");
session.setAttribute("user", user);

%>
<ul>
  <li><a href="<%=request.getContextPath()%>//ApplicantViewController">Applicationsview</a></li>
  <li><a href="CourseAssign.jsp">CourseAssign</a></li>
  <li><a href="ViewCourses.jsp">ViewCourses</a></li>
  <li><a href="AddPlacements.jsp">AddPlacements</a></li>
  <li><a href="ViewPlacements.jsp">ViewPlacements</a></li>
  <li><a href="#contact">ViewFaculty</a></li>
  
  
 
  <li style="float:right"><a href="<%=request.getContextPath()%>//AdminLogout">logout</a></li>
</ul>


<div class="jumbotron jumbotron-fluid">
  <div class="container">
   <h1>welcome  <%= user %></h1> 
  </div>
  
</div>







</body>
</html>