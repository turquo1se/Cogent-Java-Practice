<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.*, batch64dynamic.model.Employee"%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	List<Employee> li = (ArrayList<Employee>) request.getAttribute("result");
	out.print(li.get(0));
%>
	<table border = "1" bgcolor = "yellow">
		<tr>
		
			<th>EMP ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Address</th>
			<th>Mobile Number</th>
		</tr>
		
		<%
		for (int i = 0; i < li.size(); i++) {
			Employee e = li.get(i);
		
		%>
		<tr>
			<td>&nbsp;<%=e.getId()%>&nbsp;</td>
			<td>&nbsp;<%=e.getName()%>&nbsp;</td>
			<td>&nbsp;<%=e.getSalary()%>&nbsp;</td>
			<td>&nbsp;<%=e.getAddress()%>&nbsp;</td>
			<td>&nbsp;<%=e.getMobile()%>&nbsp;</td>
		</tr>
		<%
		}
		%>
	 </table>



</body>
</html>