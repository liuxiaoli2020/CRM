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
	
	<title>添加供应商</title>
	<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
	<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
	</head>
<body>
<article class="page-container">
	<form action="cgctrl/addSupplier.do" method="post" class="form form-horizontal" id="form-member-add">
		<table class="table table-bg">
        <tbody>
          <tr>
           	<input type="hidden" value="${cs.supplierId }"  id="supplierId" name="supplierId">
            <th width="100" class="text-r"><span class="c-red">*</span> 供应商名称：</th>
            <td>
            <input type="text" class="input-text" style="width: 350px" value="${cs.supplierName }" placeholder="请输入供应商名称（100字以内）" id="supplierName" name="supplierName">
            </td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 供应商简称：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierFname }"  id="supplierFname" name="supplierFname"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 联系人：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierContacts }" id="supplierContacts" name="supplierContacts"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 固定电话：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierFixed }" name="supplierFixed" id="supplierFixed"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 移动电话：</th>
            <td>
             <input type="text" style="width:300px" class="input-text" value="${cs.supplierMobile }" name="supplierMobile" id="supplierMobile">
             </td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 联系传真：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierFax }"  id="supplierFax" name="supplierFax"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 联系地址：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierAddress }"  id="supplierAddress" name="supplierAddress"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 联系邮编：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierPostcode }" id="supplierPostcode" name="supplierPostcode"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 邮箱：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierEmail }"  id="txtEmail" name="supplierEmail"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 开户银行：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierBank }" id="supplierBank" name="supplierBank"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 银行账户：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierBankNum }"  id="supplierBankNum" name="supplierBankNum"></td>
          </tr>
          <tr>
            <th class="text-r"> 公司主页：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.supplierCompanyHomepage }"  id="supplierCompanyHomepage" name="supplierCompanyHomepage"></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 是否有效：</th>
            <td><input type="radio" name="supplierEffective" value="yes">有效
            <input type="radio" name="supplierEffective" value="no" >无效</td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 操作人员：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${cs.staffId }"  id="staffId" name="staffId"></textarea></td>
          </tr>
          <tr>
            <th class="text-r"> 备注信息：</th>
            <td><textarea class="input-text" name="supplierRemark" id="supplierRemark" style="height:100px;width:300px;">${cs.supplierRemark }</textarea></td>
          </tr>
          <tr>
            <th class="text-r"><span class="c-red">*</span> 公司编号：</th>
            <td><input type="text" style="width:300px" class="input-text" value="${co.companyId }" id="companyId" name="companyId"></td>
          </tr>
          <tr>
            <th class="text-r">最后修改时间：</th>
            <td><%Date date=new Date();
			       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			       String nowtime=sdf.format(date);
			      %>
				<input type="hidden" class="input-text" value="<%=nowtime %>" id="lastModifyDate" name="lastModifyDate">
			    <%=nowtime %></td>
          </tr>
          
          <tr>
            <th></th>
            <td><button class="btn btn-success radius" type="submit"><i class="icon-ok"></i> 确定</button></td>
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
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
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
			supplierName:{
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
			var state;
            $("#txtEmail").blur(function () {
                if ($(this).val() == '') {
                	alert("邮箱不能为空");
                }
                else {
                    if (/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test($(this).val()) == false) {
                        alert("邮箱格式不正确，请重新填写")
                    }
                    else {
                      
                        state=true;
                    }
                }
            });
});

</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
