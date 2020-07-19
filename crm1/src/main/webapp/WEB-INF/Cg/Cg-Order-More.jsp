<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"	 %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link rel="Bookmark" href="/favicon.ico" >
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
	<link rel="Shortcut Icon" href="/favicon.ico" />
	<!--[if lt IE 9]>
	<script type="text/javascript" src="lib/html5shiv.js"></script>
	<script type="text/javascript" src="lib/respond.min.js"></script>
	<![endif]-->
	<!--[if IE 6]>
	<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<style type="text/css">
	
	</style>
  </head>
  
  <body>
  
 
   <table style="width: 600px; height: 500px">
        <tbody>
        <tr>
            <th style="width: 50px ; text-align: right;"> 采购单编号：</th>
            <td style="width: 100px">${co.orderId }</td>
            <th style="text-align: right;"> 采购主题：</th>
            <td>${co.orderTheme }</td>
         <tr>
            <th style="text-align: right;" > 采购日期：</th>
            <td><fmt:formatDate value="${co.orderBydate }" pattern="yyyy-MM-dd"/></td>
            <th style="text-align: right;"> 供应商编号：</th>
            <td>${co.supplierId }</td>
          </tr>
          <tr>
            <th style="text-align: right;">贷款金额：</th>
            <td>${co.orderLoan }<span>元</span></td>
            <th  style="text-align: right;">发票号码：</th>
            <td>${co.invoiceId }</td>
          </tr>
          <tr>
            <th style="text-align: right;">付款情况：</th>
            <td>${co.orderIspya==yes ? "已付款" : "未付款" }</td>
            <th style="text-align: right;">采购进展：</th>
            <td>${co.orderProgress }</td>
         </tr>
         <tr>
            <th style="text-align: right;">交货时间：</th>
            <td><fmt:formatDate value="${co.orderDeliveryDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <th style="text-align: right;">交货地点：</th>
            <td>${co.orderDeliveryPalce }</td>
          </tr>
          <tr>
            <th style="text-align: right;">交货方式：</th>
            <td>${co.orderDeliveryMode }</td>
            <th style="text-align: right;">操作人员：</th>
            <td>${co.staffId }</td>
          </tr>
          <tr>
            <th style="text-align: right;">公司编号：</th>
            <td>${co.companyId }</td>
            <th style="text-align: right;">订单最后修改时间：</th>
            <td><fmt:formatDate value="${co.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
          </tr>
           <tr>
            <th style="text-align: right;">备注信息：</th>
            <td rowspan="3" colspan="4"><textarea style="width: 100% ; height: 100%">${co.orderRemark }</textarea></td>
            <td></td>
            <td></td>
          </tr>
        </tbody>
      </table>
      <hr>
      <div>
      <div class="btn_more">
      <button type="button" style="color: #429842; margin-left: 420px"><a href="javascript:show();" id="btn" class="btn">订单详情信息<i class="Hui-iconfont">&#xe6d5;</i></a></button>
       </div>
      <table id="more" style="display:none; width: 600px; height: 100px">
      <tbody>
      	<tr>
            <th style="width: 150px ; text-align: right;">采购单详情编号：</th>
            <td style="width: 100px ;">${cd.orderDetailId }</td>
            <th style="text-align: right;">产品编号：</th>
            <td>${cd.productId }</td>
          </tr>
          <tr>
            <th  style="text-align: right;">产品数量：</th>
            <td>${cd.productNum }</td>
            <th  style="text-align: right;">产品价格：</th>
            <td>${cd.productPrice }<span>/元</span></td>
          </tr>
          <tr>
            <th  style="text-align: right;">是否入库：</th>
            <td>${cd.productWarehousing=="yes" ? "已入库" : "未入库" }</td>
            <th  style="text-align: right;">最后修改时间：</th>
            <td><fmt:formatDate value="${cd.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
          </tr>
      </tbody>
      </table>
      </div>
      <script type="text/javascript">
      function show(){
            document.getElementById("more").style.display = "block";
            document.getElementById('btn').innerHTML="订单详情信息&#xe6d6;";
            document.getElementById('btn').href="javascript:hide();";
        }

        function hide(){
            document.getElementById('more').style.display='none';
            document.getElementById('btn').innerHTML="订单详情信息&#xe6d5;";
            document.getElementById('btn').href="javascript:show();";
        }
        </script>
        
  </body>
</html>