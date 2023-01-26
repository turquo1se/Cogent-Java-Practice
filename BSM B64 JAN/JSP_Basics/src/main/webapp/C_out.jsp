
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- the prefix can be anything --%>


<html>
<head>
<title>Core tag example</title>
</head>
<body>
<c:out value="${'Welcome to My Site'}"/>  <%-- using to replace the <%=%> expression --%>
	<c:set var = "income" scope = "session" value="${10000*4}"/> <%-- value same as int income = 10000*4 --%>
		<%-- scope can be page/request/session/Application --%>
		
	<c:if test="${income > 30000}">
	<p>My income is: <c:out value="${income}"/> <p>
	</c:if>
	
</body>
</html>
