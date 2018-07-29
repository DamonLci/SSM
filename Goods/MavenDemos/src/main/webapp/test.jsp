<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/29
  Time: 上午12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jQuery-2.2.2.js"></script>
<body>

<input type="button" onclick="nextPage()" value="提交"/>
</body>
<script>

    function nextPage(){
        var jsonObj = {"id":"1","userName":"李刚","userPwd":"123"};
        $.ajax({
            url:"/queryPage.action",
            method:"post",
            async:true,
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(jsonObj),
            success:function(message){
                console.info(message);
            }
        });
    }
</script>
</html>
