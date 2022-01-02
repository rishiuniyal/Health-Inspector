<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>You have appointment request</center>
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
table, td, th{
    border: 2px solid black;
    border-collapse: collapse; 
    cell-width: 150%;
    cellpadding: 70px;
    }
</style>
</head>
<h1>Appointment Requests</h1>
<body><center>
        <table>
            <tr>
                <th>patient ID</th>
                <th>Clinic Name</th>
                <th>Accept</th>
                <th>Reject</th>
            </tr>
            
            <c:forEach var="clinic" items="${list}">
                <tr>
              		
                    <td>${clinic.patientId}</td>
                    <td>${clinic.clinicName}</td>
                      <td><a href="accept/${clinic.patientId}">Accept</a></td>
                    <!--<td><a href="accept">Accept</a></td> -->
                    <td><a href="reject">Reject</a></td>
                </tr>
            </c:forEach>
         </table>
         </center>
   </body>
 </html>
</body>
</html>