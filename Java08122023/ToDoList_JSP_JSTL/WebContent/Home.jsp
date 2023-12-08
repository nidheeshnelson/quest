<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="ToDo.css">
</head>
<body>
<form method="post">
    <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/todo" user="root" password="Nidheesh@3N7"/>
               <sql:query dataSource="${db}" var="rs">select * from list</sql:query>
        <div id="body">
           
            <table>
                <table>
                <tr id="nav"><td colspan="4">To Do List
                <input type="text" name="data">
            <input type="submit" value="Add">
            <a href="Add.jsp">Edit</a></td></tr>
                
                <tr>
                    <th>Sl.No.</th>
                    <th colspan="2">List</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="table" items="${rs.rows}">
                <tr>
                    <td><c:out value="${table.slno}"/></td>
                    <td  colspan="2"><c:out value="${table.content}"/></td>
                    <c:url value="Delete.jsp" var="delete">
                    <c:param name="slno" value="${table.slno}"/>
                    </c:url>
                    <td><a href="${delete}">Delete</a></td>
                </tr>
                </c:forEach>
            </table>
        </div>
        </form>
        <br><br>
        <c:choose>
    <c:when test="${not empty param.data}">
    <sql:setDataSource var="db1" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/todo" user="root" password="Nidheesh@3N7"/>
    <sql:update dataSource="${db1}" var="adding">
    insert into list(content) values(?)
    <sql:param value="${param.data}"/>
    </sql:update>
    <c:if test="${adding>=1}">
    <c:redirect url="Home.jsp"/>
    </c:if>
    </c:when>
    </c:choose>
    <script src="ToDo.js"></script>
</body>
</html>