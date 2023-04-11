<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
  <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>Login</title>
</head>
<body>
  <%@include file="logout.jsp"%>
  <h4 style="color: red">${errorMsg}</h4>
  <form class="table_dark" method="post" action="${pageContext.request.contextPath}/login">
    Login <input type="text" name="login"><br>
    Password <input type="password" name="password"><br>
    <button type="submit">Confirm</button>
  </form>
  <a class="table_dark" href="${pageContext.request.contextPath}/drivers/add">Register</a>
</body>
</html>
