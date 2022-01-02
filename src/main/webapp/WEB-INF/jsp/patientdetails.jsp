<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	width: 10%;
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
table, td, th{
    border: 2px solid black;
    border-collapse: collapse; 
    cell-width: 150%;
    cellpadding: 70px;
    }
</style>
</head>
<h1>Patient Record</h1>
<body> <center>
        <table>
            <tr>
                <th>patient ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Doctor Name</th>
                <!-- <th>Speciality</th>
                <th>Visit date</th> 
                -->
            </tr>
            <c:forEach var="patient" items="${list}">
                <tr>
                    <td>${patient.patientId}</td>
                   <td>${patient.patientName}</td>
                    <td>${patient.patientGender}</td>
                    <td>${patient.doctorName}</td>
                   
                </tr>
            </c:forEach> 
        </table><br>
            <form >
             <table>
              <tr><td><a href="Medicalrecord">Update Details</a></td></tr>
             </table>
           </form>         
         </center>
   </body>
 </html>