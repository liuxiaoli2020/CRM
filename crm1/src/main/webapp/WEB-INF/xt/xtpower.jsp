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

<title>权限管理</title>
<style type="text/css">
.vv {
	display: none;
}

</style>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页
	
	<span class="c-gray en">&gt;</span>
	权限分栏
	
	<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>

	<a href="javascript:;" class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px;margin-right:3px"
	 id="addpowersubfield">
	<i class="icon-plus"></i> 添加权限分栏
	</a>
</nav>
<div class="page-container">

	
	
		<div id="tab-system" class="HuiTab">
	
			<div class="tabBar cl">
				<c:forEach items="${p.list}" var="qxfl">	
					<span>${qxfl.subfieldName}</span>
				</c:forEach>
			</div>
			<c:forEach items="${p.list}" var="qxfl">
			
			
		 	<div class="tabCon">
				<div class="cl pd-5 bg-1 bk-gray mt-20">
					<span class="l">
					<a href="javascript:;" onclick="datadel()"
						class="btn btn-danger radius"><i class="icon-trash"></i> 批量删除</a> 
						<a href="javascript:;" class="btn btn-primary radius" onclick="lay_add(${qxfl.subfieldId})"><i
							class="icon-plus"></i> 添加权限</a></span> <span class="r">共有数据：<strong>${p.total }</strong>
						条
					</span>
				</div>
				<form action="xtpowerctrl/deletextpowerall.do" method="post" id="myform1">
				<table class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width="25"><input type="checkbox" id="all_check"></th>
							<th width="80">权限编号</th>
							<th width="100">权限名</th>
							<th width="90">权限路径</th>
							<th width="90">权限分栏编号</th>
							<th width="500">备注信息</th>
							<th width="140">最后修改时间</th>
							<th width="20">操作</th>
						</tr>
					</thead>
					<tbody>
					
						<c:forEach items="${qxfl.xtPowerDetailList}" var="power0">
							<tr class="text-c">
								<td><input type="checkbox" value="${power0.powerId }" name="ids"></td>
								<td>${power0.powerId }</td>
		
								<td><u style="cursor:pointer" class="text-primary">${power0.powerName }</u></td>
								
								<td>${power0.power }</td>
								<td>${power0.subfieldId }</td>
								<td>${power0.remark }</td>
								<td><fmt:formatDate value="${power0.lastModifyDate }"
										pattern="yyyy-MM-dd HH:mm:ss" /></td>
		
								
								<td class="td-manage">
								
									<a title="编辑" href="javascript:;"
										onclick="admin_edit(${power0.powerId })" class="ml-5"
										style="text-decoration:none">
										 <i class="Hui-iconfont">&#xe6df;</i>
									</a> 
									
									<a title="删除" href="javascript:;"
										onclick="admin_del(this,'${power0.powerId }')" class="ml-5"
										style="text-decoration:none"> <i class="Hui-iconfont">&#xe6e2;</i>
									</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
		 	</form>
			</div>
			</c:forEach>
	
	
</div>
<!-- 添加弹层 -->
<div id="window-div" class="vv">
			<form id="from">
				<table>
					<tr>
						<td>权限名：</td>
						<td>
							<input type="hidden" name="subfieldId" id="subfieldId" >
							<input type="text" name="powerName" id="powerName">
						</td>
					</tr>
					<tr>
						<td>权限路径：</td>
						<td><input type="text" name="power" id="power"></td>
					</tr>
					<tr>
						<td>备注信息：</td>
						<td><textarea name="remark" id="remark" class="textarea"></textarea></td>
					</tr>
					
					<tr>
						<td>最后修改时间：</td>
						<%
							Date date = new Date();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String nowtime = sdf.format(date);
						%>

						<td><input type="hidden" name="lastModifyDate"
							value="<%=nowtime%>" id="lastModifyDate"> <%=nowtime%>
						</td>

					</tr>
				</table>
			</form>
		</div> 
<!-- 修改弹层 -->
		 <div id="window-div1" class="vv">
			<form id="from1">
				<table>
					<tr>
						<td>权限名：</td>
						<td>
						<input type="hidden" name="powerId" id="powerId1">
						
						<input type="text" name="powerName" id="powerName1">
						</td>
					</tr>
					<tr>
						<td>权限路径：</td>
						<td><input type="text" name="power" id="power1">
						</td>
					</tr>
					<tr>
						<td>权限分栏编号：</td>
						<td><input type="text" name="subfieldId" id="subfieldId1">
						</td>
					</tr>
					<tr>
						<td>备注信息：</td>
						<td><textarea name="remark1" id="remark" class="textarea"></textarea></td>
					</tr>
					
					<tr>
						<td>最后修改时间：</td>
						<%
							Date date2 = new Date();
							SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String nowtime2 = sdf2.format(date2);
						%>

						<td><input type="hidden" name="lastModifyDate"
							value="<%=nowtime2%>" id="lastModifyDate"> <%=nowtime2%>
						</td>

					</tr>
				</table>
			</form>
		</div>
		<!-- 添加权限分栏弹层 -->
		<div id="window-div2" class="vv">
					<form id="from2">
						<table>
							<tr>
								<td>分栏名称：</td>
								<td>
									<input type="text" name="subfieldName" id="subfieldName1">
								</td>
							</tr>
							
							<tr>
								<td>备注信息：</td>
								<td><textarea name="remark" id="remark1" class="textarea"></textarea></td>
							</tr>
							
							<tr>
								<td>最后修改时间：</td>
								<%
									Date date3 = new Date();
									SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
									String nowtime3 = sdf.format(date3);
								%>
		
								<td><input type="hidden" name="lastModifyDate"
									value="<%=nowtime3%>" id="lastModifyDate"> <%=nowtime3%>
								</td>
		
							</tr>
						</table>
					</form>
				</div> 
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath%>lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
//添加脚本
function lay_add(subfieldId)
{
	index=layer.open(
			{
				skin:"layui-layer-molv",
				type:1,
				title:"为该分栏添加权限",
				content:$('#window-div'),
				area:'auto',
				fix:false,
				offset: ['300px','600px'],
				btn:['提交','取消'],
				shade:[0.5,'white'],
				anim:1,
				resize:true,
				yes:function()
				{
				
					$.ajax(
					{
						type:"post",
						url:"xtpowerctrl/addxtpower.do?subfieldId="+subfieldId,
						data:$('#from').serialize(),
						dataType:"json",
						success:function(d)/*，这里为什么显示不出来？？？？？？？？？？？？？？？ */
						{
							layer.msg('修改成功！',{icon:6,time:1000});
						},
						error:function(e)
						{
							layer.msg('修改失败！',{icon:5,time:1000});
						}
					});
					layer.close(index);
				},
				btn2:function()
				{
					layer.close(index);
				},
				cancel:function()
				{
					layer.close(index);
				},
				end:function()
				{
					window.location.reload();//关闭窗口时刷新页面
				}
			})
}

//删除脚本
function admin_del(obj,powerId)
{
	layer.confirm('确认要删除吗？',function(index)
	{
		$.ajax({
			type:'post',
			url:'xtpowerctrl/deletextpower.do',
			data:"powerId="+powerId,
			dataType: "json",
			success:function(a)
			{
				$(obj).parents("tr").remove();
				layer.msg('已删除！',{icon:6,time:1000});
				setTimeout(function() {
									window.location.reload(); //关闭窗口时刷新页面
								}, 1000)
			},error:function(data) {          
				
				layer.msg('删除失败!',{icon:5,time:1000});
				setTimeout(function() {
									window.location.reload(); //关闭窗口时刷新页面
								}, 1000)
			},
		})
	})
}

//修改脚本

function admin_edit(powerId)
{

	$.ajax({
			type:'post',
			url:'xtpowerctrl/goupdatextpower.do?powerId='+powerId,
			/* data:"userId="+userId, */
			dataType: "json",
			success:function(data)
			{
			    
			    $("#powerId1").val(data.powerId);
				$("#powerName1").val(data.powerName);
				$("#power1").val(data.power);
				$("#subfieldId1").val(data.subfieldId);
				$("#remark1").val(data.remark);
			
				
			}
		})
	
	
		index=layer.open(
			{
				skin:"layui-layer-molv",
				type:1,
				title:"修改权限信息",
				content:$('#window-div1'),
				area:'auto',
				fix:false,
				offset: ['300px','600px'],
				btn:['提交','取消'],
				shade:[0.5,'white'],
				anim:1,
				resize:true,
				yes:function()
				{
				
					$.ajax(
					{
						type:"post",
						url:"xtpowerctrl/updatextpower.do",
						data:$('#from1').serialize(),
						dataType:"json",
						success:function(d)/*，这里为什么显示不出来？？？？？？？？？？？？？？？ */
						{
							layer.msg('修改成功！',{icon:6,time:1000});
							window.location.reload();//关闭窗口时刷新页面
						},
						error:function(e)
						{
							layer.msg('修改失败！',{icon:5,time:1000});
							window.location.reload();//关闭窗口时刷新页面
						}
					});
					layer.close(index);
				},
				btn2:function()
				{
					layer.close(index);
				},
				cancel:function()
				{
					layer.close(index);
				},
				end:function()
				{
					window.location.reload();//关闭窗口时刷新页面
				}
			})
	
}

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




//添加权限分栏
$('#addpowersubfield').on('click', function() {

		
		
			index=layer.open(
			{
				skin:"layui-layer-molv",
				type:1,
				title:"添加新的权限分栏",
				
				content:$('#window-div2'),
				area:'auto',
				fix:false,
				offset: ['300px','600px'],
				btn:['提交','取消'],
				shade:[0.5,'white'],
				anim:1,
				resize:true,
				
				yes:function()
				{
				
					$.ajax(
					{
						type:"post",
						url:"xtpowerctrl/addxtpowersubfield.do",
						data:$('#from2').serialize(),
						
						dataType:"json",
						success:function(d)/* ??????????????????????????????????????????????????????????????????????bug==只显示添加失败，实际上成了，但是显示时间没有设置成功 */
						{
							layer.msg('添加成功！',{icon:6,time:1000});
						},
						error:function(e)
						{
							layer.msg('添加失败！',{icon:5,time:1000});
						}
					});
					layer.close(index);
				},
				
				cancel:function()
				{
					layer.close(index);
				},
				end:function()
				{
					setTimeout(function() {
									window.location.reload(); //关闭窗口时刷新页面
								}, 1000)
				}
			})
		})


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
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
