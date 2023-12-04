<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
</head>
<body>
    <h1 style="text-align: center;">Registration Form for and ${user}</h1>
  ${mymark} and ${me}
    <form action="/gett">
    <div class="container" style="width: 50%; height: auto; margin-left: auto;margin-right: auto;">
    <input type="text" id="r1" name="b"><br>
        <label for="r1">Enter data</label><br><br>
    <input type="text" id="r2" name="m">
    <input type="text" id="r3" name="n">
        <input type="submit">
    </div>
</form>
</body>
</html>