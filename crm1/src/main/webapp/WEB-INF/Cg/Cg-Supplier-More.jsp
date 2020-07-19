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
	<link rel="Shortcut Icon" href="/favicon.ico" />
	<!--[if lt IE 9]>
	<script type="text/javascript" src="lib/html5shiv.js"></script>
	<script type="text/javascript" src="lib/respond.min.js"></script>
	<![endif]-->
	<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->

  </head>
  
  <body>
   <table class="table table-bg"style="width: 800px; height: 500px">
        <tbody>
        <tr>
            <th width="100" class="text-r">供应商编号：</th>
            <td>${cs.supplierId }</td>
          </tr>
          <tr>
            <th width="100" class="text-r"> 供应商名称：</th>
            <td>${cs.supplierName }</td>
          </tr>
          <tr>
            <th class="text-c">供应商简称：</th>
            <td>${cs.supplierFname }</td>
          </tr>
          <tr>
            <th class="text-r">联系人：</th>
            <td>${cs.supplierContacts }</td>
          </tr>
          <tr>
            <th class="text-c">固定电话：</th>
            <td>${cs.supplierFixed }<span>/元</span></td>
          </tr>
          <tr>
            <th class="text-r">移动电话：</th>
            <td>${cs.supplierMobile }	</td>
          </tr>
          <tr>
            <th class="text-r">联系传真：</th>
            <td>
            ${cs.supplierFax }
            </td>
          </tr>
          <tr>
            <th class="text-r">联系地址：</th>
            <td>${cs.supplierAddress }</td>
          </tr>
          <tr>
            <th class="text-r">联系邮编：</th>
            <td>${cs.supplierPostcode }</td>
          </tr>
          <tr>
            <th class="text-r">邮箱：</th>
            <td>${cs.supplierEmail }</td>
          </tr>
          <tr>
            <th class="text-r">开户银行：</th>
            <td>${cs.supplierBank }</td>
          </tr>
          <tr>
            <th class="text-r">银行账户：</th>
            <td>${cs.supplierBankNum }</td>
          </tr>
          <tr>
            <th class="text-r">公司主页：</th>
            <td>${cs.supplierCompanyHomepage }</td>
          </tr>
          <tr>
            <th class="text-r">是否有效：</th>
            <td>${cs.supplierEffective==yes ? "有效" : "失效" }</td>
          </tr>
          <tr>
            <th class="text-r">操作人员：</th>
            <td>${cs.staffId }</td>
          </tr>
          <tr>
            <th class="text-r">备注信息：</th>
            <td><textarea class="input-text" name="orderRemark" id="orderRemark" style="height:100px;width:300px;">${cs.supplierRemark }</textarea></td>
          </tr>
          <tr>
            <th class="text-r">公司编号：</th>
            <td>${cs.companyId }</td>
          </tr>
          <tr>
            <th class="text-r">最后修改时间：</th>
            <td><fmt:formatDate value="${cs.lastModifyDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
          </tr>
          
          <tr>
            <th></th>
            <td><button class="btn btn-success radius" type="button"><i class="icon-ok"></i> 确定</button></td>
          </tr>
        </tbody>
      </table>
  </body>
</html>
