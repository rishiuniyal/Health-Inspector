<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1 {
	padding: 60px;
	text-align: center;
	background: #009999;
	border-radius: 5px;
	color: white;
	font-size: 30px;
}

.row {
	width: 70%;
	padding: 15px;
	text-align: center;
	margin: 0px auto;
	display: inline-block;
	line-height: 10px;
	text-decoration: none;
	background-color: #3b986d;
	border-radius: 5px;
	color: white;
	font-size: 20px;
}

table {
	margin: auto auto;
	padding: 40px;
	border-radius: 5px;
	box-shadow: 0 0 10px #000;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	width: 400px;
	height: 200px;
	background-color: rgba(21, 134, 119, 0.301);
	font-family: verdana;
	color: black;
	font-style: normal;
	font-size: 16px;
	font-weight: bold;
}
</style>
</head>
<body>


	<h1 style="text-align: center;">Get Your Appointment</h1>
	<div style="padding-left: 50px;">
		<form action="appoint" method="post" onsubmit="return validateForm()">
			<table style="margin-left: auto; margin-right: auto;">
				<tr>
					<td><b><label for="AddClinic">Clinic :</label></b></td>

					<!--  <td><select name="addclinic" id="addclinic" required>
						<option>Please select</option>
						<option value ="Lifeline">LifeLine</option>
						<option value ="Silvercity">Silvercity</option>
						<option value ="Icon">Icon</option>
						<option value ="TataClinic">TataClinic</option>
						<option value ="MayoClinic">MayoClinic</option>
						<option value ="RehabClinic">RehabClinic</option>
						<option value ="Apollo">Apollo</option>
						<option value ="Radiance">Radiance</option>
						<option value ="Global">Global</option>
						<option value ="CityMax">CityMax</option>
						<option value ="Getwell">Getwell</option>
					</select></td>  -->

					<td><select name="addclinic">     
						<c:forEach items="${names}" var="name">
        					<option value="${name.clinicName}">${name.clinicName}</option>
    					</c:forEach>
					</select></td>


				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Search" class="row" required></td>
				</tr>
				<tr>
					<td></td>
				</tr>
			</table>
		</form>
		<h2>Doctor Details:</h2>
		<c:forEach var="doctor" items="${list}">
			<a href="appodone/${doctor.doctorFirstName}/${doctor.doctorLastName}">${doctor.doctorFirstName}
				${doctor.doctorLastName}</a>

			<br>

		</c:forEach>

	</div>

	<script>
		function validateForm() {

			//alert("Inside validate");
			var addclinic = document.getElementById("addclinic").value;
			var doctorlastname = document.getElementById("doctorLastName").value;
			var addclinic = document.getElementById("doctorFirstName").value;
			if (addclinic == null || addclinic == "Please select") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('addclinic').style.borderColor = "red";
				return false;
			}

		}
	</script>
</body>
</html>