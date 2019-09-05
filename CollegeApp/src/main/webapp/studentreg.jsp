<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT REGISTRATION FORM</title>
<script type="text/javascript">
function  ShowMtech() {
       var mba = document.getElementById("Mbavalue");      
        var mtch = document.getElementById("Mtechvalue");
  	var Btech = document.getElementById("Btechvalues");
	  var def=document.getElementById("def");
	def.style.display="none";
 	Btech.style.display =  "none";
      	mtch.style.display = "block";
	mba.style.display="none";
}

    function ShowBtech() {
       var mba = document.getElementById("Mbavalue");
       var mtch = document.getElementById("Mtechvalue");
        var Btech = document.getElementById("Btechvalues");
	  var def=document.getElementById("def");
	def.style.display="none";
  	mtch.style.display =  "none";
        Btech.style.display = "block";
	mba.style.display="none";
}

function ShowMba() {
       var mba = document.getElementById("Mbavalue");
       var mtch = document.getElementById("Mtechvalue");
        var Btech = document.getElementById("Btechvalues");
	  var def=document.getElementById("def");
	def.style.display="none";
  	mba.style.display="block";
	mtch.style.display =  "none";
        Btech.style.display = "none";

}
function m1()
{
 alert("only numbers allowed");
}
function m2()
{
  alert("only characters allowed");
}

</script>
</head>
<body>
<h2 align="center">STUDENT REGISTRATION FORM</h2>
<form action=""> 
<table align="center" cellpadding = "15">
<!----- First Name ----------------------------------->
<tr>
<td>FIRST NAME</td>
<td><input type="text" name="First_Name" maxlength="30" required onclick="m2()"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!---------------------Last Name----------------------->
<tr>
<td>LAST NAME</td>
<td><input type="text" name="Last_Name" maxlength="30" required onclick="m2()"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!------------------- Date Of Birth-------------------->
<tr>
<td>DATE OF BIRTH</td> 
<td><input type="date" name="Dob" required>
</td>
</tr>

<!-------- Student Id-------------->
<tr>
<td>STUDENT ID</td>
<td><input type="text" name="s_id" maxlength="7" required onclick="m1()">
</td>
</tr> 

<!----- Email Id ---------------------------------------------------------->
<tr>
<td>EMAIL ID</td>
<td><input type="email" name="Email_Id" maxlength="20" required /></td>
</tr>
 
<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>MOBILE NUMBER</td>
<td>
<input type="text" name="Mobile_Num" maxlength="10" required onclick="m1()" />
(10 digit number)
</td>
</tr>
 
<!----- Gender ---------------------------------------->
<tr>
<td>GENDER</td>
<td>
<input type="radio" name="Gender" value="Male" required />Male
<input type="radio" name="Gender" value="Female" required />Female
</td>
</tr>

<!--------Username------------->

<tr>
<td>USERNAME</td>
<td><input type="text" name="u_name" maxlength="10" required>
</td>
</tr>

<!---------Password---------->
<tr>
<td>PASSWORD</td>
<td><input type="password" required name"p_word" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters">
</td>
</tr>
 
<!----- Address ------------------------------------------------>
<tr>
<td>ADDRESS <br /><br /><br /></td>
<td><textarea name="Address" rows="4" cols="30" required></textarea></td>
</tr>
 
<!----- City ------------------------------------------------------>
<tr>
<td>CITY</td>
<td><input type="text" name="City" maxlength="30" required />
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!----- Pin Code ------------------------------------------------>
<tr>
<td>PIN CODE</td>
<td><input type="text" name="Pin_Code" maxlength="6" required onclick="m1()" />
(6 digit number)
</td>
</tr>
 
<!----- State ---------------------------------------------------------->
<tr>
<td>STATE</td>
<td>
<select name="states_ut" id="states_ut" required>
<option value="-1">Select</option>
<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands(UT)</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh(UT)</option>
<option value="Chattisgarh">Chattisgarh</option>
<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli(UT)</option>
<option value="Daman and Diu">Daman and Diu(UT)</option>
<option value="Delhi">Delhi(UT)</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir(UT)</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Ladakh">Ladakh(UT)</option>
<option value="Lakshadweep">Lakshadweep(UT)</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Odisha">Odisha</option>
<option value="Pondicherry">Pondicherry(UT)</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
<option value="Tripura">Tripura</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="West Bengal">West Bengal</option>
</select>
</td>
</tr>
<!---------------Country-------------------------------->
<tr>
<td>COUNTRY</td>
<td><input type="text" name="Country" value="India" readonly="readonly" /></td>
</tr>
 

 
<!----- Highest Qualification------------------------------------------->
<tr>
<td>HIGHEST QUALIFICATION</td>
<td>
<select name="degree_courses" id="degree_courses" required>
<option value="-1">Select</option>
<option value="B.Tech">Bachelor of Technology</option>
<option value="BA">Bachelor of Arts</option>
<option value="BBA">Bachelor of Businees Administration</option>
<option value="BBM">Bachelor of Businees Management</option>
<option value="BCA">Bachelor of Computer Applications</option>
<option value="BCS">Bachelor of Computer Science</option>
<option value="BCOM">Bachelor of Commerce</option>
<option value="Dip">Diploma</option>
<option value="inter">Intermediate</option>
</tr>

<!--------------Percentage--------------->

<tr>
<td>PERCENTAGE</td>
<td><input type="text" name="percent" required>(Up to 2 decimal)
</td>
</tr>
 
<!----- Course ------------------------------------------>
<tr>
<td>SELECT<br />THE COURSE</td>
<td>
<input type="radio" id="course1" name="degree" onclick="ShowBtech()" required />B.Tech/BE
<input type="radio" id="course2" name="degree" onclick="ShowMtech()" required />M.Tech
<input type="radio" id="course3" name="degree" onclick="ShowMba()" required />MBA
</td>
</tr>

<tr>
<td>STREAM</td>

<td>
<select id="def" style"display:block">
	<option value="-1">Select</option>
</select>
<select id="Btechvalues" style="display: none" required>
	<option value="-1">Select</option>
	<option value="AERO">Aeronautical Engineering</option>
	<option value="CIVIL">Civil Engineering</option>
	<option value="CSE">Computer Science Engineering</option>
        <option value="ECE">Electronics Communication Engineering</option>
        <option value="EEE">Electrical Electronics Engineering</option>
	 <option value="IT">Information Technology</option>
        <option value="MECH">Mechanical Engineering</option> 		
</select>
<select id="Mtechvalue" style="display: none" required>
	<option value="-1">Select</option>
        <option value="AERO">Aerospace Engineering</option>
        <option value="CHEM">Chemical Engineering</option>
        <option value="CIVIL">Civil Engineering</option>
	<option value="CSE">Computer Science Engineering</option>
	 <option value="EE">Electrical Engineering</option>
	 <option value="IT">Information Technology</option>
        <option value="MECH">Mechanical Engineering</option> 
        <option value="MET">Metallurgical Engineering</option>
 </select>
<select id="Mbavalue" style="display: none" required>
	<option value="-1">Select</option>
        <option value="HR">Human Resource Management</option>
        <option value="FM">Finance Management</option>
        <option value="MM">Marketing Management</option>
	 <option value="IT">IT Management</option>
 </select>
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