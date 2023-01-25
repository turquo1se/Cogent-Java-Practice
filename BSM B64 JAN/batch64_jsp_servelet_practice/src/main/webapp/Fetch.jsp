<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*, model.Employee"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	List<Employee> li = (ArrayList<Employee>) request.getAttribute("result");

%>
	<table border = "1" bgcolor = "white" align="center">
		<tr>
		
			<th>ID</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Salary</th>
		</tr>
		
		<%
		for (int i = 0; i < li.size(); i++) {
			Employee e = li.get(i);
		
		%>
		<tr>
			<td>&nbsp;<%=e.getId()%>&nbsp;</td>
			<td>&nbsp;<%=e.getName()%>&nbsp;</td>
			<td>&nbsp;<%=e.getDept()%>&nbsp;</td>
			<td>&nbsp;<%=e.getSalary()%>&nbsp;</td>

		</tr>
		<%
		}
		%>
	 </table>

</body>
</html>