<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="hello">Home</a>
	<c:choose>
		<c:when test="${login!=null }">
Hi:${login.getTenkh()}
<a href="Logout">Logout</a>
		</c:when>
		<c:otherwise>
			<a href="Login">Login</a>
		</c:otherwise>
	</c:choose>


	<form action="MENU" method="post">
		<label>Nhập Tên Khách Hàng:</label> <input type="text" name="ten"/>
		<input type="submit" value="Submit"/>
	</form>
	<hr>
	<c:forEach items="${ds}" var="kh">
		${kh.getTenkh() }
	</c:forEach>
</body>
</html>