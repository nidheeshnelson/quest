<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
<jsp:useBean id="obj" class="jsppackage.jsp1Class"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
Record:<br>
<jsp:getProperty property="user" name="obj"/><br>
<jsp:getProperty property="password" name="obj"/><br>
<jsp:getProperty property="email" name="obj"/><br>
<jsp:getProperty property="you" name="obj"/><br>

</body>
</html>