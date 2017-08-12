<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>用户主页</title>
    <%
        String path=request.getContextPath();
    %>
</head>
<frameset rows="90,*" cols="*" frameborder="no" border="0" framespacing="0">
    <frame src="<%=path%>/pages/Home/Vip/top.jsp" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" title="topFrame" />
    <frameset cols="230,*" frameborder="no" border="0" framespacing="0">
        <frame src="<%=path%>/FrontControl/LeftFrame.do" name="leftFrame"  noresize="noresize" id="leftFrame" title="leftFrame" style="overflow-x:hidden;overflow-y:auto;" scrolling="no" />
        <frame src="<%=path%>/FrontControl/RightFrame.do" name="rightFrame" id="rightFrame" title="rightFrame" scrolling="no" />
    </frameset>
</frameset>

</html>
