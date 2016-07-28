<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Notebook</title>
</head>
<body>
<c:forEach items="${data}" var="n">
    <div>
        <div>${n.title}</div>
        <div>发表于${n.createTime}</div>
        <div>${n.content}</div>
    </div>
    <hr>
</c:forEach>
<form action="save.do" method="post">
    <div><label>标题</label><input name="title" /></div>
    <div><label>内容</label><textarea name="content" rows="5" cols="80"></textarea></div>
    <div><button>OK</button></div>
</form>
</body>
</html>
