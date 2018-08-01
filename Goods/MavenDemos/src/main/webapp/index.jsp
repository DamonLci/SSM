<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/24
  Time: 下午4:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="login.action">
    <label>登录名</label> <input name="userName" type="text"/>
    <label>密码</label> <input name="userPwd" type="password"/>
    <input type="submit" value="登录"/><br>
    <a href="GoodListAjax.jsp">Ajax主页列表</a>
    <a href="/goodsList.action">ModelAndView主页列表</a>


  </form>

  </body>
</html>
