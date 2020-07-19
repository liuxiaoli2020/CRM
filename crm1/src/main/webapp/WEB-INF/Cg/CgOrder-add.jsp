<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"	 %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<!--/meta 作为公共模版分离出去-->
	
	<title>添加采购单</title>
	<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
	<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
	</head>
<body>
<article class="page-container">
	<form action="cgctrl/addOrder.do" method="post" class="form form-horizontal" id="form-member-add">
		<table class="table table-bg">
        <tbody>
          <tr>
           	<input type="hidden" value="${co.orderId }"  id="orderId" name="orderId">
            <th width="100" class="text-r"><span class="c-red">*</span> 采购主题：</th>
            <td>
            <input type="text" class="input-text" style="width: 350px" value="${co.orderTheme }" placeholder="请输入采购主题（100字以内）" id="orderTheme" name="orderTheme">
            </td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 采购日期：</th>
            <td> 
            <div class="text-c"><input style=" margin-left: -490px;width: 120px" type="text" value="<fmt:formatDate value="${co.orderBydate }" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')||\'%y-%M-%d\'}' })" id="datemin" name="orderBydate" class="input-text Wdate" style="width:120px;"></div></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 供应商编号：</th>
            <td>
            <select>
            <option>选择供应商</option>
            <c:forEach items="${o.list }" var="op">
            <c:if test="${op.supplierEffective=='yes' }">
            	<option value="${op.supplierId }">${op.supplierId }(${op.supplierFname })</option>
            	</c:if>
            	</c:forEach>
            </select>
            <%-- <input type="text" style="width:300px" class="input-text" value="${co.supplierId }"  id="supplierId" name="supplierId">--%></td>
          </tr> 
          <tr>
            <th class="text-r"><span class="c-red">*</span> 贷款金额：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.orderLoan }" id="orderLoan" name="orderLoan"><span>/元</span></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 发票号码：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.invoiceId }" name="invoiceId" id="invoiceId"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 付款情况：</th>
            <td>
            <input type="radio" id="orderIspya" name="orderIspya" value="yes"> 已付款
            <input type="radio" id="orderIspya1" name="orderIspya" value="no" checked="checked"> 未付款
            </td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 采购进展：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.orderProgress }"  id="orderProgress" name="orderProgress"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 交货时间：</th>
            <td><div class="text-c"><input style=" margin-left: -490px;width: 120px" type="text" value="<fmt:formatDate value="${co.orderDeliveryDate }" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')||\'%y-%M-%d\'}' })" id="datemax" name="orderDeliveryDate" class="input-text Wdate" style="width:120px;"></div></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 交货地点：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.orderDeliveryPalce }" id="orderDeliveryPalce" name="orderDeliveryPalce"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 交货方式：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.orderDeliveryMode }"  id="orderDeliveryMode" name="orderDeliveryMode"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 操作人员：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.staffId }" id="staffId" name="staffId">${co.staffId }</td>
          </tr>
          <tr>
            <th class="text-r">备注信息：</th>
            <td><textarea class="input-text" name="orderRemark" id="orderRemark" style="height:100px;width:300px;">${co.orderRemark }</textarea></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 公司编号：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.supplierId }" id="companyId" name="companyId"></td>
          </tr>
          <tr>
            <th class="text-r">最后修改时间：</th>
            <td><%Date date1=new Date();
			       SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			       String nowtime1=sdf1.format(date1);
			      %>
				<input type="hidden" class="input-text" value="<%=nowtime1 %>" id="lastModifyDate" name="lastModifyDate">
			    <%=nowtime1 %></td>
          </tr>
          
          <tr>
            <th></th>
            <td><button class="btn btn-success radius" type="submit" onclick=""><i class="icon-ok"></i> 确定</button></td>
          </tr>
        </tbody>
      </table>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="<%=basePath%>/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules:{
			orderTheme:{
				required:true,
			},
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			//parent.$('#btn-refresh').click();
			
			parent.layer.msg('操作成功!',{icon: 6,time:1000});
			window.parent.location.reload();//刷新父页面
			parent.layer.close(index);
			
			
		}
	});
});


</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
