<%--
  Created by IntelliJ IDEA.
  User: 贺俞凯
  Date: 2019/4/3
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>登入页面</title>
</head>
<body>
<div>
    <form action="<%=basePath%>user/login" method="post">
        <div style="text-align: center;margin-top: 100px;">
            <h3>${msg}</h3>
            <input type="text" name="name" placeholder="name">
            <input type="password" name="password" placeholder="password">
            <input type="submit" value="登入">
        </div>
    </form>
</div>
</body>
</html>



