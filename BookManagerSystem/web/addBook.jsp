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
    <style>
        .mes {
            font-size: 12px;
            color: red;
            display: none;
        }
    </style>

</head>
<script src="js/jQuery-2.2.2.js" type="text/javascript"></script>
<body>
<form action="addBook" method="post" enctype="multipart/form-data">
    <label>图片选择</label><input type="file" id="xdaTanFileImg" onchange="xmTanUploadImg(this)" accept="image/*"
                              name="f.uploadImage"/><img id="xmTanImg"/>
    <div id="xmTanDiv"></div>
    <input type="button" value="隐藏图片" onclick="document.getElementById('xmTanImg').style.display = 'none';"/>
    <input type="button" value="显示图片" onclick="document.getElementById('xmTanImg').style.display = 'block';"/><br/>
    <label>书籍名称</label><input type="text" id="bookName" name="bookBean.bookName" onblur="checkBook()"/> <span
        class="mes">图书已经存在</span><br/>
    <label>书籍作者</label><input type="text" name="bookBean.bookAuthor"/> <br/>
    <label>书籍出版社</label><input type="text" name="bookBean.bookPublish"/> <br/>
    <label>书籍出版时间</label><input type="text" name="bookBean.bookPublishTime"/> <br/>
    <label>书籍价格</label><input type="text" name="bookBean.bookPrice"/> <br/>
    <label>书籍数量</label><input type="text" name="bookBean.bookCount"/> <br/>
    <label>数据描述</label><input type="text" name="bookBean.bookDescribe"/> <br/>

    <button type="submit" id="sub">提交</button>
</form>


</body>
<script>

    function checkBook() {

        $.ajax({
            type: "post",
            url: "/checkBook",
            anync: true,
            dataType: "json",
            data: {
                bookName: $("#bookName").val(),
            },


            success: function (mes) {

                if (mes == "\"error\"") {
                    $(".mes").css("display", "inline");
                    $("#sub").css("display","none");
                    console.info(mes);
                }
                if(mes=="\"success\""){
                    $(".mes").css("display", "none");
                    $("#sub").css("display","inline");
                }
            }
        })
    }
</script>
<script type="text/javascript">
    //判断浏览器是否支持FileReader接口
    if (typeof FileReader == 'undefined') {
        document.getElementById("xmTanDiv").InnerHTML = "<h1>当前浏览器不支持FileReader接口</h1>";
        //使选择控件不可操作
        document.getElementById("xdaTanFileImg").setAttribute("disabled", "disabled");
    }

    //选择图片，马上预览
    function xmTanUploadImg(obj) {
        var file = obj.files[0];

        console.log(obj);
        console.log(file);
        console.log("file.size = " + file.size);  //file.size 单位为byte

        var reader = new FileReader();

        //读取文件过程方法
        reader.onloadstart = function (e) {
            console.log("开始读取....");
        }
        reader.onprogress = function (e) {
            console.log("正在读取中....");
        }
        reader.onabort = function (e) {
            console.log("中断读取....");
        }
        reader.onerror = function (e) {
            console.log("读取异常....");
        }
        reader.onload = function (e) {
            console.log("成功读取....");

            var img = document.getElementById("xmTanImg");
            img.src = this.result;
            //或者 img.src = this.result;  //e.target == this
        }

        reader.readAsDataURL(file)
    }
</script>
</html>
