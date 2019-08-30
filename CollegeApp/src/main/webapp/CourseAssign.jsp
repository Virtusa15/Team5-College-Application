<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.boxed {
  

 align:center;


}



</style>


</head>
<body>
<center><h1>ADD COURSE</h1></center>
<div class="boxed">
<form action="updatecourse">
<table align="center" cellpadding = "10" border="1">
<tr>
<td>COURSEID:</td>
<td><input type="text" name="cid" ></td>
</tr>
<tr>
<td>COURSE NAME:</td>
<td><input type="text" name="cname"><br></td>
</tr>
<tr>
<td>FACULTY NAME:</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>TIME:</td>
<td><input type="text" name="cid"></td>
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