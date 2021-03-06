<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/7
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <link type="text/css" rel="stylesheet" href="../css/style.css" />
  <script type="text/javascript" src="../js/jquery-3.0.0.js"></script>
</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <div class="userMenu">
      <ul>
        <li><a href="../bookpage">首页</a></li>
        <li><a href="findallorder">我的订单</a></li>
        <li class="current"><a href="car/putcar">购物车</a></li>
        <li><a href="../loginout">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="list bookList">
    <form method="post" name="shoping" action="../addorder">
      <table>
        <tr class="title">
          <th class="view">图片预览</th>
          <th>书名</th>
          <th class="nums">数量</th>
          <th class="price">价格</th>
          <th class="count">小计</th>
          <th class="del">删除</th>
        </tr>
        <%--<c:set var="ji" value="0"></c:set>--%>
        <c:forEach var="v" items="${car}">
        <tr>
          <td class="thumb"><img src="${v.value.bookPicture}" /></td>
          <td class="title">${v.value.bookName}</td>
          <td><input class="input-text" type="text" name="nums" value="${v.value.count}"
                     bookid="${v.value.bookId}" price="${v.value.bookPrice}" /></td>
          <td>￥${v.value.bookPrice}</td>
          <td class="cc"><span>￥${v.value.bookPrice*v.value.count}</span></td>
          <td><a href="javascript:void(0)" class="del" bookid="${v.value.bookId}">删除</a></td>
          <%--<c:set var="ji" value="${ji+v.value.bookPrice*v.value.count}"></c:set>--%>
        </tr>
        </c:forEach>

      </table>
      <div class="button">
        <h4>总价：￥ <%--${ji}--%><span class="sum"> </span> 元</h4>

        <input class="input-chart" type="submit" name="submit" value="" />
      </div>
    </form>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
<script>
  $(function(){
    $(".input-text").blur(function(){
        var c=$(this).val();
        var p=$(this).attr("price");
        //先改本地小计
        $(this).parent().next().next().children("span").html(c*p);
        //再改服务器
      $.post("updatebook",{"bookId":$(this).attr("bookid"),"count":$(this).val()},function(a){
        $(".sum").html(a);
      });
    });

    $(".del").click(function(){
      $(this).parents("tr").fadeOut(2000).remove();
      $.post("delbook",{"bookId":$(this).attr("bookid")},function(a){
        $(".sum").html(a);
      });
    });
  });
</script>
</body>
</html>
