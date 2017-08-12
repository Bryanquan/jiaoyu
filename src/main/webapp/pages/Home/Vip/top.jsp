
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="static com.util.SessionUtil.getSessionUser" %>
<%
    /**
     * 获得项目的根目录
     */
    String path=request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Css/front/common/top.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title></title>
</head>
<body>
<div class="container">
    <div class="main">
        <p class="lap"><label class="lab">高校信息录取信息库</label></p>
        <a href="<%=path%>/pages/Home/Vip/top.jsp" class="index">系统首页</a>
        <img src="<%=path%>/public/Image/top.png">
        <p><label>当前用户:<%=getSessionUser(request).getLoginname()%></label></p>
        <a href="<%=path%>/Vip/loginout.do" target="_top" class="out">退出登录</a>
    </div>
</div>
</body>
</html>
