<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Update COURSE</h1></center>
<div class="boxed">
<form action="CourseUpdateController" method="post">
<table align="center" cellpadding = "10" border="1">
<tr>
<td>COURSEID:</td>
<td><input type="text" value="<%=request.getParameter("cid") %>" name="cid" ></td>
</tr>
<tr>
<td>COURSE NAME:</td>
<td><input type="text" value="<%=request.getParameter("cname") %>" name="cname"><br></td>
</tr>
<tr>
<td>FACULTY NAME:</td>
<td><input type="text"  value="<%=request.getParameter("fname") %>" name="fname"></td>
</tr>
<tr>
<td>TIME:</td>
<td><input type="text"  value="<%=request.getParameter("time") %>" name="time"></td>
</tr>

<tr>
<td><input  type="hidden">

<td><input type="submit" value="update"></td>
</tr>
<tr>
<td><input  type="hidden"> 
<td><input type="reset" value="reset"></td>


</tr>



</table>

</form>

</div>



</body>
</html>