<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	line-height: 8px;
	text-decoration: none;
	background-color: #3b986d;
	border-radius: 5px;
	color: white;
	font-size: 18px;
}

table {
	margin: auto auto;
	padding: 40px;
	border-radius: 5px;
	box-shadow: 0 0 10px #000;
	position: absolute;
	top: 10;
	bottom: 5;
	left: 0;
	right: 0;
	width: 450px;
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
<h1 style="text-align: center;">Appointment Request Page</h1>
	<div style="padding-left: 50px;">
		<form action="request" method="post"
			onsubmit="return validateForm()">
			<table style="margin-left: auto; margin-right: auto;">
			<tr>
					<td><b>Doctor Id :</b></td>
					<td><input type="text" id="DoctorId" name="DoctorId"
						placeholder="enter your Id"></td>
				<tr>
					<td><b>Doctor Name :</b></td>
					<td><input type="text" id="doctorName" name="doctorName"
						placeholder="enter your Name"></td>
						</tr>
						<tr>
					<td></td>
					<td><input type="submit" value="submit" required></td>
				</tr>
						</table>
						</form>
						</div>
						<script>
		function validateForm() {

			//alert("Inside validate");
			var doctorName = document.getElementById("doctorName").value;
			if (doctorName == null || doctorName== "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('doctorName').style.borderColor = "red";
				return false;
			}
			</script>
</body>
</html>