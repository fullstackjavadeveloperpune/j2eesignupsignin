<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body style="background-color: purple;">

<form action="EmployeeController" method="POST">
<input type="hidden" name="action" value="signup">
Employee Id<input type="number" name="empid"><br>
Employee Name<input type="text" name="empname"><br>
Employee Salary<input type="text" name="empsalary"><br>
Employee Email<input type="email" name="empemailid"><br>
Employee Password<input type="password" name="emppassword"><br>

<input type="submit" value="SignUp">
</form>

</body>
</html>