<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>客户流失管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页
	<span class="c-gray en">&gt;</span>
	销售管理
	<span class="c-gray en">&gt;</span>
	客户流失管理
	<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
</nav>
<div class="page-container">
	<%-- <form action="supdate.do?customerLossId=${u.customerLossId }" method="post" class="form form-horizontal" id="form-article-add"> --%>
		<div id="tab-system" class="HuiTab">
			<div class="tabBar cl">
				<span>暂缓流失</span>
				<span>确认流失</span>
			</div>
			
			<!-- 暂缓流失 -->
			<div class="tabCon">
			       <form action="supdate.do?customerLossId=${u.customerLossId }&a=0" method="post" class="form form-horizontal" id="form-article-add">
					<table class="table table-border table-bordered table-bg mt-20">
		
					<tbody>
						<tr>
							<td width="30%">编号</th>
							<td>${u.customerLossId }
							<input type="hidden" class="input-text" value="${u.customerLossId }"  id="customerLossId" name="customerLossId">
							</td>
						</tr>
						<tr>
							<td>客户编号</td>
							<td>${u.customerId}
							<input type="hidden" class="input-text" value="${u.customerId }"  id="customerId" name="customerId">
							</td>
						</tr>
						<tr>
							<td>操作人员编号</td>
							<td>${u.operatorId}
							<input type="hidden" class="input-text" value="${u.operatorId }"  id="operatorId" name="operatorId">
							</td>
						</tr>
						<tr>
							<td>处理方式 </td>
							<td>暂缓流失
							<input type="hidden" class="input-text" value="暂缓流失" id="treatmentMode" name="treatmentMode">
							</td>
						</tr>
						<tr>
							<td>处理措施</td>
							<td>${u.treatmentMeasures}
							<textarea name="treatmentMeasures" cols="" rows="" class="textarea"  placeholder="说点什么...100个字符以内" dragonfly="true" onKeyUp="$.Huitextarealength(this,100)"></textarea>
				            <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
							</td>
						</tr>
						<tr>
							<td>是否流失</td>
							<td>否
							<input type="hidden" class="input-text" value="否" id="isLoss" name="isLoss">
							</td>
						</tr>
						<tr>
							<td>公司编号</td>
							<td>${u.company}
							<input type="hidden" class="input-text" value="${u.company}" id="company" name="company">
							</td>
						</tr>
						<tr>
							<td>最后修改时间 </td>
							<td>
							<%Date date=new Date();
						       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						       String nowtime=sdf.format(date);
						      %>
							<input type="hidden" class="input-text" value="<%=nowtime %>" id="lastModifyData" name="lastModifyData">
							<%=nowtime %>
							</td>
						</tr>
						
					</tbody>
				</table>
				<div class="row cl">
					<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
						<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存</button>
						<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
					</div>
				</div>
				</form>
			</div>
			
            <!-- 确认流失 -->
			<div class="tabCon">
			    <form action="supdate.do?customerLossId=${u.customerLossId }&a=1" method="post" class="form form-horizontal" id="form-article-add">
				<table class="table table-border table-bordered table-bg mt-20">
		             <tbody>
						<tr>
							<td width="30%">编号</th>
							<td>${u.customerLossId }
							<input type="hidden" class="input-text" value="${u.customerLossId }"  id="customerLossId" name="customerLossId">
							</td>
						</tr>
						<tr>
							<td>客户编号</td>
							<td>${u.customerId}
							<input type="hidden" class="input-text" value="${u.customerId }"  id="customerId" name="customerId">
							</td>
						</tr>
						<tr>
							<td>操作人员编号</td>
							<td>${u.operatorId}
							<input type="hidden" class="input-text" value="${u.operatorId }"  id="operatorId" name="operatorId">
							</td>
						</tr>
						<tr>
							<td>处理方式 </td>
							<td>确认流失
							<input type="hidden" class="input-text" value="确认流失" id="treatmentMode" name="treatmentMode">
							</td>
						</tr>
						<tr>
							<td>处理措施</td>
							<td>${u.treatmentMeasures}
							<textarea name="treatmentMeasures" cols="" rows="" class="textarea"  placeholder="说点什么...100个字符以内" dragonfly="true" onKeyUp="$.Huitextarealength(this,100)"></textarea>
				            <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
							</td>
						</tr>
						<tr>
							<td>是否流失</td>
							<td>是
							<input type="hidden" class="input-text" value="是" id="isLoss" name="isLoss">
							</td>
						</tr>
						<tr>
							<td>公司编号</td>
							<td>${u.company}
							<input type="hidden" class="input-text" value="${u.company}" id="company" name="company">
							</td>
						</tr>
						<tr>
							<td>最后修改时间 </td>
							<td>
							 <%Date date1=new Date();
						       SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						       String nowtime1=sdf1.format(date1);
						      %>
							<input type="hidden" class="input-text" value="<%=nowtime1 %>" id="lastModifyData" name="lastModifyData">
							<%=nowtime1 %>	
							
							</td>
						</tr>
						
					</tbody>
				</table>
				<div class="row cl">
					<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
						<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存</button>
						<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
					</div>
				</div>
				</form>
	        </div>
		</div>
		
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