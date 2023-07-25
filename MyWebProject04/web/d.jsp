<%--
  Created by IntelliJ IDEA.
  User: 悠游
  Date: 2023/7/18
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("a",null);
%>
${empty a}
hello world!
</body>
</html>
