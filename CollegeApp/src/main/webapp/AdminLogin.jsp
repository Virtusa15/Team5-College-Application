<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  align="center">


<h1>ADMIN LOGIN</h1>
</div>

<div >
<form action="AdminLoginController" method="post">
<table align="center" cellpadding = "10">
<tr>
<td>Admin id:</td>
<td><input type="text" name="aid"></td>
</tr>
<tr>
<td>Admin name:</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="pass"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Login">
<input type="reset" value="Reset">
</td>
</tr>







</table>





</form>




</div>


</body>
</html>