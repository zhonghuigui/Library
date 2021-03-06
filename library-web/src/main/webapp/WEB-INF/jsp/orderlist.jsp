
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../../css/style.css" />
</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<div class="userMenu">
			<ul>
				<li><a href="../bookpage">首页</a></li>
				<li class="current"><a href="../../findallorder">我的订单</a></li>
				<li><a href="car/putcar">购物车</a></li>
				<li><a href="../loginout">注销</a></li>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list orderList">
		<form method="get" name="show" action="shopping-success.html">
			<table>
				<tr class="title">
					<th class="orderId">订单编号</th>
					<th>订单商品</th>
					<th class="userName">收货人</th>
					<th class="orderPrice">订单金额</th>
					<th class="date">下单时间</th>
					<th class="orderStatus">订单状态</th>
				</tr>
             <c:forEach items="${list.content}" var="v">
				<tr>
					<td>${v.orderId}</td>


					<td class="thumb"><c:forEach items="${v.bookVoList}" var="g">
						<img src="${g.bookPicture}"  width="100px" height="150px">
					</c:forEach>
					</td>
					<td>${sessionScope.user.userName}</td>
					<td>${v.orderPrice}</td>
					<td>${v.date}</td>
					<td>${v.orderStatus}</td>
				</tr>
			</c:forEach>
			</table>
			</form>
			<div class="page-spliter">
				<a href="orderpage?page=${currpage-1}">&lt;</a>
				<a href="orderpage">首页</a>
				<c:forEach begin="1" end="${list.totalPages}" var="p">
					<span class="current"><a href="orderpage?page=${p-1}">${p}</a></span>
				</c:forEach>
				<a href="orderpage?page=${list.totalPages-1}">尾页</a>
				<a href="orderpage?page=${currpage+1}">&gt;</a>
			</div>
			<div class="button"><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /></div>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
