<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Validations</title>
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
.m{
    text-align: center;
    font-size: 13px;
    color :black;
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
	<h1 style="text-align: center;">BMI Validations</h1>
	<div style="padding-left: 50px;">
	
			<table style="margin-left: auto; margin-right: auto;">
				<tr>
					<td><b>Height :</b></td>
					<td><input type="text" id="height" name="height"
						placeholder="Enter your Height"></td>
				</tr>
				<tr>
					<td><b>Weight :</b></td>
					<td><input type="text" id="weight" name="weight" 
						placeholder="Enter your weight"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Get BMI" class="row"  onsubmit="bmicalculator();return false;"></td>
				</tr>
                <tr>
                    <td>Your BMI:<input type="text" id="bmi"></td>
                </tr>
                <!--  <tr>
                    <td><a href="getdiet" class="m">Get Diet/Exercise Recommendations</a></td>
                </tr> -->
			</table>
			</form>
	</div>

	<script>

        function bmicalculator() {
            var height = document.getElementById("height").value;
            var weight = document.getElementById("weight").value;
            var finalHeight = height * .025;
            var finalWeight = weight * .45;
            var BMI = (finalWeight / Math.pow(finalHeight,2));
           document.getElementById("bmi").innerHTML = BMI;
          
            }
	</script>
</body>
</html>