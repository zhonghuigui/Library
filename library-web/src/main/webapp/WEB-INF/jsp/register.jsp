
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../../css/style.css" />
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(function(){

		})


	</script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<form method="" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="register">
	<div class="title">
		<h2>欢迎注册合众艾特网上书城</h2>
	</div>
	<div class="steps">
		<ul class="clearfix">
			<li class="current">1.填写注册信息</li>
			<li class="unpass">2.注册成功</li>
		</ul>
	</div>
	<form method="post" action="../../register_success.html">
		<dl>
			<dt>用 户 名：</dt>
			<dd><input class="input-text" type="text" name="userName" /><span>当前用户已存在！</span></dd>
			<dt>密　　码：</dt>
			<dd><input class="input-text" type="password" name="passWord" /><span>密码过于简单！</span></dd>
			<dt>确认密码：</dt>
			<dd><input class="input-text" type="password" name="rePassWord" /><span>两次密码输入不一致！</span></dd>
			<dt>Email地址：</dt>
			<dd><input class="input-text" type="text" name="email" /><span>邮箱输入不正确！</span></dd>
			<dt></dt>
			<dd class="button"><input class="input-reg" type="submit" name="register" value="注册" /></dd>
		</dl>
	</form>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
