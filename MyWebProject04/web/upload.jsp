<%--
  Created by IntelliJ IDEA.
  User: 悠游
  Date: 2023/7/19
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action = "http://localhost:8088/EL/uploadServlet" method="post" enctype="multipart/form-data">
    用户名: <input type="text" name="username"/><br>
    头像: <input type = "file" name="photo"/> <br>
    <input type = "submit" value="上传">
    <br>
</form>
</body>
</html>
