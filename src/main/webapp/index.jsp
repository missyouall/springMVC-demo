<%@ page language="java"  pageEncoding="utf-8" contentType="text/html; UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/main.css" charset="UTF-8">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<html>
<body>
<div class="main">
<h2 align="center">测试系统</h2>
<form action="user/loginCheck" align="center" method="post" onsubmit="return check()">
    用户名:<input type="text" name="userName" class="jj"/><span id="nameInfo"></span><br/>
    密&nbsp;码:<input type="password" id="passWord" class="jj"><span id="passInfo"></span><br/>
    <button type="submit" class="jj">登录</button>
</form>
</div>
</body>
<script>
    $(document).ready(function () {
    })
    function check() {
        var userName = $("[name='userName']").val();
        var password = $("#passWord").val();
        if(userName=""){
            $("#nameInfo").text("请填写用户名");
            return false;
        }else if(password=""){
            alert("请填写密码");
            return false;
        }
        return true;
    }
</script>
</html>
