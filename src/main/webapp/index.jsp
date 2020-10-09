<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2020/10/8
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>WEB层</h1>
    <a href="/account/findAll">测试查询</a>

    <form action="/account/saveAccount" method="post">
        姓名：<input type="text" name="name"><br/>
        金额：<input type="text" name="money"><br/>
             <input type="submit" value="提交"/>
    </form>

</body>
</html>
