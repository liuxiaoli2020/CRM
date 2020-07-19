<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>客户联系人</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页
	<span class="c-gray en">&gt;</span>
	销售管理
	<span class="c-gray en">&gt;</span>
	客户信息设置
	<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
</nav>
<div class="page-container">
	<form class="form form-horizontal" id="form-article-add">
		<div id="tab-system" class="HuiTab">
			<div class="tabBar cl">
				
				<span>客户联系记录</span>
				<span>客户反馈</span>
			</div>
			
            <!-- 客户联系记录 -->
			<div class="tabCon">
				<div class="page-container">
				
				<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
				<a href="javascript:;" id="del_model" class="btn btn-danger radius">
				<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
				<a title="添加"  onclick="member_edit('添加','../customerctrl/customeradd.do?customerId=${xccr.customerId}','4','','510')"  class="btn btn-primary radius">
				<i class="Hui-iconfont">&#xe600;</i> 添加客户联系记录</a></span> <span class="r">共有数据：<strong>${pi.total }</strong> 条</span> </div>
				<div class="mt-20"> 
				<table class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width="25"><input type="checkbox" name="" value=""></th>
							<th >联系记录编号</th>
							<th >联系标题</th>
							<th >联系时间</th>
							<th >客户编号</th>
							<th >联系内容</th>
							<th >公司编号</th>
							<th >最后修改时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
					    <c:forEach items="${pi.list }" var="c">
					   
						<tr class="text-c">
							<td><input type="checkbox" value="${c.contactRecordId}" name="subChk"></td>
							<td>${c.contactRecordId}</td>
							<td>${c.contactHeading}</td>
							<td>${c.contactDate}</td>
							<td>${c.customerId}</td>
							<td>${c.contactContent}</td>
							<td>${c.companyId}</td>
							<td>${c.lastModifyDate}</td>
							<td class="td-manage">
							 
							 <a title="删除" href="../customerctrl/customerdelete.do?contactRecordId=${c.contactRecordId}" onclick="return confirm('确定删除？')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				</div>
				</div>
				</div>
				 <!-- 客户反馈 -->
				<div class="tabCon">
				   <div class="page-container">
		
					<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
					<a href="javascript:;" id="del_model" class="btn btn-danger radius">
					<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
					<a title="添加"  onclick="member_edit('添加','','4','','510')"  class="btn btn-primary radius">
					<i class="Hui-iconfont">&#xe600;</i> 添加反馈记录</a></span> <span class="r">共有数据：<strong>${pi2.total }</strong> 条</span> </div>
					<div class="mt-20">
					<table class="table table-border table-bordered table-hover table-bg table-sort">
						<thead>
							<tr class="text-c">
								<th width="25"><input type="checkbox" name="" value=""></th>
								<th >反馈记录编号</th>
								<th >记录优先级</th>
								<th >客户编号</th>
								<th >状态</th>
								<th >反馈类型</th>
								<th >反馈时间</th>
								<th >反馈原因</th>
								<th >负责人</th>
								<th >反馈来源</th>
								<th >反馈主题</th>
								<th >反馈描述</th>
								<th >分析</th>
								<th >公司编号</th>
								<th >最后修改时间</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						    <c:forEach items="${pi2.list }" var="c">
						   
							<tr class="text-c">
								<td><input type="checkbox" value="${c.feedbackRecordId}" name="subChk"></td>
								<td>${c.feedbackRecordId}</td>
								<td>${c.recordPriority}</td>
								<td>${c.customerId}</td>
								<td>${c.state}</td>
								<td>${c.feedbackType}</td>
								<td>${c.feedbackDate}</td>
								<td>${c.feedbackReason}</td>
								<td>${c.head}</td>
								<td>${c.feedbackResource}</td>
								<td>${c.feedbackTheme}</td>
								<td>${c.feedbackDescribe}</td>
								<td>${c.analysis}</td>
								<td>${c.companyId}</td>
								<td>${c.lastModifyDate}</td>
								<td class="td-manage">
								 <a title="详情"  onclick="member_edit('详情','xscFeedback.do?feedbackRecordId=${c.feedbackRecordId}','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
								 <a title="删除" href="xscFeedbackdel.do?feedbackRecordId=${c.feedbackRecordId}" onclick="return confirm('确定删除？')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
				    </div>
					</div>
				   
			    </div>
			</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存</button>
				<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="../lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="../lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="../static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="../static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="../lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="../lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="../lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="../lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript" src="../lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
	<script type="text/javascript" src="../lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	$("#tab-system").Huitab({
		index:0
	});
});
</script>
<script type="text/javascript">
	function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '../customercontactctrl/deletecustomercontact.do',
			data: "contactId="+id,
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
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
			url: "../customerctrl/deletemore.do",
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
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>