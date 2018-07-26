<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/7/25
  Time: 下午11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${goodsBeans}" var="goods">
    ${goods.goodsName}
    ${goods.category}
    ${goods.goodsPrice}
    ${fn:length(goods.commentBeanSet)}
    <br>

</c:forEach>

</body>
</html>
