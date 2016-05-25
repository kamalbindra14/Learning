<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
<style type="text/css">
fieldset {
	width: 50px
}
</style>
</head>
<body>
	<div>
		<h2>Create Employee Profile</h2>
		<s:form method="Post" modelAttribute="employee">
			<fieldset>
				<table>
					<tr>
						<th><label for="emp_first_name">First Name:</label></th>
						<td><s:input path="firstName" size="15" id="emp_first_name" /></td>
					</tr>
					<tr>
						<th><label for="emp_last_name">Last Name:</label></th>
						<td><s:input path="lastName" size="15" id="emp_last_name" /></td>
					</tr>
					<tr>
						<th><label for="emp_dept_name">Department:</label></th>
						<td><s:input path="department" size="15" id="emp_dept_name" /></td>
					</tr>
					<tr>
						<th><label for="emp_joinDate_name">Join Date:</label></th>
						<td><s:input path="joinDate" size="15" id="emp_joinDate_name" /></td>
					</tr>
					<tr>
						<th><label for="emp_salary_name">Salary:</label></th>
						<td><s:input path="salary" size="15" id="emp_salary_name" /></td>
					</tr>
					<tr>
                        <td><input align="middle" type="submit" value="Register"></td>
                    </tr>
				</table>
			</fieldset>

		</s:form>
	</div>
</body>
</html>