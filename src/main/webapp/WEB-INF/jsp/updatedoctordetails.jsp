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
<h1 style="text-align: center;">Doctor Details</h1>
	<div style="padding-left: 50px;">
		<form action="updateregister" method="post"
			onsubmit="return validateForm()">
			<table style="margin-left: auto; margin-right: auto;">
                    <tr>
					<td><b><label for="Speciality">Speciality :</label></b></td>
					<td><select name="speciality" id="speciality" required>
						<option>Please select</option>
						<option value ="FamilyPhysician">Family Physician</option>
						<option value ="InternalMedicinePhysician">Internal Medicine Physician</option>
						<option value ="Pediatrician">Pediatrician</option>
						<option value ="Obstetrician">OB/GYN</option>
						<option value ="Surgeon">Surgeon</option>
						<option value ="Psychiatrist">Psychiatrist</option>
						<option value ="Cardiologist">Cardiologist</option>
						<option value ="Dermatologist">Dermatologist</option>
						<option value ="Endocrinologist">Endocrinologist</option>
						<option value ="Gastroenterologist">Gastroenterologist</option>
						<option value ="InfectiousDiseasePhysician">Infectious Disease Physician</option>
						<option value ="Nephrologist">Nephrologist</option>
						<option value ="Ophthalmologist">Ophthalmologist</option>
						<option value ="Neurologist">Neurologist</option>
						<option value ="Physician Executive">Physician Executive</option>
					</select></td>
				</tr>
				<tr>
					<td><b><label for=AddClinic:>Add Clinic :</label></b></td>
					<td><select name="addClinic" id="addClinic" >
						<option>Please select</option>
						<option value="ortopadic">Ortopadic</option>
						<option value="fever">Fever</option>
						<option value="cityhospital">CityHospital</option>
					<%-- 	 <option value="MinorOT">Minor OT/ Dressing Room </option>
						<option value="Physiotherapy">Physiotherapy</option>
						<option value="Laboratoryservices">Laboratory services</option>
						<option value="ECG Services">ECG Services</option>
						<option value="Pharmacy">Pharmacy</option>
						<option value="Radiology">Radiology/X-ray facility</option>
						<option value="AmbulanceServices">Ambulance Services</option> --%> 
						</select>		
					</td>
                </tr>

				<tr>
					<td><b><label for="Availablity">Availablity</label></b></td>
					<td><input type="date" id="availablity" name="availablity"></td>
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
			var speciality = document.getElementById("speciality").value;
			if (speciality == null || speciality == "Please select") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('speciality').style.borderColor = "red";
				return false;
			}
			var addClinic = document.getElementById("addClinic").value;
			if (addClinic == null || addClinic == "Please select") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('addClinic').style.borderColor = "red";
				return false;
			}
			var availablity = document.getElementById("availablity").value;
			if (availablity == null || availablity == "") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('availablity').style.borderColor = "red";
				return false;
			}

			
		}
	</script>
</body>
</html>