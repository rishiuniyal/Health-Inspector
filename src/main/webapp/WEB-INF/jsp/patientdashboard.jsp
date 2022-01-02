<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>patient DashBoard</title>
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
	width: 10%;
	padding: 15px;
	text-align: center;
	margin: 10px 0;
	display: inline-block;
	line-height: 15px;
	text-decoration: none;
	background-color: #3b986d;
    border-radius:25px;
	color: white;
	font-size: 20px;
}
</style>
<body>
<div class="heading">
<h2 style="text-align:center">PATIENT DASHBOARD</h2>
</div>

<center><a href="logout" class="row">Logout</a><br>
<a href="search" class="row">Search Doctor</a><br>
<a href="search1" class="row">Send Feedback</a><br>
<a href="bmi" class="row">BMI Validations</a><br>
</center>
<center><br><br><br><br><br>
<c:forEach var="clinic" items="${appointments}">
<c:if test="${clinic.approve.equals( 'Approved')}">
           <tr>
           <td><h3>Your Appointment has been Approved by ${clinic.doctorFirstName} in the 
                    ${clinic.clinicName} Clinic</h3></td>  
                </tr>
                </c:if>
               
            </c:forEach>
            </center>
</body>
</html>