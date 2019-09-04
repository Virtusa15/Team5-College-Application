<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.college.web.service.AdminLoginService"%>
     <%@page import="com.college.web.model.Courses"%>
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

</head>
<body>
<%
AdminLoginService al=new AdminLoginService();
List<Courses> courses=al.viewAllCourses();
%>

<div class="jumbotron jumbotron-red">
  <div class="container">
   <h1><center>TotalCourses</center></h1> 
  </div>
</div>


<div style="top: 150px">
		<table class="table table-dark" border="1">
			<thead>
				<tr>
					<th scope="col">Course  id</th>
					<th scope="col">Course Name</th>
					<th scope="col">Faculty Name</th>
					<th scope="col"> Time</th>
					<th scope="col"> update</th>
				      <th scope="col">delete</th>
					
				
						</thead>
			<tbody>
				<%
					for (Courses dr : courses) {
				%>

				<tr>
					<td><%=dr.getCourseid()%></td>
					<td><%=dr.getCourse_Name()%></td>
					<td><%=dr.getFaculty_Name()%></td>
					<td><%=dr.getTime()%></td>
				
					<td>
						<form action="UpdateCourse.jsp" method="Post">

							<input type="hidden" name="cid"
								value="<%=dr.getCourseid() %>"> 
									<input type="hidden" name="cname"
								value="<%=dr.getCourse_Name() %>"> 
									<input type="hidden" name="fname"
								value="<%=dr.getFaculty_Name() %>"> 
									<input type="hidden" name="time"
								value="<%=dr.getTime()%>"> 
								
								
								<input type="submit" value="update">





						</form>





					</td>
					<td>
						<form action="DeleteCourse" method="Post">

							<input type="hidden" name="cid"
								value="<%=dr.getCourseid() %>"> 
									
								
								
								<input type="submit" value="delete">





						</form>





					</td>
					

			








				</tr>
				<%
					}
				%>

			</tbody>
		
		</table>




	</div>




</body>
</html>