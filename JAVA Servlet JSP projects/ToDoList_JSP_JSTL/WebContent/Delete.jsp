<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/todo" user="root" password="Nidheesh@3N7"/>
<sql:update dataSource="${db}" var="deleting">
delete from list where slno=?
<sql:param value="${param.slno}"/>
</sql:update>
<c:if test="${deleting>=1}">
    <c:redirect url="Home.jsp"/>
    </c:if>
</body>
</html>