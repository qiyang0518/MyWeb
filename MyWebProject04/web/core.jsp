<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 悠游
  Date: 2023/7/19
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:forEach end=""> </c:forEach>--%>
保存之前:${requestScope.abc}<br>
<c:set scope="request" var="abc" value="abcValue"/>
保存之后:${requestScope.abc}<br>
    <h1>12等于12</h1>
</body>
</html>
