<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="h2.css">


</head>
<body>
<h3>STUDENT REGISTRATION FORM</h3>

<form action="register" method="POST">
<table align="center" cellpadding = "10">
 
<!----- First Name ---------------------------------------------------------->
<tr>
<td>FIRST NAME</td>
<td><input type="text" name="First_Name" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!----- Last Name ---------------------------------------------------------->
<tr>
<td>LAST NAME</td>
<td><input type="text" name="Last_Name" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!----- Date Of Birth -------------------------------------------------------->
<tr>
<td>DATE OF BIRTH</td>
<td><input type="date" name="bday" />
(enter date in YYYY-MM-DD)
 </td>
<td>

</tr>
 
<!----- Email Id ---------------------------------------------------------->
<tr>
<td>EMAIL ID</td>
<td><input type="text" name="Email_Id" maxlength="100" /></td>
</tr>
 
<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>MOBILE NUMBER</td>
<td>
<input type="text" name="Mobile_Number" maxlength="10" />
(10 digit number)
</td>
</tr>
 
<!----- Gender ----------------------------------------------------------->
<tr>
<td>GENDER</td>
<td>
Male <input type="radio" name="Gender" value="Male" />
Female <input type="radio" name="Gender" value="Female" />
</td>
</tr>
 
<!----- Address ---------------------------------------------------------->
<tr>
<td>ADDRESS <br /><br /><br /></td>
<td><textarea name="Address" rows="4" cols="30"></textarea></td>
</tr>
 
<!----- City ---------------------------------------------------------->
<tr>
<td>CITY</td>
<td><input type="text" name="City" maxlength="30" />
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!----- Pin Code ---------------------------------------------------------->
<tr>
<td>PIN CODE</td>
<td><input type="text" name="Pin_Code" maxlength="6" />
(6 digit number)
</td>
</tr>
 
<!----- State ---------------------------------------------------------->
<tr>
<td>STATE</td>
<td><input type="text" name="State" maxlength="30" />
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!----- Country ---------------------------------------------------------->
<tr>
<td>COUNTRY</td>
<td><input type="text" name="Country" value="India" readonly="readonly" /></td>
</tr>
 

 
<!----- Qualification---------------------------------------------------------->
<tr>
<td>Percentage</td>
<td><input type="text" name="percentage" maxlength="30" />
 (please enter higest qualification percentage)
</td>
</tr>
 
<!----- Course ---------------------------------------------------------->
<tr>
<td>COURSES<br />APPLIED FOR</td>
<td>
BCA
<input type="radio" name="Course" value="BCA">
B.Com
<input type="radio" name="Course" value="B.Com">
B.Sc
<input type="radio" name="Course" value="B.Sc">
B.A
<input type="radio" name="Course" value="B.A">
B.Tech
<input type="radio" name="Course" value="B.Tech">
</td>
</tr>
<!--------------------------if btech---------------------------->
<tr>
<td>Select Stream</td>
<td>
CSE
<input type="radio" name="Stream" value="Cse">
B.Com
<input type="radio" name="Stream" value="EEE">
B.Sc
<input type="radio" name="Stream" value="ECE">
B.A
<input type="radio" name="Stream" value="MECH">
B.Tech
<input type="radio" name="Stream" value="CIVIL">
(if course is Btech)
</td>
</tr>
 
<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form>

</body>
</html>