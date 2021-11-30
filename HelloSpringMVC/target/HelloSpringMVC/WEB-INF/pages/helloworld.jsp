 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC -HelloWorld</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body>
    <h1>${greeting}</h1>
    
</body> 
<c:forEach items="${ds }" var="bien1">
<c:out value="${ bien1}"></c:out>
</c:forEach>
<hr>
<c:forEach items="${ds }" var = "bien2">
<c:if test="${bien2 == 'Quoc' }">
	${bien2} is number one!
</c:if>
</c:forEach>
<hr>
</html>