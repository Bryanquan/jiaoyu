
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%
    String path=request.getContextPath();
%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Css/front/top_logo.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/public/Css/front/table.css">
    <script  src="<%=path%>/public/Js/jquery-1.8.0.min.js"></script>
    <title>院校信息查询</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <img src="<%=path%>/public/Image/top_logo.png">&nbsp;&nbsp;<span>首页</span>&gt;&nbsp;&nbsp;院校信息查询
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 p-note-col">
            <p class="p-note">&nbsp;&nbsp;&nbsp;&nbsp;各位考生，您可按专业名称或者专业名称，按院校隶属，院校类别，性质类别，办学类型，院校批次等院校属性以及所在省份来查询您所关注的院校。<label class="text-red">请注意，在本功能中，显示是正常批次（含本科一批，本科二批，本科三批）在湖南省有招生计划的院校信息数据。</label></p>
        </div>
    </div>

    <div id="checkcondition">
        <form action="{:U('School/selectschool')}" id="myform">
            <div class="row">
                <div class="col-md-8"><label>直接查询:</label>
                    <select name="fschool">
                        <option value="0">输入学校名称查询</option>
                    </select>
                    <input type="text" name="sschool" value="输入学校名称" class="input-name">
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 list">
                    <select class="first" name="sc_belong">
                        <option value="0">--院校隶属--</option>
                        <volist name="belong" id="bng">
                            <option value="{$bng.dictid}">{$bng.showname}</option>
                        </volist>
                    </select>
                    <select name="sc_category">
                        <option value="0">--院校类型--</option>
                        <volist name="category" id="cate">
                            <option value="{$cate.dictid}">{$cate.showname}</option>
                        </volist>
                    </select>
                    <select name="sc_property">
                        <option value="0">--性质类别--</option>
                        <volist name="property" id="prop">
                            <option value="{$prop.dictid}">{$prop.showname}</option>
                        </volist>
                    </select>
                    <select name="sc_kind">
                        <option value="0">--办学类型--</option>
                        <volist name="kind" id="kd">
                            <option value="{$kd.dictid}">{$kd.showname}</option>
                        </volist>
                    </select>
                    <select name="sc_pici">
                        <option value="0">--院校批次--</option>
                        <volist name="pici" id="pc">
                            <option value="{$pc.dictid}">{$pc.showname}</option>
                        </volist>
                    </select>
                </div>
            </div>
            <div class="col-md-12">
                <input type="submit"  value="查询" class="commit">
            </div>
        </form>
    </div>
    <div class="table-center">
        <table class="table table-striped table-hover table-condensed table-responsive table-bordered">
            <thead>
            <tr class="thead">
                <td>院校代码</td>
                <td>院校名称</td>
                <td>所在省市</td>
                <td>院校类别</td>
                <td>办学类型</td>
                <td>院校隶属</td>
                <td>211/985</td>
                <td>招生简章</td>
                <td>院校网址</td>
            </tr>
            </thead>
            <tbody>
            <volist name="school" id="sch">
                <tr>
                    <td>{$sch.sc_code}</td>
                    <td>{$sch.sc_name}</td>
                    <td>{$sch.sc_address}</td>
                    <volist name="category" id="cate">
                        <?php if($cate['dictid']==$sch['sc_category']):?>
                        <td>{$cate.showname}</td>
                        <?php endif;?>
                    </volist>
                    <volist name="kind" id="kd">
                        <?php if($kd['dictid']==$sch['sc_kind']):?>
                        <td>{$kd.showname}</td>
                        <?php endif;?>
                    </volist>
                    <volist name="belong" id="bng">
                        <?php if($bng['dictid']==$sch['sc_belong']):?>
                        <td>{$bng.showname}</td>
                        <?php endif;?>
                    </volist>
                    <volist name="belongtag" id="tag">
                        <?php if($tag['dictid']==$sch['sc_belongtag']):?>
                        <td>{$tag.showname}</td>
                        <?php endif;?>
                    </volist>
                    <td><a href="{$sch.sc_site}">{$sch.sc_site}</a></td>
                    <td><a href="{$sch.sc_site}">{$sch.sc_site}</a></td>
                </tr>
            </volist>
            </tbody>
        </table>
    </div>
    <div class="row" id="footer">
        <div class=""><p class="text-center" id="showpage"></p></div>
        <div class="text-center"><p><button id="prepage">上一页</button>&nbsp;&nbsp;<button id="nextpage">下一页</button></p></div>
    </div>
</div>
<script type="text/javascript">

    //获取页码数和记录总数
    pageNo="<?php echo $page?>";
    page=0;
    amount="<?php echo $amount?>";
    $(function()
    {
        $("#showpage").append("该项共有"+amount+"条数据，"+"此为第"+pageNo+"页数据");
        $("#nextpage").click(function(){
            pagetemp=parseInt(pageNo)+1;
            page=pagetemp.toString();
            var url="{:U('School/selectschool')}"+"?page=";
            url=url+page;
            $('#myform').attr('action', url);
            $('#myform').submit();
        });
        $("#prepage").click(function(){
            alert("上一页");
        });
    });


</script>
</body>
</html>
