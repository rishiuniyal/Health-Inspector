<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Success</title>
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

</style>
</head>
<body>
<center><h1 style="text-align:center;">Congratulations User!</h1>
<h2 style="text-align:center;font-size: 40px;">New User Created successfully and Your  UserId  is ${num}  </h2></center>
<center><a href="user" class="row">Go to login</a></center><br>
</body>
</html>