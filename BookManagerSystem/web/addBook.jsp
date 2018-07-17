<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/16
  Time: 上午1:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addBook" method="post" >
    <label>书籍名称</label><input type="text" name="bookBean.bookName"/> <br/>
    <label>书籍图片</label><input type="text" name="bookBean.bookImg"/> <br/>
    <label>书籍作者</label><input type="text" name="bookBean.bookAuthor"/> <br/>
    <label>书籍出版社</label><input type="text" name="bookBean.bookPublish"/> <br/>
    <label>书籍出版时间</label><input type="text" name="bookBean.bookPublishTime"/> <br/>
    <label>书籍价格</label><input type="text" name="bookBean.bookPrice"/> <br/>
    <label>书籍数量</label><input type="text" name="bookBean.bookCount"/> <br/>
    <label>数据描述</label><input type="text" name="bookBean.bookDescribe"/> <br/>

    <button type="submit">提交</button>
</form>


</body>
</html>
