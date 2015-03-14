<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lwzhang
  Date: 3/2/15
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index Page Title</title>
</head>
<body>
    <h2>Welcome To Spring MVC Test Page</h2>

    <form method="post">
        <input id="getAllEmployees" name="getAllEmployees" type="submit" value="Get All Employees">
        <input id="notInTheList" name="notInTheList" type="submit" value="You Are Not In The List?">
    </form>
</body>
</html>
