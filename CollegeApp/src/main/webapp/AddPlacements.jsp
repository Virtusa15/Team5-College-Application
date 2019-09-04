<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>ADD PLACEMENS</h1></center>
<div class="boxed">
<form action="addPlacement" method="post">
<table align="center" cellpadding = "10" border="1">
<tr>
<td>COMPANY NAME:</td>
<td><input type="text" name="cname" ></td>
</tr>
<tr>
<td>CTC:</td>
<td><input type="text" name="ctc"><br></td>
</tr>
<tr>
<td>COMPANY LOCATION:</td>
<td><input type="text" name="cloc"></td>
</tr>
<tr>
<td>ROLE</td>
<td><input type="text" name="role"></td>
</tr>
<tr>
<td>Event time</td>
<td><input type="text" name="time"></td>
</tr>

<tr>
<td><input  type="hidden">

<td><input type="submit" value="addcourse"></td>
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