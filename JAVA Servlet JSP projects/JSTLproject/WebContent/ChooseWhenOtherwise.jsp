<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="number" scope="session" value="${8}"/>
the value is <c:out value="${8}"></c:out><br>
<c:choose>
<c:when test="${number==8}">
the value is currect
</c:when>
<c:when test="${number<8}">
small value
</c:when>
<c:otherwise>large value</c:otherwise>
</c:choose>
</body>
</html>