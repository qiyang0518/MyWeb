<%@ page import = "main.com.pojo.Person" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "java.util.Map" %>
<%@ page import = "java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 悠游
  Date: 2023/7/17
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();

    person.setName("mary");
    person.setPhone(new String[]{"110","120","119"});

    List<String> cities = new ArrayList<>();
    cities.add("北京");
    cities.add("上海");
    cities.add("南京");
    person.setCities(cities);

    Map<String,Object> map = new HashMap<>();
    map.put("key1","value1");
    map.put("key2","value2");
    map.put("key3","value3");
    map.put("key4","value4");
    person.setMap(map);

    pageContext.setAttribute("person",person);
%>
    输出Person:${person} <br>
    输出Person的属性:${person.name} <br>
</body>
</html>
