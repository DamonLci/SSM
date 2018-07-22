<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/17
  Time: 下午3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border=1>
    <tr>
        <th>图书ID</th>
        <th>图书名字</th>
        <th>图书作者</th>
        <th>图书出版社</th>
        <th>图书价格</th>
        <th>图书库存</th>
        <th>图书描述</th>
        <th>图书出版时间</th>
        <th>图书图片</th>
    </tr>
    <tbody>
    <s:iterator value="#bookBeans">
        <tr>
            <td><s:property value="bookId"/></td>
            <td><s:property value="bookName"/></td>
            <td><s:property value="bookAuthor"/></td>
            <td><s:property value="bookPublish"/></td>
            <td><s:property value="bookPrice"/></td>
            <td><s:property value="bookCount"/></td>
            <td><s:property value="bookDescribe"/></td>
            <td><s:property value="bookPublishTime"/></td>
            <td><s:property value="bookImg"/></td>
            <td><a href="bookDetail?bookBean.bookId=<s:property value="bookId"  />">删除</a></td>
            <td><a href="#">删除</a></td>
        </tr>
    </s:iterator>
    </tbody>
</body>
</html>
