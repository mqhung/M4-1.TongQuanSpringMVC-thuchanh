<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/1/2021
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<h1>Hello: ${name}</h1>
<form method="post" action="/greeting/hi">
    <input type="submit" value="Click here">
</body>
</html>
