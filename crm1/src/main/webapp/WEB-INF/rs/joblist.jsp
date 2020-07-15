<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<title>职务管理</title>
	</head>
	<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 人事管理 <span class="c-gray en">&gt;</span> 员工信息管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="page-container">
		 <form action="likeselect.do" method="post" >
		<div class="text-c"> 职务名称：
			<input type="text" class="input-text" style="width:250px" placeholder="输入职务名称" id="jobName" name="jobName">
			
			<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜职务</button>
			
			<a title="导入职务信息"  onclick="member_edit('导入职务信息','importstaff.do','','','200')"  class="btn btn-primary radius">
	    	<i class="Hui-iconfont">&#xe645;</i> 导入职务信息</a>
	    	<!-- <input type="button" name="Submit" class="btn btn-success radius" οnclick="javascript:history.back(-1);" value="返回上一页">
	    	 -->
	    	
		</div>
		</form>
		
		<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
		<a href="javascript:;" id="del_model" class="btn btn-danger radius">
		<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
		<a title="添加"  onclick="member_edit('添加','jobupdate.do','','','510')"  class="btn btn-primary radius">
		<i class="Hui-iconfont">&#xe600;</i> 添加职务</a></span> <span class="r">共有数据：<strong>${pi.total }</strong> 条</span> </div>
		<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th >职务编号</th>
					<th >职务名</th>
					<th >部门编号</th>
					<th >备注</th>
					<th >公司编号</th>
					<th >最后修改时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			    <c:forEach items="${pi.list }" var="j">
			   
				<tr class="text-c">
					<td><input type="checkbox" value="${j.jobId}" name="subChk"></td>
					<td>${j.jobId}</td>
					<td>${j.jobName}</td>
					<td>${j.branchId}</td>
					<td>${j.notes}</td>
					<td>${j.companyId}</td>
					<td>${j.lastModifyDate}</td>
					<td class="td-manage">
					 <a title="编辑"  onclick="member_edit('编辑','jobupdate.do?jobId=${j.jobId}','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
					 
					  <!-- <a title="编辑"  id="update" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
					 -->
					 <a title="删除" href="jobdelete.do?jobId=${j.jobId}" onclick="return confirm('确定删除？')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
		</div>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="../lib/jquery/1.9.1/jquery.min.js"></script> 
	<script type="text/javascript" src="../lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="../static/h-ui/js/H-ui.min.js"></script> 
	<script type="text/javascript" src="../static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
	
	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript" src="../lib/My97DatePicker/4.8/WdatePicker.js"></script> 
	<script type="text/javascript" src="../lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
	<script type="text/javascript" src="../lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
	/*批量删除*/
	$("#del_model").click(function() {
		if(confirm("确定要删除所选项目？")) {
			var checkedList = new Array();
			$("input[name='subChk']:checked").each(function() {
			checkedList.push($(this).val());
			});
			$.ajax({
			type: "POST",
			url: "deletemore.do",
			data: {'delitems':checkedList.toString()},
			success: function(result) {
			$("[name ='subChk']:checkbox").attr("checked", false);
			window.location.reload();
			}
			});
		}
	});
	
	
	
	/*用户-编辑*/
	function member_edit(title,url,id,w,h){
		var index=layer_show(title,url,w,h);
		layer.close(index);
	}
	
	
	</script> 
	</body>
	</html>