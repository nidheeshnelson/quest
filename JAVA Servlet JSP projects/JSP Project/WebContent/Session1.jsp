<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Malayalam.jsp">
<%String a = request.getParameter("a");
out.print("Hi "+a+" Go to page3");%>  
<h1>Page 2 </h1>
<input type="submit">


</form>
</body>
</html>