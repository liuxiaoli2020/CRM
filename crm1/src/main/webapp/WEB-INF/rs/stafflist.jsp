<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<title>员工信息管理</title>
	</head>
	<body>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 人事管理 <span class="c-gray en">&gt;</span> 员工信息管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="page-container">
	    <form action="likeselect.do" method="post" >
		<div class="text-c"> 员工名称：
			<input type="text" class="input-text" style="width:250px" placeholder="输入员工名称" id="staffName" name="staffName">
			
			<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜员工</button>
			
			<a title="导入员工信息"  onclick="member_edit('导入员工信息','importstaff.do','','','200')"  class="btn btn-primary radius">
	    	<i class="Hui-iconfont">&#xe645;</i> 导入员工信息</a>
	    	<a title="导入员工图片"  onclick="member_edit('导入员工图片','importphoto.do','','','200')"  class="btn btn-primary radius">
	    	<i class="Hui-iconfont">&#xe645;&#xe613;</i> 导入员工图片</a>
	    	
		</div>
		</form>
		<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
		<a href="javascript:;" id="del_model" class="btn btn-danger radius">
		<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
		
		
		<a title="添加"  onclick="member_edit('添加','staffupdate.do','4','','510')"  class="btn btn-primary radius">
		<i class="Hui-iconfont">&#xe600;</i> 添加员工</a></span> <span class="r">共有数据：<strong>${pi.total }</strong> 条</span> </div>
		<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" id="allChk" name="" value=""></th>
					<th >员工编号</th>
					<th >员工姓名</th>
					<th >员工性别</th>
					<th >员工照片</th>
					<th >身份证号</th>
					<th >家乡地址</th>
					<th >现在地址</th>
					<th>员工学历</th>
					<th >政治面貌</th>
					<th >毕业学校</th>
					<th >联系电话</th>
					<th >网上联系方式</th>
					<th >网上联系详情</th>
					<th >审核状态</th>
					<th >职务编号</th>
					<th >员工状态</th>
					<th >备注</th>
					<th >公司编号</th>
					<th >最后修改时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			    <c:forEach items="${pi.list }" var="s">
			   
				<tr class="text-c">
					<td><input type="checkbox" value="${s.staffId}" name="subChk"></td>
					<td>${s.staffId}</td>
					<td>${s.staffName}</td>
					<td>${s.staffSex}</td>
					<td><img alt="暂无图片" src="../upload/${s.staffPhoto}" style="width: 100px;height: 80px;"></td>
					<td>${s.idNumber}</td>
					<td>${s.homeAddress}</td>
					<td>${s.nowAddress}</td>
					<td>${s.staffEducation}</td>
					<td>${s.politicalOutlook}</td>
					<td>${s.graduateSchool}</td>
					<td>${s.telephone}</td>
					<td>${s.onlineContactWay}</td>
					<td>${s.onlineContactDetail}</td>
					<td>${s.auditStatus}</td>
					<td>${s.jobId}</td>
					<td>${s.staffState}</td>
					<td>${s.notes}</td>
					<td>${s.companyId}</td>
					<td><fmt:formatDate value="${s.lastModifyDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
					<td class="td-manage">
					 <a title="编辑"  onclick="member_edit('编辑','staffupdate.do?staffId=${s.staffId}','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
					 
					  <!-- <a title="编辑"  id="update" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> 
					 -->
					 <a title="删除" href="staffdelete.do?staffId=${s.staffId}" onclick="return confirm('确定删除？')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
		</div>
		<div class="dataTables_info" role="status" aria-live="polite" style="float: left;margin-top: 10px;margin-bottom: 10px">当前第 ${pi.pageNum }/${pi.pages }页，共 ${pi.total }条</div>
		<div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_paginate" style="float: right;margin-top: 10px;margin-bottom: 10px">
		<a class="paginate_button" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="selectpage.do?pageNum=${pi.navigateFirstPage }">首页</a>
		<a class="paginate_button previous" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="selectpage.do?pageNum=${pi.prePage }" >上一页</a>
		<a class="paginate_button next" aria-controls="DataTables_Table" id="DataTables_Table_next" href="selectpage.do?pageNum=${pi.nextPage }">下一页</a>
		<a class="paginate_button" aria-controls="DataTables_Table" id="DataTables_Table_previous" href="selectpage.do?pageNum=${pi.navigateLastPage }">尾页</a>
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
	/* $(function(){
		$('.table-sort').dataTable({
			"aaSorting": [[ 1, "desc" ]],//默认第几个排序
			"bStateSave": true,//状态保存
			"aoColumnDefs": [
			  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
			]
		});
		
	}); */
	
	
	
	/*用户-编辑*/
	function member_edit(title,url,id,w,h){
		var index=layer_show(title,url,w,h);
		layer.close(index);
	}
	
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
	</script> 
	</body>
	</html>