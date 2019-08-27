<%@page import="com.college.web.model.Applicant"%>
<%@page import="com.college.web.service.ApplicantServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="com.college.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
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
	border-right: 1px solid #bbb;
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

li
 
a
:hover
:not
 
(
.active
 
)
{
background-color
:
 
#111
;


}
.active {
	background-color: #4CAF50;
}
</style>

</head>
<body>
	<%
		List<Applicant> aa=(List<Applicant>)request.getAttribute("dis");
		
		
		
	%>
	
	<ul>
		<li><a href="Adminhome.jsp"">AdminHome</a></li>
		<li><a href="#contact">Maintenance</a></li>
		<li style="float: right"><a
			href="<%=request.getContextPath()%>//AdminLogout">logout</a></li>
	</ul>



	<div style="top: 150px">
		<table class="table table-dark" border="1"  >
			<thead>
				<tr>
					<th scope="col">application id</th>
					<th scope="col">Firstname</th>
					<th scope="col">Lastname</th>
					<th scope="col">Email</th>
					<th scope="col">Mobile</th>
					<th scope="col">Percentage</th>
					<th scope="col">Course</th>
					<th scope="col">Stream</th>
					<th scope="col">Approve</th>
					<th scope="col">Reject</th>

			
				
			<tbody>
			
			<tr>
			<td>
		</td>
			
			
			</tr>
				
			</tbody>
			</thead>
		</table>




	</div>
	<%= aa %>



</body>
</html>