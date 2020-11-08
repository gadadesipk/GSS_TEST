<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registration</title>
<script
  src="https://code.jquery.com/jquery-3.5.1.min.js"
  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
  crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script>
function register(){
	var data = {
					name:$("#name").val(),
					age:$("#age").val(),
					email:$("#email").val(),
					phoneNumber:$("#phoneNumber").val()
				};
	$.ajax({
			type:'POST',
			url:'/GSS_TEST/register',
			data:JSON.stringify(data),
			contentType:'application/json',
			async:false,
			success:function(data){
				alert(data);
			},
			error:function(data)
			{
				alert(data.responseText);
			}
	});	
}
</script>
</head>
<body>
<form onsubmit="return false">
<div class="container">
<div class="row">
	<div class="col">
		<table class="table ">
			<tr>
				<td>NAME</td>
				<td><input type="text" id="name" class="form-control"  required></td>
			</tr>
			<tr>
				<td>AGE</td>
				<td><input type="number" id="age" class="form-control"  required></td>
			</tr> 	
			<tr>
				<td>PHONE NUMBER</td>
				<td><input type="number" id="phoneNumber" class="form-control"  required></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input type="email" id="email" class="form-control" required></td>
			</tr>
		</table>
	</div>
</div>
<div class="row">
	<div class="col"><center><button class="btn btn-sm btn-success" onclick="register()">Register</button></center></div>
</div>
</div>
</form>
</body>
</html>