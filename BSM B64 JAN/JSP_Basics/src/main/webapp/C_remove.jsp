<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="income" scope="session" value="${4000*4 }"/>
	<P>Before remove value is <c:out value="${income }"/></P>
	<c:remove var="income"/>
	<P>After remove value is <c:out value="${income }"/></P>
	

</body>
</html>