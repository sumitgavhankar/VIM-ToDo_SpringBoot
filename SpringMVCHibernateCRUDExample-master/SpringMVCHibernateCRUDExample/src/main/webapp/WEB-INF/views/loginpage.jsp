<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<h1>Login</h1>

<script type="text/javascript">
	function loginBtn() {
		alert("Login Successfully");
		document.logindemo.action="logindatapage.htm";
        document.logindemo.submit();
	}

	function registerBtn() {
		alert("Registration Successfully");
		document.logindemo.action="rgisterdata.htm";
        document.logindemo.submit();
	}
</script>

	</head>
	<body>
	<form action="logindatapage.htm" name="logindemo">
		<table cellpadding="2" border="2">
			<tr>
				<td>UserName:-<input type="text" name="uname" size="30">
				</td>
			</tr>
			<tr>
				<td>Password:-<input type="password" name="pass" size="30">
				</td>
			<tr>
		</table>

		<input type="button" value="Login" onclick="loginBtn()">
		<a href="rgisterdata.htm" onclick="registerBtn()">New User
			Register here </a>
</form>
	</body>

</html>