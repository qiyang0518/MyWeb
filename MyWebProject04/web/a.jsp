<%--
  Created by IntelliJ IDEA.
  User: 悠游
  Date: 2023/7/17
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key","值");
%>
    表达式脚本输出key值:<%=request.getAttribute("key")%><br/>
    EL表达式输出key值:${key}
</body>
</html>
