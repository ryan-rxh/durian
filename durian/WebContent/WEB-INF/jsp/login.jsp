<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login User</title>
</head>
<script type="text/javascript" src="js/jquery-2.1.1.js"> </script> 
<script type="text/javascript">
$(document).ready(function(){
	$("#userId").change(function(){
		alert("");
	});
});
</script>
<body>
	<form action="login" method="post">
	<table>
		<tr><td>Account</td><td><input id="userId" type="text" name="userId"></td></tr>
		<tr><td>Password</td><td><input type="password" name="password"></td></tr>
		<tr><td></td><td align="right"><input type="submit" value="Login"></td></tr>
	</table>
	</form>
</body>
</html>