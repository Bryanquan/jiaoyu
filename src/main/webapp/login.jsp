<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>用户登录</title>
    <style type="text/css">
        body
        {
          background:url("public/Image/login/login.jpg");
        }
    </style>
    <meta name="description" content="高考信息库用户登录页面">
    <link rel="stylesheet" type="text/css" href="public/Css/front/login.css">
    <script src="public/Js/jquery-1.8.0.min.js"></script>
</head>

<body>

<div class="login">
    <h1 class="title">用户登录</h1>
    <form action="Vip/login.do" method="post">
        <div>
            <input type="text" name="name" id="username" placeholder="username" />
        </div>
        <div>
            <input type="password" name="userpwd" id="password" placeholder="password" />
        </div>
        <button type="submit" class="submit_button">登录</button>
        <div class="fb-login-button" data-max-rows="1" data-size="medium" data-show-faces="false" data-auto-logout-link="true">

        </div>
    </form>
</div>

<div id="fb-root"></div>
</body>

</html>