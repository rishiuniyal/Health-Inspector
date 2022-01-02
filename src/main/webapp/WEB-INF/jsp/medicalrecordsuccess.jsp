<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Details</title>
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
    cell-width: 450%;
    cellpadding: 70px;
    }
</style>
</head>
<h1>Update Treatment/Prescription details </h1>
<body> 
<center>
<a href="updaterecords" >Click here to view updated records</a>
        <table>
            <tr>
                <th>Symptoms</th>
                <th>Diagonsis</th>
                <th>Treatment planned</th>
                <th>Prescription</th>
                <th>Revisit Requried</th>
                <th>Next Revisit Date</th>
                <th>Frequency Revisit</th>
            </tr>
            <c:forEach var="patient" items="${medicalRecords}">
                <tr>
                    <td>${patient.symptoms}</td>
                    <td>${patient.diagnosis}</td>
                    <td>${patient.treatmentPlanned}</td>
                    <td>${patient.prescription}</td>
                    <td>${patient.revisitRequired}</td>
                    <td>${patient.nextRevisitDate}</td>
                    <td>${patient.frequencyRevisit}</td>
                </tr>
            </c:forEach>
        </table>
         </center>
         
   </body>
 </html>
</body>
</html>