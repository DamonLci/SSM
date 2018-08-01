<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/26
  Time: 下午4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jQuery-2.2.2.js"></script>
<style>
    span {
        display: none;
        color: red;
    }
    #outer {
        height: 650px;
        width: 1000px;
        border: 1px black solid;
        text-align: center;
        margin: 0 auto;
    }

    #head {
        height: 150px;
        width: 1000px;
        border: 1px black solid;
        text-align: center;
        margin: 0 auto;
    }

    #body {
        height: 200px;
        width: 1000px;
        border: 1px black solid;
        text-align: center;
        margin: 0 auto;
    }

    #title {
        height: 20px;
        width: 1000px;
        border: 1px black solid;
        margin-top: 20px;
    }

    .person {
        width: 198px;
        float: left;
        border: 1px black solid;
    }

    .date {
        width: 298px;
        float: left;
        border: 1px black solid;
    }

    .content {
        width: 498px;
        float: left;
        border: 1px black solid;
    }

    #foot {
        width: 1000px;
        height: 150px;
        border: 1px black solid;
        margin-top: 20px;
    }

    #foot-left {
        width: 100px;
        text-align: center;
        height: 150px;
        line-height: 148px;
        float: left;
    }

    #foot-right {
        width: 900px;
        height: 150px;
    }

    #bottom {
        height: 30px;
        width: 500px;
        margin: 30px auto;
    }

    .button {
        float: left;
        margin-left: 100px;
    }
</style>


<body>


<%--<label>图片</label>${goodsBean.goodsImg}<br>
<label>价格</label>${goodsBean.goodsPrice}<br>
<label>名字</label>${goodsBean.goodsName}<br>
<label>类别</label>${goodsBean.category}<br>
<h1>评论</h1>--%>
<input type="hidden" id="gid" value="${goodsBean.id}">
<%--<div id="comment">

</div>--%>
<%--<c:forEach items="${goodsBean.commentBeanSet}" var="comment">
    <label>评论人</label> ${comment.userName}
    <label>内容</label>${comment.commentContent}
    <label>时间</label> ${comment.date}<br>
</c:forEach><br>--%>
<input type="text" id="content"/>


<div id="outer">
    <div id="head">
        <div>${goodsBean.goodsName}</div>
        <div>类型:${goodsBean.category}</div>
        <div>价格:${goodsBean.goodsPrice}</div>
    </div>
    <div id="title">
        <div class="person">评论人</div>
        <div class="date">评论内容</div>
        <div class="content">评论时间</div>
    </div>

    <div id="body">

    </div>
    <div id="foot">
        <div id="foot-left">评论内容：</div>

        <textarea id="foot-right"></textarea>
    </div>
    <div id="bottom">

        <div id="buttons" class="button">
            <button onclick="comment()">评论</button>
        </div>
        <div class="button">
            <button onclick="window.location.href='success.jsp'">返回主界面</button>
        </div>
        <span id="success">评论成功</span>
        <span id="logs"><a href="index.jsp"> 请登录</a></span>
        <span id="errors">评论失败</span>
    </div>

</div>

</body>
<script>
    function comment() {
        var jsons = {"commentContent": $("#foot-right").val(), "gid": $("#gid").val()};
        $.ajax({
            url: "comment.action",
            method: "post",
            async: true,
            dataType: 'json',
            contentType: "application/json;charset=utf-8",
            data:
                JSON.stringify(jsons),

            success: function (data) {
                if (data == "success") {
                    $("#success").css("display", "inline");
                    $("#buttons").css("display", "none");
                    showComment();
                }

                else if (data == "log") {
                    $("#logs").css("display", "inline");
                    $("#buttons").css("display", "none");
                }
                else if (data == "errs") {
                    $("#errors").css("display", "inline");
                    $("#buttons").css("display", "none");
                }
            }
        })
    }

    function showComment() {
        var jso = {"gid": $("#gid").val()};
        $.ajax({
            url: "showComment.action",
            type: "post",
            dataType: "json",
            async: true,
            data:
            "gid=" + $("#gid").val() + "",

            success: function (data) {
                var content = "";
                for (var i = 0; i < data.length; i++) {
                    // alert(data.length);
                    var comment = data[i];
                    content += "<div class='person'>" + comment.userName +"</div>"+
                        "<div class='date'>" + comment.commentContent +"</div>"+
                        "<div class='content'>" + comment.time +"</div>"
                }
                $("#body").html(content);
            }

        })
    }

    showComment();
</script>
</html>
