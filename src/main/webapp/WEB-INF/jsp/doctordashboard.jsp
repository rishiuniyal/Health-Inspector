<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor DashBoard</title>
</head>
<style>
.heading {
	padding: 30px;
	text-align: center;
	background: #009999;
	border-radius: 5px;  
	color: white;
	font-size: 20px;
	}
	.row {
	width: 20%;
	padding: 15px;
	text-align: center;
	margin: 10px 0;
	display: inline-block;
	line-height: 10px;
	text-decoration: none;
	background-color: #3b986d;
    border-radius:25px;
	color: white;
	font-size: 20px;
}
</style>
<body>
    <div class="heading">
        <h2 style="text-align:center">DOCTOR DASHBOARD</h2></div>
        <div>
            <center>
            <a href="Clinic" class="row"><h3>AddClinic</h3></a><br>
            <a href="Update" class="row"><h3>Update Doctor Details</h3></a><br>
            <a href="Medicalrecord" class="row"><h3>Update Treatment</h3></a><br>
             <a href="appointmentrequest" class="row"><h3>Appointment Request</h3></a><br>
            <a href="logout" class="row"><h3>Logout</h3></a><br>
            </center>
        </div>
</body>
</html>