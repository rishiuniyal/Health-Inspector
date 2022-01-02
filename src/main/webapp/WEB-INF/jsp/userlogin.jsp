<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
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
<center style="font-size:20px";>${message}</center>
<h1 style="text-align:center;">User Login</h1>
<div style="padding-left:50px;">
  <form  action="dashboard" method="post" onsubmit="return validateForm()">
    <table style="margin-left:auto;margin-right:auto;">
       <tr>
         <td><b>User ID :</b></td>
         <td><input type="text" id="userid" name="userid" placeholder="enter your user ID" ></td>
       </tr>
       <tr>
         <td><b>Password :</b></td>
         <td><input type="password" id="password" name="password" placeholder="enter your password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&]).{8,}" title="Must contain at least one number, one uppercase,lowercase letter,special character(@#$%&) and at least 8 or more characters"></td>
       </tr>
 	  
       
       <tr>
       <td><b>UserCategory</b></td>
        <td><select id="user_category" name="user_category">
        		       <option value="admin">Admin</option>
       			       <option value="doctor">Doctor</option>
       			       <option value="patient">Patient</option>
                    </select></td>
                    </tr>
                    <tr>
       	 <td></td>
         <td><input type="submit" value="Login" required></td>
       </tr>
    </table>
  </form>
    
</div>



<script>  
	 function validateForm(){  
		 
		//alert("Inside validate");
		var userId=document.getElementById("userid").value;
		if(userId==null || userId=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('userid').style.borderColor = "red";
			  return false;  
		}
		var userPassword=document.getElementById("Password").value;
		if(userPassword==null || userPassword=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('Password').style.borderColor = "red";
			  return false;  
		}
		var user_category=document.getElementById("user_category").value;
		if(user_category==null || user_category=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('user_category').style.borderColor = "red";
			  return false;  
		}
		
	 }		
</script>

</body>
</html>