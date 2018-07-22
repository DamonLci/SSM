<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/19
  Time: 下午5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        img{
            width: 200px;
            height: 200px;
        }
        .mes{
            font-size:12px;
            color:red;
            display:none;
        }
    </style>
    <script src="js/jQuery-2.2.2.js" type="text/javascript"></script>
</head>
<body>

图书ID:<span id="bookId"><s:property value="bookBean.bookId" /></span><br>
图书名字:<span id="bookName"><s:property value="bookBean.bookName" /></span><br><span class="mes">图书已经存在</span>
图书作者:<span id="bookAuthor"><s:property value="bookBean.bookAuthor" /></span><br>
图书出版社:<span id="bookPublish"><s:property value="bookBean.bookPublish" /></span><br>
图书价格:<span id="bookPrice"><s:property value="bookBean.bookPrice" /></span><br>
图书库存:<span id="bookCount"><s:property value="bookBean.bookCount" /></span><br>
图书描述:<span id="bookDescribe"><s:property value="bookBean.bookDescribe" /></span><br>
图书出版时间:<span id="bookPublish"><s:property value="bookBean.bookPublishTime" /></span><br>
图书图片<s:property value="bookBean.bookId" /><br>
<img src="/upload/<s:property value="bookBean.bookImg"  />"/>


<s:debug></s:debug>
</body>

</html>
