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
<body>


<label>图片</label>${goodsBean.goodsImg}<br>
<label>内容</label>${goodsBean.goodsPrice}<br>
<label>名字</label>${goodsBean.goodsName}<br>
<label>类别</label>${goodsBean.category}<br>
<h1>评论</h1>

<c:forEach items="${goodsBean.commentBeanSet}" var="comment">
   <label>评论人</label> ${comment.userName}
    <label>内容</label>${comment.commentContent}
    <label>时间</label> ${comment.date}
</c:forEach><br>
<input type="text" id="content" />
<button onclick="comment()">提交</button>


</body>
<script>
    function comment() {
        var jsons={"commentContent":$("#content").val()};
        $.ajax({
            url:"comment.action",
            method:"post",
            async:true,
            dataType:'json',
            contentType:"application/json;charset=utf-8",
            data:
                JSON.stringify(jsons),

            success:function(data) {
            console.info(data);
        }
        })
    }
</script>
</html>
