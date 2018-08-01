<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/25
  Time: 下午11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Title</title>
    <script src="js/jQuery-2.2.2.js"></script>
</head>
<style type="text/css">
    #outer {
        width: 1000px;
        height: 650px;
        border: 1px solid black;
        margin: 0 auto;
    }

    #head {
        width: 300px;
        height: 100px;
        border: 1px solid black;
        margin-top: 100px;
        margin-left: 100px;
        font-size: 25;
    }

    #body {
        width: 800px;
        height: 250px;
        border: 1px solid black;
        margin: 20px auto;
    }

    #title div {
        width: 25%;
        float: left;
    }

    #content div {
        width: 25%;
        float: left;
    }

    #turnpage {
        position: absolute;
        width: 300px;
        height: 30px;
        left: 550px;
        top: 600px;
        margin: 0 auto;
    }

    ul {
        list-style: none
    }

    #turnpage ul li {
        float: left;
    }
</style>
<body>
<%--<c:forEach items="${goodsBeans}" var="goods">
    <label>商品名字</label>${goods.goodsName}
    <label>商品类型</label>${goods.category}
    <label>价格</label>${goods.goodsPrice}
    <label>评论总数</label>${fn:length(goods.commentBeanSet)}
    <br>

</c:forEach>--%>
<body>
<div id="outer">
    <div id="head">欢迎${sessionScope.get("sadasdsa").userName}光临本店</div>
    <div id="body">
        <div id="title">
            <div>商品名</div>
            <div>单价</div>
            <div>类别</div>
            <div>评论数量</div>
        </div>
        <c:forEach items="${goodsBeans}" var="obj">
        <div id="content">
            <div>
                <a href="goodsDetail.action?id=${obj.id}">${obj.goodsName}</a>
            </div>
            <div>${obj.goodsPrice}</div>
            <div>${obj.category}</div>
            <div>${fn:length(obj.commentBeanSet)}</div>
        </div>
        </c:forEach>
<div id="contents"></div>
</body>
<script>
    function showPage(ppage) {
        $.ajax({
            url: "/queryPage.action",
            method: "post",
            async: true,
            dataType: "json",
            data: "currentPage=" + ppage + "",
            success: function (data) {
                var counts = data.count;
                var goods = data.goodsBeans;
                var totalPage = data.totalPage;
                var currentPage = data.currentPage;
                var content = "";
                for (var i = 0; i < goods.length; i++) {
                    var good=goods[i];
                    content += good.goodsName+good.category+good.goodsPrice
                }
                $("#contents").html(content);


            }
        })
    }

    //showPage(1);

</script>
</html>
