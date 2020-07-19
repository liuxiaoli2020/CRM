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
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>我的桌面</title>
</head>
<body>
<div class="page-container">
	
	<table class="table table-border table-bordered table-bg mt-20">
			
		<tbody>
			<tr>
				<td width="30%">客户反馈编号</td>
				<td>${u.feedbackRecordId }</td>
			</tr>
			<tr>
				<td>记录优先级</td>
				<td>${u.recordPriority}</td>
			</tr>
			<tr>
				<td>客户编号</td>
				<td>${u.customerId}</td>
			</tr>
			<tr>
				<td>状态</td>
				<td>${u.state}</td>
			</tr>
			<tr>
				<td>反馈类型</td>
				<td>${u.feedbackType}</td>
			</tr>
			<tr>
				<td>反馈时间</td>
				<td>${u.feedbackDate}</td>
			</tr>
			<tr>
				<td>反馈原因</td>
				<td>${u.feedbackReason}</td>
			</tr>
			<tr>
				<td>负责人</td>
				<td>${u.head}</td>
			</tr>
			<tr>
				<td>反馈来源</td>
				<td>${u.feedbackResource}</td>
			</tr>
			<tr>
				<td>反馈主题</td>
				<td>${u.feedbackTheme}</td>
			</tr>
			<tr>
				<td>反馈描述</td>
				<td>${u.feedbackDescribe}</td>
			</tr>
			<tr>
				<td>分析 </td>
				<td>${u.analysis}</td>
			</tr>
			<tr>
				<td>公司编号</td>
				<td>${u.companyId}</td>
			</tr>
			<tr>
				<td>最后修改时间 </td>
				<td>${u.lastModifyDate}</td>
			</tr>
			
		</tbody>
	</table>
	
</div>

<script type="text/javascript" src="../lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="../static/h-ui/js/H-ui.min.js"></script> 

</body>
</html>