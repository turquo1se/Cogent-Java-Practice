<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee registration</title>
</head>
<body>
<form action = "RegisterServlet" method = "post">
	ID<input type="text" name="id"/><br/>
	Name<input type="text" name="ename"/><br/>
	Salary<input type="text" name="esalary"/><br/>
	Address<input type="text" name="eaddress"/><br/>
	Mobile<input type="text" name="emobile"/><br/>
	<br/>
	
	<input type="submit" value = "Register"/><br/>
	
	

</form>

</body>
</html>