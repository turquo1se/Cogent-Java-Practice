<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1> This is a new file</h1>
	
	<%--  <jsp:include page="printdata.jsp">
		<jsp:param value = "allen" name="name"/>
	
	
	</jsp:include> 
	--%>
	
	<jsp:forward page="printdata.jsp">
		<jsp:param value = "allen" name="name"/>
	
	
	</jsp:forward> 
	

	
	



</body>
</html>