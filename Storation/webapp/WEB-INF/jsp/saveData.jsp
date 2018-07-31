<!DOCTYPE html>
<html>
<head>
<title>Adding User</title>
</head>
<body>
	<h3>Adding User</h3>
	<form method="post" action="http://localhost:8080/data">
		<table>
			<tr>
				<td><b>User Name:</b></td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td><b>Choose option:</b></td>
			</tr>
			<tr>
				<td><input TYPE=checkbox name=option VALUE=1> 1<BR></td>
			</tr>
			<tr>
				<td><input TYPE=checkbox name=option VALUE=2> 2 <BR></td>
			</tr>
			<tr>
				<td><input TYPE=checkbox name=option VALUE=3> 3 <BR></td>
			</tr>
			<tr>
				<td><input TYPE=checkbox name=option VALUE=4> 4 <BR></td>
			</tr>
			<td>
			<tr>
				<INPUT TYPE=submit name=submit Value="Submit">
			</tr>
			</td>
		</table>
	</form>
</body>
</html>