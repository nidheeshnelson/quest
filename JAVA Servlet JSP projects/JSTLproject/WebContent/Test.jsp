<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Science Staff</title>
    <link rel="stylesheet" href="Science.css">
</head>
<body>
    <form action="" method="">
        <nav>
            <div class="nav">
                <div class="emblem"><img src="graduation.png" alt=""></div>
                <div class="name">
                    <div class="college">Science School of Technology</div>
                    <div class="moto">Experiance the Beauty of Science</div>
                </div>
                <div class="account">
                    <div class="signin"><a href="ScienceSignin.html" style="text-decoration: none; color: brown;">Sign Out</a></div>
                    <div class="new"><a href="ScienceHome.html" style="text-decoration: none; color: brown;">Home</a></div>
                </div>
            </div>
        </nav>
        <div class="body">
                        <div>
                            <img src="Students.jpg" alt="" class="image1">
                        </div>
                        <c:set var="income" scope="session" value="${548*32}"/>
                       
                         <c:set var="add" scope="session" value="${85+15}"></c:set>
                        <c:set var="iff" scope="session" value="${85}"></c:set>
                        <div class="salute">
                            <h1><c:out value="${'Hello jst this is new world'}"/></h1>
                            <h2><c:out value="${income}"></c:out></h2>
                         <h3>Before Removing:<c:out value="${add}"></c:out></h3>
                            <c:remove var="add"/>
                            <h3>After Removing:<c:out value="${add}"></c:out></h3>
                            <c:if test="${iff<100}">
                            <h3>minor</h3> 
                            </c:if> 
                        </div>
                        <div class="options">
                            <ul>
                                <li><a href="ScienceAdd.html">Add Student</a> </li>
                                <li><a href="ScienceMark.html">Add Marks</a></li>
                                <li><a href="ScienceEdit.html">View</a></li>
                                <li><a href="ScienceEdit.html">Edit</a></li>
                                <li><a href="ScienceDelete.html">Delete</a></li>
                            </ul>
                        </div>
                        <div class="social">
                            <ul>
                                <li><a href="https://web.whatsapp.com">WhatsApp</a></li>
                                <li><a href="https://web.telegram.org">Telegram</a></li>
                                <li><a href="https://meet.google.com">Google Meet</a></li>
                                <li><a href="https://en.m.wikipedia.org">FaceBook</a></li>
                                <li><a href="https://www.linkedin.com">LinkedIn</a></li>
                            </ul>
                        </div>
        </div>
    </form>
    <script src="Science.js"></script>
</body>
</html>