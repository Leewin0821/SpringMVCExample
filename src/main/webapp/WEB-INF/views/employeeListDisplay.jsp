<%--
  Created by IntelliJ IDEA.
  User: lwzhang
  Date: 3/1/15
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Spring MVC Hello World</title>
</head>

<body>

    <h2>All Employees In System</h2>

    <table border="1">
        <tr>
            <th>Employee Id</th>
            <th>Employee First Name</th>
            <th>Employee Last Name</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
            </tr>
        </c:forEach>
    </table>

    <br />
    <form method="post">
        <input id="searchId" name="userName" type="text">
        <input id="searchButton" name="search" type="submit" value="Search">
    </form>

</body>
</html>
