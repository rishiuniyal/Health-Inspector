<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Details</title>
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
	width: 100%;
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
.row1 {
	width: 100%;
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
	height: 320px;
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
	<h1 style="text-align: center;">Patient Feedback</h1>
	<div style="padding-left: 50px;">
		<form action="feedbackdetails" method="post"
			onsubmit="return validateForm()">
			<table style="margin-left: auto; margin-right: auto;">
			<tr>
					<td><b>Enter Patient ID :</b></td>
					<td><input type="text" name="patientId" id="patientId"></td>
				</tr>
                <tr>
					<td><b>Enter Doctor Name :</b></td>
					<td><input type="text" name="doctorname" id="doctorname" ></td>
				</tr>
				<tr>
					<td><b>Enter Clinic Name :</b></td>
					<td><input type="text" name="clinicname" id="clinicname"></td>
				</tr>
				<tr>
					<td><b>Feedback :</b></td>
					<td><textarea name="feedback" id="feedback" cols="20" rows="8"></textarea></td>
				</tr> 
								<tr>
					<td></td>
					<td><input type="submit" value="Submit Feedback" class="row" required></td>
					
				</tr>
			</table>
		</form>

	</div>



	<script>
		function validateForm() {

			//alert("Inside validate");
			var patientId = document.getElementById("patientId").value;
			if (patientId == null || patientId == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('patientId').style.borderColor = "red";
				return false;
			}
			var symptoms = document.getElementById("doctorname").value;
			if (symptoms == null || symptoms == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('doctorname').style.borderColor = "red";
				return false;
			}
			var diagnosis = document.getElementById("clinicname").value;
			if (diagnosis == null || diagnosis == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('clinicname').style.borderColor = "red";
				return false;
			}
			var treatmentPlanned = document.getElementById("feedback").value;
			if (treatmentPlanned == null || treatmentPlanned == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('feedback').style.borderColor = "red";
				return false;
			}
				}
	</script>
</body>
</html>