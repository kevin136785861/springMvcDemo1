<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/7
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- 实验1 测试 REST风格 GET 请求 -->
<a href="testRESTGet/1">testREST GET</a><br/><br/>
<!-- 实验2 测试 REST风格 POST 请求 -->
<form action="testRESTPost" method="POST">
    <input type="submit" value="testRESTPost">
</form>
<!-- 实验3 测试 REST风格 PUT 请求 -->
<form action="testRESTPut/1" method="POST">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="testRESTPut">
</form>
<!-- 实验4 测试 REST风格 DELETE 请求 -->
<form action="testRESTDelete/1" method="POST">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="testRESTDelete">
</form>

<form action="testPOJO" method="POST">
    username:<input type="text" name="username"/><br>
    password:<input type="password" name="password"/><br>
    email:<input type="text" name="email"/><br>
    age:<input type="text" name="age"/><br>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
