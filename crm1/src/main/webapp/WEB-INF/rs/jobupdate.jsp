<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
	<link rel="stylesheet" type="text/css" href="../static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="../static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="../lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="../static/h-ui.admin/css/style.css" />
	<link rel="stylesheet" type="text/css" href="../static/h-ui/css/calendar.min.css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<!--/meta 作为公共模版分离出去-->
	
	<title>职位增加、修改</title>
	<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
	<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
	</head>
	<body>
	<article class="page-container">
		<form action="jupdate.do" method="post"   class="form form-horizontal" id="form-member-add">
		<!-- <form action="" method="" enctype="" class="form form-horizontal" id="updateform"> -->
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>职务名：</label>
			<div class="formControls col-xs-8 col-sm-9">
			    <input type="hidden" name="jobId" value="${j.jobId }">
				<input type="text" class="input-text" value="${j.jobName}" placeholder="" id="jobName" name="jobName">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red"></span>部门编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${j.branchId}" placeholder="" id="branchId" name="branchId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="notes" cols="" rows="" class="textarea"  placeholder="说点什么...100个字符以内" dragonfly="true" onKeyUp="$.Huitextarealength(this,100)">${j.notes}</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">公司编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${j.companyId}" placeholder="" id="companyId" name="companyId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">最后修改时间：</label>
			<div class="formControls col-xs-8 col-sm-9" id="datesWrap1" style="height: 100px">
			<%Date date=new Date();
			       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			       String nowtime=sdf.format(date);
			      %>
				<input type="hidden" class="input-text" value="<%=nowtime %>" id="lastModifyDate" name="lastModifyDate">
			<%=nowtime %>	
			</div>
		</div>
			<div class="row cl">
				<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				 <input class="btn btn-primary radius" type="submit"  value="&nbsp;&nbsp;提交&nbsp;&nbsp;">  
				
				 <!-- <input class="btn btn-primary radius" type="button" onclick="up1()"  value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
				 -->
				</div>
			</div>
		</form>
	</article>
	
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="../lib/jquery/1.9.1/jquery.min.js"></script> 
	<script type="text/javascript" src="../lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="../static/h-ui/js/H-ui.min.js"></script> 
	<script type="text/javascript" src="../static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="../static/h-ui/js/calendar.min.js"></script> 
	<!--请在下方写此页面业务相关的脚本--> 
	<script type="text/javascript" src="../lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript" src="../lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
	<script type="text/javascript" src="../lib/jquery.validation/1.14.0/validate-methods.js"></script> 
	<script type="text/javascript" src="../lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript">
	$(function(){
		$('.skin-minimal input').iCheck({
			checkboxClass: 'icheckbox-blue',
			radioClass: 'iradio-blue',
			increaseArea: '20%'
		});
		
	});
	$("#form-member-add").validate({
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			window.parent.location.reload();//刷新父页面
			//parent.$('.btn-refresh').click();
			parent.layer.msg('操作成功',{icon:6,time:1000});
			parent.layer.close(index);
		}
	});
	
	</script> 
	<!--/请在上方写此页面业务相关的脚本-->
	
	<script type="text/javascript">
	var opts1 = {//example 1 opts
	                'targetId':'lastModifyDate',//时间写入对象的id
	                'triggerId':['lastModifyDate','dateBtn1'],//触发事件的对象id
	                'alignId':'datesWrap1',//日历对齐对象
	                'format':'-',//时间格式 默认'YYYY-MM-DD HH:MM:SS'
	                'min':'2014-09-20 10:00:00',//最大时间
	                'max':'2020-10-30 10:00:00'//最小时间
	            };
	
	    //example 1:
	    xvDate(opts1);
	    
	    
	
	
	
	</script>
	</body>
	</html>