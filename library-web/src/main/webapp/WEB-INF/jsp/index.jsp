﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<div class="userMenu">
			<ul>
				<li class="current"><a href="index.html">User首页</a></li>
				<li><a href="orderlist.html">我的订单</a></li>
				<li><a href="shopping.html">购物车</a></li>
				<li><a href="loginout">注销</a></li>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list bookList">
		<form method="post" name="shoping" action="car/putcar">
			<table>
				<tr class="title">
					<th class="checker"></th>
					<th>书名</th>
					<th class="price">价格</th>
					<th class="store">库存</th>
					<th class="view">图片预览</th>
				</tr>
				<c:forEach items="${list.content}" var="v">
					<tr>
							<%--${v.bookId}--%>
						<td><input type="checkbox" value="${v.bookId}" name="bookId"/></td>
						<td>${v.bookName}</td>
						<td>${v.bookPrice}</td>
						<td>${v.bookCount}</td>
						<td><img src="${v.bookPicture}"></td>
					</tr>
				</c:forEach>
			</table>
			<div class="page-spliter">
				<a href="bookpage?page=${currpage-1}">&lt;</a>
				<a href="bookpage">首页</a>
					<c:forEach begin="1" end="${list.totalPages}" var="p">
					<span class="current"><a href="bookpage?page=${p-1}">${p}</a></span>
					</c:forEach>
				<a href="bookpage?page=${list.totalPages-1}">尾页</a>
				<a href="bookpage?page=${currpage+1}">&gt;</a>
			</div>
			<div class="button"><input class="input-btn" type="submit" name="submit" value="" /></div>
		</form>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有
</div>
</body>
</html>
