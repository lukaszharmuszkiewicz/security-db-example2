<%--
  Created by IntelliJ IDEA.
  User: Lukasz
  Date: 21.06.2018
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Spring Security Example </title>
</head>
<body>
<%--<div th:if="${param.error}">--%>
    <%--Invalid username and password.--%>
<%--</div>--%>
<%--<div th:if="${param.logout}">--%>
    <%--You have been logged out.--%>
<%--</div>--%>
<form th:action="@{/login}" method="post">
    <div><label> User Name : <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form>
</body>
</html>
