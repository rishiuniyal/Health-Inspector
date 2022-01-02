<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

  h1{
	padding: 50px;
	text-align: center;
	background: #009999;
	border-radius: 5px;  
	color: white;
	font-size: 30px;
   }
   .row {
	width: 20%;
	padding: 10px;
	text-align:center;
	margin: 15px 0px;
	display: inline-block;
	line-height: 20px;
	text-decoration: none;
	background-color: #3b986d;
    border-radius:5px;
	color: white;
	font-size: 20px;

   }
   .box{
	   font-family:Lucida Sans;
	   font-weight: normal;
	   font-size: 10px;

   }
   

   table{
    margin: auto auto;
	padding:50px;
	border-radius: 5px;
	box-shadow: 0 0 10px #000;
	position: absolute;
	top: 10;
	bottom: 5;
	left: 0;
	right: 0;
	width: 700px;
	height: 530px;
       font-family:verdana;
       color:black;
       font-style:normal;
       font-size:16px;
	    text-align: start;
       font-weight:bold;
       background-color: rgba(21, 134, 119, 0.301);  
       border-collapse:collapse;
    
      }
    table.inner{
       border:30px;
    }
   </style>
</head>
<body>
<h1 style="text-align:center;">Add Clinic Details</h1>
<div style="padding-left:50px;">

<!-- ${userid} -->
  <form  action="addClinic1" method="post" onsubmit="return validateForm()">
    <table style="margin-left:auto;margin-right:auto;">
       <tr>
         <td><b>Clinic Name :</b></td>
         <td><input type="text" id="ClinicName" name="ClinicName" placeholder="Enter clinic name" ></td>
       </tr>
       <tr>
         <td><b>Address Line 1 :</b></td>
         <td><textarea name="AddressLine1" id ="AddressLine1" cols="20" rows="3" placeholder="Enter address line 1" required></textarea></td>
       </tr>
       <tr>
         <td><b>Address Line 2 :</b></td>
         <td><textarea name="AddressLine2" id ="AddressLine2" cols="20" rows="3" placeholder="Enter address line 2" required></textarea></td>
       </tr>
       <tr>
		<td><b> City :</b></td>
		<td><input type="text" id="city" name="city" placeholder="Enter City" ></td>
	   </tr>
	   <tr>
         <td><b>State :</b></td>
         <td><input type="text" id="state" name="state" placeholder="Enter State" ></td>
       </tr>
       <tr>
         <td><b>Zip Code :</b></td>
         <td><input type="number" id="Zipcode" name="Zipcode" placeholder="Enter Zip code"></td>
	  </tr>
       <tr>
         <td><b>Facilities Avaliable:</b></td>
		 <div class="box">
		 <td><label class="checkbox"><input type="checkbox" id="Facility1" name="Facility1" value="OPD"> OPD</label>
			<label class="checkbox"><input type="checkbox" id="Facility2" name="Facility1" value="Dentalfacility"> Dental Facility</label>
			<label class="checkbox"><input type="checkbox" id="Facility3" name="Facility1" value="Ward/Indoorfacility">Ward/Indoor Facility</label><br>
			<label class="checkbox"><input type="checkbox" id="Facility4" name="Facility1" value="Minor OT/Dressing Room">Minor OT/Dressing Room<label>
			<label class="checkbox"><input type="checkbox" id="Facility5" name="Facility1" value="Physiotherapy">Physiotherapy</label>
			<label class="checkbox"><input type="checkbox" id="Facility6" name="Facility1" value="Laboratoryservices">Laboratory Services</label><br>
			<label class="checkbox"><input type="checkbox" id="Facility7" name="Facility1" value="ECG services">ECG services</label>
			<label class="checkbox"><input type="checkbox" id="Facility8" name="Facility1" value="Pharmacy">Pharmacy</label>
			<label class="checkbox"><input type="checkbox" id="Facility9" name="Facility1" value="Radiology/X-rayfacility">Radiology/X-rayfacility</label><br>
			<label class="checkbox"><input type="checkbox" id="Facility10" name="Facility1" value="AmbulanceServices">Ambulance Services</label>
		</td></div>
	   </tr>
	   <tr>
 	     <td><b>Contact number: </b></td>
 	     <td><input type="tel" id="contactNumber" name="contactNumber" placeholder="Enter the contactNumber" required ></td>
 	   </tr>
       <tr>
		<tr>
			<td><b>Website: </b></td>
			<td><input type="text" id="website" name="website" placeholder="Enter the website" required ></td>
		  </tr>
		  <tr>
			<td><b>Locality</b></td>
			<td><input type="text" id="pincode" name="pincode" placeholder="Enter Locality" required ></td>
		  </tr>
		  <tr>
			<td><b>Clinic ID: </b></td>
			<td><input type="text" id="clinicID" name="clinicID" placeholder="Enter Clinic ID" required ></td>
		  </tr>
		 <tr>
       	 <td></td>
         <td><input type="submit" value="Submit" class="row" required></td>
       </tr>
    </table>
    
  </form>    
</div>
<script>  
	 function validateForm(){  
		 //alert("Inside validateForm");
		var clinicName=document.getElementById("clinicName").value; 
		if (clinicName==null || clinicName==""){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('clinicName').style.borderColor = "red";
			  return false;  
			}
		var AddressLine1=document.getElementById("AdressLine1").value;
		if(AddressLine1==null || AddressLine1==""){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('AddressLine1').style.borderColor = "red";
			  return false;  
			}
		var AddressLine2=document.getElementById("AdressLine2").value;
		if(AddressLine2==null || AddressLine2==""){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('AddressLine2').style.borderColor = "red";
			  return false;  
			}
		var city =document.getElementById("city").value;
		if(city==null || city=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('city').style.borderColor = "red";
			  return false;  
		}
		var state=document.getElementById("state").value;
		if(state==null || state=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('state').style.borderColor = "red";
			  return false;  
		}
			var zipCode=document.getElementById("zipCode").value;
		if(zipCode==null || zipCode=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('zipcode').style.borderColor = "red";
			  return false;  
		}
		var contactNumber=document.getElementById("contactNumber").value;
		if(contactNumber==null || contactNumber=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('contactNumber').style.borderColor = "red";
			  return false;  
		}
		var website=document.getElementById("website").value;
		if(website==null || website==""){  
			  alert("Please update the highlighted question fields!");  
			  document.getElementById('website').style.borderColor = "red";
			  return false;  
		}
		var Locality=document.getElementById("Locality").value;
		if(Locality==null || Locality=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('Locality').style.borderColor = "red";
			  return false;  
		}
		var clincID=document.getElementById("clincID").value;
		if(clincID==null || clincID=="" ){  
			  alert("Please update the highlighted mandatory fields!");  
			  document.getElementById('clincID').style.borderColor = "red";
			  return false;  
		}
		var userGender=document.getElementsByName("userGender");
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