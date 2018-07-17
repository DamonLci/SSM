<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<!-- 只要是客户端发起的请求，都加上项目名字 -->
<form action="/StrutsDemo/test/login.action" method="post">
    <input type="text" name="name"/> <br/>
    <input type="password" name="pwd"/> <br/>
    <button type="submit">登录</button>
</form>
</body>
</html>