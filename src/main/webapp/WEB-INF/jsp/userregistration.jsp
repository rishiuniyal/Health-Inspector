<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>

h1 {
	padding: 50px;
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

    table.inner{
       border:10px;
    }
   </style>
</head>
<body>
<h1 style="text-align:center;">New User Registration</h1>
<div style="padding-left:50px;">
  <form  action="UserRegister1" method="post" onsubmit="return validateForm()">
    <table style="margin-left:auto;margin-right:auto;">
       <tr>
         <td><b>First Name :</b></td>
         <td><input type="text" id="first_name" name="first_name" placeholder="enter your first name" ></td>
       </tr>
       <tr>
         <td><b>Last Name :</b></td>
         <td><input type="text" id="last_name" name="last_name" placeholder="enter your last name" ></td>
       </tr>
       <tr>
         <td><b>DoB :</b></td>
         <td><input type="date" id="Dob" name="Dob" placeholder="enter your dob" ></td>
       </tr>
       <tr>
		<td><b>Gender :</b></td>
		<td><input type="radio" name="Gender" value="male" >Male
		<input type="radio" name="Gender" value="female">Female</td>
	   </tr>
	   <tr>
         <td><b>Contact Number:</b></td>
         <td><input type="tel" id="Contact" name="Contact" placeholder="enter your contact number" pattern="[7-9]{1}[0-9]{9}" title="The number should be 10 digits starting with 7/8/9."></td>
       </tr>
       <tr>
         <td><b>User ID:</b></td>
         <td><input type="text" id="userID" name="userID" placeholder="Enter your User ID"></td>
      </tr>
       <tr>
         <td><b>Password :</b></td>
         <td><input type="password" id="Password" name="Password" placeholder="enter your password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&]).{8,}" title="Must contain at least one number, one uppercase,lowercase letter,special character(@#$%&) and at least 8 or more characters"></td>
       </tr>
 	     <tr>
					<td><b>Email: </b></td>
					<td><input type="email" placeholder="Enter Email" name="email"
						id="email" pattern="[a-zA-Z0-9]+@[a-zA-Z0-9]+.com"
						title="Enter in this form abc@gmail.com"></td>
				</tr>
 	   <tr>
       <td><b>UserCategory</b></td>
        <td><select id="user_category" name="user_category">
       			       <option value="doctor">Doctor</option>
       			       <option value="patient">Patient</option>
                    </select></td>
                    </tr>
       <tr>
       	 <td></td>
         <td><input type="submit" value="Register" required></td>
       </tr>
    </table>
  </form>
    
</div>
<center style="font-size:20px";>${message}</center>
<script>  
	 function validateForm(){  
		 //alert("Inside validateForm");
		var userFirstName=document.getElementById("first_name").value; 
		if (userFirstName==null || userFirstName==""){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('first_name').style.borderColor = "red";
			  return false;  
			}
		var userLastName=document.getElementById("last_name").value;
		if(userLastName==null || userLastName==""){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('last_name').style.borderColor = "red";
			  return false;  
			}
		var userDob=document.getElementById("Dob").value;
		if(userDob==null || userDob=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('Dob').style.borderColor = "red";
			  return false;  
		}
		var userContact=document.getElementById("Contact").value;
		if(userContact==null || userContact=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('Contact').style.borderColor = "red";
			  return false;  
		}
			var userID=document.getElementById("userID").value;
		if(userID==null || userID=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('userID').style.borderColor = "red";
			  return false;  
		}
		var userPassword=document.getElementById("Password").value;
		if(userPassword==null || userPassword=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('Password').style.borderColor = "red";
			  return false;  
		}
		var userEmail=document.getElementById("Email").value;
		if(userEmail==null || userEmail==""){  
			  alert("Please update the highlighted question fields!");  
			  document.getElementById('email').style.borderColor = "red";
			  return false;  
		}
		var userCategory=document.getElementById("user_category").value;
		if(userCategory==null || userCategory=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('user_category').style.borderColor = "red";
			  return false;  
		}
		var userGender=document.getElementsByName("Gender");
		var temp=0;
		for(i=0;i<userGender.length;i++){
			if(userGender[i].checked){
				temp=1;
			}
		}
		if(temp==0){
			alert("Please update the highlighted mandatory fields!");
			//document.getElementById('userGender').style.borderColor = "red";
			return false;
		}
		
	}  
  </script>
</body>
</html>