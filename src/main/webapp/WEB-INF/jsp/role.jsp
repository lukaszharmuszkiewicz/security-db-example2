<%--
  Created by IntelliJ IDEA.
  User: Lukasz
  Date: 22.06.2018
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<%@ page language="java" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <title>TEST</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Username</td>
        <td>Password</td>
        <td>Role</td>

    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username }</td>
            <td>${user.password }</td>
            <td>${user.roleToString}</td>
            <td><form method="post" action="/changeRoleToUser">
                <input type="hidden" name="id" value="${user.id }">
                <input type="submit"value="ToUser"></form></td>
            <td><form method="post" action="/changeRoleToAdmin">
                <input type="hidden" name="id" value="${user.id }">
                <input type="submit"value="ToAdmin">
            </form></td>
        </tr>
    </c:forEach>

</table>
<br>
<br>
<form method="get" action="/logout">
    <input type="submit"value="WYLOGUJ">
</form>


</body>
</html>
