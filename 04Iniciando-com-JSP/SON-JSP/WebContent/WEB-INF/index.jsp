 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>OK!</h1>
<p> Olá ${name} </p>

<c:forEach var="i" begin="1" end="10">
	Item Number <c:out value="${i}"></c:out><br>
</c:forEach>

<c:forEach var="number" items="${numbers}">
	Item: ${number} <br/>
</c:forEach>

<c:if test="${age >= 18 }">Você pode entrar!</c:if>
<c:if test="${age < 18 }">Entrada não Permitida</c:if>

</body>
</html>