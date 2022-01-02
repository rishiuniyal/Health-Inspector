<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

h1 {
	padding: 50px;
	text-align: center;
	background: #003399;
	border: 5px solid black;
	color: white;
	font-size: 20px;

}

table {
	font-family: verdana;
	color: black;
	font-style: normal;
	font-size: 30px;
	font-weight: bold;
	background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
	border-collapse: collapse;
	border: 2px solid #000000;
	border-style: solid;
}

table.inner {
	border: 10px;
}
</style>
</head>
<body>
<h1 style="text-align: center;">Admin Login</h1>
	<div style="padding-left: 50px;">
		<form action="adminlogin" method="post"
			onsubmit="return validateForm()">
			<table style="margin-left: auto; margin-right: auto;">
				<tr>
					<td><b>Admin ID :</b></td>
					<td><input type="text" id="adminId" name="adminId"
						placeholder="enter your Admin ID"></td>
				</tr>
				<tr>
					<td><b>Password :</b></td>
					<td><input type="password" id="adminPassword"
						name="adminPassword" placeholder="enter your password"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&]).{8,}"
						title="Must contain at least one number, one uppercase,lowercase letter,special character(@#$%&) and at least 8 or more characters"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Login" required></td>
				</tr>
			</table>
		</form>

	</div>
	
	
	
	<script>
		function validateForm() {

			//alert("Inside validate");
			var adminId = document.getElementById("adminId").value;
			if (adminId == null || adminID == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('adminId').style.borderColor = "red";
				return false;
			}
			var adminPassword = document.getElementById("adminPassword").value;
			if (adminPassword == null || adminPassword == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('adminPassword').style.borderColor = "red";
				return false;
			}

		}
	</script>
</body>
</html>