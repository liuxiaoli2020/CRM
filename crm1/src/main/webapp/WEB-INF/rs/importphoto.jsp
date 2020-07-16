<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
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
	<title>导入员工照片</title>
	<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
	<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
	</head>
	<body>
	
	<article class="page-container">
	<div id="import-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:500px; padding:10px;">
		<form action="importphoto1.do" method="post" enctype="multipart/form-data" class="form form-horizontal" id="form-admin-add">
		
		<div class="row cl">
		<label class="form-label col-xs-6 col-sm-4" style="font-size: 18px">导入文件照片：</label>
			<div class="col-xs-8">
			    <input type="file" id="myfiles" name="myfiles" class="" readonly="readonly" data-options="required:true, missingMessage:'请选择文件'" multiple >
			    
			    <input class="btn btn-primary radius" id="btn" type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			    <!-- <a onclick="upload()" id="select-file-btn" class="btn btn-success radius"  style="lo">确定</a> -->
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input type="file" id="excel-file" style="display:none;" onchange="selected()">
				<!-- <a onclick="upload()" id="select-file-btn" class="btn btn-success radius"  style="lo">确定</a> -->
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<h2>
				${param.msg=="error1" ? "请选择文件!" : "" }
		        ${param.msg=="error2" ? "文件大小不要超过5M!" : "" }
		        ${param.msg=="error3" ? "请上传最新xls,xlsx格式的文件!" : "" }
		       </h2>
			</div>
		</div>
		</form>
	</div>
	<div id="process-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-upload',title:'正在上传文件'" style="width:450px; padding:10px;">
	<div id="p" class="easyui-progressbar" style="width:400px;" data-options="text:'正在上传中...'"></div>
	</div>
	</article>
	
	<!--_footer 作为公共模版分离出去--> 
	<script type="text/javascript" src="../lib/jquery/1.9.1/jquery.min.js"></script> 
	<script type="text/javascript" src="../lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="../static/h-ui/js/H-ui.min.js"></script> 
	<script type="text/javascript" src="../static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="../static/h-ui/js/calendar.min.js"></script> 
	<!--请在下方写此页面业务相关的脚本-->
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
		
		$("#btn").click(function() {
	       var formData = new FormData();
		   for(var i=0;i<$("#myfiles")[0].files.length;i++){
		      formData.append('myfiles',$("#myfiles")[0].files[i]);
		   }
			
			
			$.ajax({
				url:'importphoto1.do',
				type:'post',
				data:formData,
				contentType:false,
				processData:false,
				success:function(data){
					var index = parent.layer.getFrameIndex(window.name);
					window.parent.location.reload();//刷新父页面
					parent.layer.msg('操作成功',{icon:6,time:1000});
					parent.layer.close(index);
				},
				error:function(data){
					alert("消息提醒","上传失败!","warning");
				}
				});
		});
		
	});
	
	
	</script> 
	
	<script type="text/javascript">
	function selected(){
		$("#import-filename").val($("#excel-file").val());
	}
	
	/* var msg="${param.msg}";
	if(msg=="error1"){
	alert()
	layer.msg('请选择文件!', {icon: 5,time:3000});
	}else if(msg=="error2"){
	layer.msg('文件大小不要超过5M!', {icon: 5,time:3000});
	}else if(msg=="error3"){
	layer.msg('请上传最新xls,xlsx格式的文件!', {icon: 5,time:3000});
	} */
	
	
	
	function uploadFile(){
		$("#excel-file").click();
		
	}
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
	
	
	</body>
	</html>