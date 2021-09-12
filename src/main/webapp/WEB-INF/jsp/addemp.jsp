<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processAddEmp" method="post"
		modelAttribute="employee">
		<table>
			<tr>
				<td><label for="fname">First Name</label></td>
				<td><form:input path="fname" id="fname" /></td>
				<form:errors path="fname"></form:errors>
			</tr>
			<tr>
				<td><label for="lname">Last Name</label></td>
				<td><form:input path="lname" id="lname" /></td>
				<form:errors path="lname"></form:errors>
			</tr>
			<tr>
				<td><label for="phone">Phone Number</label></td>
				<td><form:input path="phone" id="phone" /></td>
				<form:errors path="phone"></form:errors>
			</tr>
			<tr>
				<td><label for="email">Email Address</label></td>
				<td><form:input path="email" id="email" /></td>
				<form:errors path="email"></form:errors>
			</tr>
			<tr>
				<td><label for="username">Username</label></td>
				<td><form:input path="username" id="username" /></td>
				<form:errors path="username"></form:errors>
			</tr>
			<tr>
				<td><label for="password">Password</label></td>
				<td><form:input  path="password" id="password" /></td>
				<form:errors path="password"></form:errors>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>

		</table>
	</form:form>

</body>
</html>