<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/index1.jsp" var="completeURL">
	<c:param name="trackingId" value="100"/>
	<c:param name="user" value="ABC"/>
	</c:url>
	${completeURL}

</body>
</html>