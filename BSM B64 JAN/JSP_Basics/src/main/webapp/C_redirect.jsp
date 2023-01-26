<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="url" value="2" scope="request"/>
		<c:if test="${url<1}">
			<c:redirect url="http://gmail.com"/>
			</c:if>
		<c:if test="${url>1}">
			<c:redirect url="http://facebook.com"/>
		</c:if>

</body>
</html>