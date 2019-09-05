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
response.setIntHeader("Refresh", 2);
AdminLoginService services=new AdminLoginService();
List<PlacementDetails> pd=services.getAllPlacements();

%>

</body>

<div class="jumbotron jumbotron-red">
  <div class="container">
   <h1><center>All Placements</center></h1> 
  </div>
</div>
<div style="top: 150px">
		<table class="table table-dark" border="1">
			<thead>
				<tr>
					
					<th scope="col">Company Name</th>
					<th scope="col">CTC</th>
					<th scope="col">Company Location</th>
					<th scope="col"> Role</th>
				      <th scope="col">Time</th>
				      <th scope="col">Action</th>
					
				
						</thead>
			<tbody>
				<%
					for (PlacementDetails dr : pd) {
				%>

				<tr>
					<td><%=dr.getCompany_name()%></td>
					<td><%=dr.getCTC()%></td>
					<td><%=dr.getCompany_location()%></td>
					<td><%=dr.getRole()%></td>
					<td><%=dr.getEvent_time() %>
				
					<td>
						<form action="deleteplacement" method="Post">

							<input type="hidden" name="sno"
								value="<%=dr.getSno() %>"> 
								 
								
								
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






</html>