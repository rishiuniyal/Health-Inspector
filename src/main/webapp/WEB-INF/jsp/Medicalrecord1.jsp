<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Details</title>
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
	<h1 style="text-align: center;">Medical Record</h1>
	<div style="padding-left: 50px;">
		<form action="medical" method="post"
			onsubmit="return validateForm()">
			<table style="margin-left: auto; margin-right: auto;">
			<tr>
					<td><b>Patient ID :</b></td>
					<td><input type="text" name="patientId" id="patientId"></td>
				</tr>
                <tr>
					<td><b>Symptoms :</b></td>
					<td><textarea name="symptoms" id="symptoms" cols="20" rows="3" ></textarea></td>
				</tr>
				<tr>
					<td><b>Diagnosis :</b></td>
					<td><textarea name="diagnosis" id="diagnosis" cols="20" rows="3" ></textarea></td>
				</tr>
				<tr>
					<td><b>Treatment planned :</b></td>
					<td><textarea name="treatmentplanned" id="treatmentplanned" cols="20" rows="3"></textarea></td>
				</tr> 
				<tr>
					<td><b>Prescription :</b></td>
					<td><textarea name="prescription" id="prescription" cols="20" rows="3"></textarea></td>
				</tr>   
				<tr>
					<td><b>Revisit required :</b></td>
					<td><input type="text" id="revisitRequired" name="revisitRequired"></td>
				</tr>
				<tr>
					<td><b>Next revisit date :</b></td>
					<td><input type="date" id="nextRevisitDate" name="nextRevisitDate"></td>
				</tr>
				<tr>
					<td><b>Frequency revisit :</b></td>
					<td><input type="number" id="frequencyRevisit" name="frequencyRevisit"></td><br>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" class="row" required></td>
					
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
			var symptoms = document.getElementById("symptoms").value;
			if (symptoms == null || symptoms == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('symptoms').style.borderColor = "red";
				return false;
			}
			var diagnosis = document.getElementById("diagnosis").value;
			if (diagnosis == null || diagnosis == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('diagnosis').style.borderColor = "red";
				return false;
			}
			var treatmentPlanned = document.getElementById("treatmentPlanned").value;
			if (treatmentPlanned == null || treatmentPlanned == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('treatmentPlanned').style.borderColor = "red";
				return false;
			}
			var prescription = document.getElementById("prescription").value;
			if (prescription == null || prescription == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('prescription').style.borderColor = "red";
				return false;
			}
			
		}
	</script>
</body>
</html>