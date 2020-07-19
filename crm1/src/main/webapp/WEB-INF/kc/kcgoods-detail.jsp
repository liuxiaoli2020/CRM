<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico">
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>添加仓库</title>
<meta name="keywords"
	content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description"
	content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
	<article class="page-container">
	<form action="" method="post" class="form form-horizontal">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">ID：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.goodsId }"
					id="goodsId" name="goodsId">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.goodsName }"
					id="goodsName" name="goodsName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品种类：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.goodsKind }"
					id="goodsKind" name="goodsKind">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品单位：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.goodsUnit }"
					id="goodsUnit" name="goodsUnit">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">仓库编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.depotId }"
					id="depotId" name="depotId">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">库存数量：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.stockNumber }"
					id="stockNumber" name="stockNumber">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">公司编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.companyId }"
					id="companyId" name="companyId">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品成本：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.goodsCost }"
					id="goodsCost" name="goodsCost">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品售价：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.goodsSale }"
					id="goodsSale" name="goodsSale">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品经销价：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${goods.goodsMiddle }"
					id="goodsMiddle" name="goodsMiddle">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品说明：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="goodsExplain" cols="" rows="" class="textarea"
					onKeyUp="$.Huitextarealength(this,100)">${goods.goodsExplain }</textarea>
				<p class="textarea-numberbar">
					<em class="textarea-length">0</em>/100
				</p>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">商品备注：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="remarkMessage" cols="" rows="" class="textarea"
					onKeyUp="$.Huitextarealength(this,100)">${goods.remarkMessage }</textarea>
				<p class="textarea-numberbar">
					<em class="textarea-length">0</em>/100
				</p>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">修改时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<fmt:formatDate value="${goods.lastModifiedTime }"
					pattern="yyyy-mm-dd hh-mm-ss" />
			</div>
		</div>
	</form>
	</article>

	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript"
		src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});
	
			$("#form-member-add").validate({
				rules : {
					goodsName : {
						required : true,
					},
				},
				onkeyup : false,
				focusCleanup : true,
				success : "valid",
				submitHandler : function(form) {
					$(form).ajaxSubmit();
					var index = parent.layer.getFrameIndex(window.name);
					//parent.$('#btn-refresh').click();
					window.parent.location.reload(); //刷新父页面
					parent.layer.msg('添加成功!', {
						icon : 6,
						time : 1000
					});
					parent.layer.close(index);
	
				}
			});
		});
	</script>
</body>
</html>