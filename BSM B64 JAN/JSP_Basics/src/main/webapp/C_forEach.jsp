<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="UTF-8">
<title>Core tag example</title>
</head>
<body>

<c:forEach var = "j" begin="1" end ="3">
	<p>Item <c:out value="${j}"/></p>
	</c:forEach>

</body>
</html>