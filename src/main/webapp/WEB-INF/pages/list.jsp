<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2020/10/8
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${accountList}
    <p/>
    <c:forEach items="${accountList}" var="account">
        ${account.id}
        ${account.name}
        ${account.money}
    </c:forEach>
</body>
</html>
