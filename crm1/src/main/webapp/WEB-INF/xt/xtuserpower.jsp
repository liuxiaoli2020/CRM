<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

 <script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script src="layui/js/jquery.min.js"></script>
<!-- 这个js要放到css父包同级的位置，它要调用文件夹下面的所有css文件，不能乱放，不然找不到相对位置 -->
<script src="layui/layui.js"> </script>

<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />

<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script> 

<title>权限</title>
<!-- <style type="text/css">
.vv {
         display: none;
     }
</style> -->
</head>
<body>
 
 

   
<!--    角色成员管理    -->   
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray"> 
		<span class="l"> 
			<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
				<i class="Hui-iconfont">&#xe6e2;</i> 
				批量删除权限
			</a> 
				<a class="btn btn-primary radius" href="javascript:;" id="lay_add" 
				onclick="admin_role_add('权限','xtrolememberctrl/goaddmumber.do',${sessionScope.nowRole.roleId })">
				<i class="Hui-iconfont">&#xe600;</i>
				 给此用户添加权限
		 	</a> 
		 </span> 
	 	<span class="r">共有数据：<strong>${p0.total }</strong> 条</span> 
	 </div>
	 
	 
	 <form action="xtrolememberctrl/deletemumberall.do" method="post" id="myform1">
		<table class="table table-border table-bordered table-hover table-bg">
			<thead>
				
				<tr class="text-c">
					<th width="25"><input type="checkbox" value="" name=""></th>
					<th width="40">权限编号</th>
					<th width="200">权限名称</th>
					<th width="300">权限</th>
					<th width="40">权限分栏编号</th>
					<th width="40">备注信息</th>
					<th width="200">最后修改时间</th>
					<th width="70">操作</th>
				</tr>
			</thead>
			<tbody>
			 <c:forEach items="${p2.list }" var="mem">
				
				<tr class="text-c">
					<td><input type="checkbox" value="${mem.powerId }" name="ids"></td>
					<td>${mem.powerId }</td>
					<td>${mem.powerName }</td>
					<td>${mem.power }</td>
					<td>${mem.subfieldId }</td>
					<td>${mem.remark }</td>
					<td><fmt:formatDate value="${mem.lastModifyDate }"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>
					
					<td class="f-14">
						
						<a title="删除" href="javascript:;" onclick="admin_role_del(this,'${mem.powerId }')" class="ml-5" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6e2;</i>
						</a>
					</td>
				</tr>
			</c:forEach>
				
			</tbody>
		</table>
	</form>
	<div class="dataTables_info" id="DataTables_Table_0_info" role="status" aria-live="polite" style="float: left; margin-top: 10px;margin-bottom: 10px">
		当前 ${p2.pageNum } / ${p2.pages} 页 ，共 ${p2.total } 条</div>
	<div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_0_paginate" style="float: right; margin-top: 10px;margin-bottom: 10px">
			<span> 
				<a class="paginate_button current" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0" 
				href="javascript:void(0)" onclick="gopage(${p2.navigateFirstPage  }) ">首页</a>
			</span>
			<a class="paginate_button previous disabled" aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0" id="DataTables_Table_0_previous" 
			href="javascript:void(0)" onclick="gopage(${p2.prePage  }) ">
				上一页
			</a>
			<span>
				<a class="paginate_button current" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"> ${p2.pageNum }</a>
			</span>
			<a class="paginate_button next disabled" aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0" id="DataTables_Table_0_next"
			href="javascript:void(0)" onclick="gopage(${p2.nextPage  }) ">
				下一页
			</a>
			<span>
				<a class="paginate_button current" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"
				href="javascript:void(0)" onclick="gopage(${p2.navigateLastPage  }) ">尾页</a>
			</span>
	</div>
</div>





<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript">
//批量删除
function datadel()
{
	if($("input[name='ids']:checked").length>0)
	{
		layer.confirm('确认要删除吗？',function(index)
		{
			$("#myform1").submit();
		} )
	}else
	{
		layer.msg('请至少选择一条数据！',{icon:5,time:1000});
	}
	
}
//查看权限，跳转页面
function admin_role_add(title,url,id){
	url=url+"?roleId="+id;
	layer_show(title,url);
	
	
	
} 
 
</script>
</body>
</html>