<%--
  Created by IntelliJ IDEA.
  User: 悠游
  Date: 2023/5/26
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
hello world!
<%! public  String name = "小明";
    public String setName(String name)
    {
        return name;
    }
%>
<%out.print("Hello World!");%>
<%out.print("=======输出=======");%>
<%="当前项目的虚拟路径:" + application.getContextPath() + "<br/>"%>
<%=name%>
</body>
</html>
