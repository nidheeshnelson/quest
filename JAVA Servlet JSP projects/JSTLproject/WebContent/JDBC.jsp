<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/newjstl" user="root" password="Nidheesh@3N7"/>
<sql:query  dataSource="${db}" var="results">
SELECT * FROM data;
</sql:query>
<table border="1">
    <c:forEach var="row" items="${results.rows}">
        <tr>
            <c:forEach var="column" items="${row}">
                <td><c:out value="${column.value}"/></td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>  
</body>
</html>