<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%String path=request.getContextPath();%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>用户主页</title>
    <link href="" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Css/front/common/left.css">
    <script  src="<%=path%>/public/Js/jquery-1.8.0.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <c:forEach items="${mainlist}" var="main">
                <div class="nav">
                    <dl>
                        <dd>
                            <div class="title"><span><c:out value="${main.title}"></c:out></span></div>
                            <c:forEach items="${sonlist}" var="son">
                               <c:if test="${main.id==son.pid}">
                                <li>
                                    <a href="${son.url}" target="rightFrame">
                                        <c:out value="${son.title}"></c:out>
                                    </a>
                                </li>
                                </c:if>
                            </c:forEach>
                        </dd>
                    </dl>
                </div>
            </c:forEach>
            <li><a href="<%=path%>/FrontControl/RightFrame.do" target="rightFrame">首页</a></li>
        </div>
    </div>
</body>
<script type="text/javascript">
</script>
</html>

