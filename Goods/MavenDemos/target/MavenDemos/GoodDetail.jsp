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

</style>
<body>


<label>图片</label>${goodsBean.goodsImg}<br>
<label>价格</label>${goodsBean.goodsPrice}<br>
<label>名字</label>${goodsBean.goodsName}<br>
<label>类别</label>${goodsBean.category}<br>
<h1>评论</h1>
<input type="hidden" id="gid" value="${goodsBean.id}">
<div id="comment">

</div>
<%--<c:forEach items="${goodsBean.commentBeanSet}" var="comment">
    <label>评论人</label> ${comment.userName}
    <label>内容</label>${comment.commentContent}
    <label>时间</label> ${comment.date}<br>
</c:forEach><br>--%>
<input type="text" id="content"/>
<button onclick="comment()">提交</button>
<span id="success">评论成功</span>
<span id="logs">请登录</span>
<span id="errors">评论失败</span>


</body>
<script>
    function comment() {
        var jsons = {"commentContent": $("#content").val(),"gid":$("#gid").val()};
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
                    $("button").css("display", "none");
                    showComment();
                }

                else if (data == "log") {
                    $("#logs").css("display", "inline");
                    $("button").css("display", "none");
                }
                else if (data == "errs") {
                    $("#errors").css("display", "inline");
                    $("button").css("display", "none");
                }
            }
        })
    }
    
    function showComment() {
        var jso ={"gid":$("#gid").val()};
        $.ajax({
            url:"showComment.action",
            type:"post",
            dataType: "json",
            async: true,
            data:
               "gid="+$("#gid").val()+"",

            success: function (data) {
                var content="";
                for(var i=0;i<data.length;i++){
                    alert(data.length);
                    var comment=data[i];
                    content+="<label>评论人</label>"+comment.userName+
                        "<label>内容</label>"+comment.commentContent+
                        "<label>时间</label>"+comment.time+"<br>"
                }
                $("#comment").html(content);
            }

        })
    }
    showComment();
</script>
</html>
