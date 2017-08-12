
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Dist/css/bootstrap.min.css">
    <title>用户主页</title>
    <style type="text/css">

        p.title{
            margin-top:30px;
            font-size: 18px;
        }
        div.article p
        {
            height: 18px;
        }
        body
        {
            background-color: rgb(237, 237, 237);
        }
        @media (max-width: 980px)
        {
            p{
                height: 30px;
                margin-left: 40px;
                float: block;
                font-size: 18px;
            }
            .col-md-6
            {
                display: block;
                width: 700px;
            }
            h2{
                margin-left: 40px;
            }
            #md-2
            {
                margin-top: 30px;
            }
        }
        li{
            list-style: none;
            height: 30px;
            margin-top:10px;
        }
        li.li-first{
            margin-top: 18px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <p class="title">您好,欢迎光临波哥高校信息查询测试系统</p>
            <div class="article">
                <p> &nbsp; &nbsp; &nbsp; &nbsp;不要只因一次失败，就放弃你原来决心想达到的目的。不要放弃你
                </p><p>的幻想。当幻想没有了以后，你还可以生存，但是你虽生犹死。我想揭示</p><p>大自然的秘密，用来造福人类。我认为，在我们的短暂一生中，最好的贡</p><p>献莫过于此了。理想是指路明灯。没有理想，就没有坚定的方向；没有方<p>向，就没有生活。冬天来了，春天还会远吗？如果你怀疑自己，那么你的<p>立足点确实不稳固了。如果你想走到高处，就要使用自己的两条腿！不要</p><p>让别人把你抬到高处；不要坐在别人的背上和头上。就是在我们母亲的膝</p><p>上，我们获得了我们的最高尚、最真诚和最远大的理想，但是里面很少有</p><p>任何金钱。生活没有目标就像航海没有指南针。有些理想曾为我们引过</p><p>道路，并不断给我新的勇气以欣然面对人生，那些理想就是——真、善、</p><p>美。人生重要的事情就是确定一个伟大的目标，并决心实现它。具有新想</p><p>法的人在其想法实现之前是个怪人。实现明天理想的唯一障碍是今天的疑</p><p>虑。如果一个目的是正当而必须做的，则达到这个目的的必要手段也是正</p><p>当而必须采取的困难坎坷是人们的生活教科书。失败乃成功之母。人就是</p><p>人，是自己命运的主人。没有伟大的意志力，便没有雄才大略。惊涛骇</p><p>浪，方显英雄本色。一息若存，希望不灭。人必须有自信，这是成功的秘</p><p>密。生命不止，奋斗不息。千里之行，始于足下。强者能同命运的风暴抗</p><p>争。</p>
            </div>
        </div>
        <div class="col-md-6" id="md-2">
            <h2>软件信息&gt;&gt;</h2>
            <ul>
                <li class="li-first">操作系统:<span><%out.print(System.getProperty("os.name"));%></span></li>
                <li>java版本:<span>
                          <%out.print(System.getProperty("java.version"));%>
                </span>

                </li>
                <li>服务器版本号： <span>
                      <%= application.getServerInfo() %>
			        	</span></li>
                <li>服务器端口号： <span>
                      <%= request.getServerPort()%>
			        	</span></li>
                <li>网络协议： <span>
                      <%= request.getProtocol()%>
			        	</span></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>

