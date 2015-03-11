<%--
  Created by IntelliJ IDEA.
  User: lwzhang
  Date: 3/11/15
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Specific Employee Page</title>
</head>
<body>

    <p>The Employee Id is :</p>
    <h3>${employee.id}</h3><br />
    <p>The Employee Name is :</p>
    <h3>${employee.firstName} ${employee.lastName}</h3><br />

    <form method="post">
    <input id="return" type="submit" name="return" value="Return">
    </form>

</body>
</html>
