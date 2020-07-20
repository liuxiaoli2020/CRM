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

<title>角色管理</title>
<style type="text/css">
.vv {
         display: none;
     }
</style>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 角色管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div id="window-div" class="vv">
            <form  id="from">
                <table>
                    <tr>
                        <td>
                            角色名：
                        </td>
                        <td>
                        <input type="hidden" name="roleId" id="roleId" >
                            <input type="text" name="roleName" id="roleName">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            角色描述：
                        </td>
                        <td>
                            <input type="text" name="roleDetail" id="roleDetail">
                        </td>
                    </tr>
                    <tr>
                        <td>
                           上级角色编号：
                        </td>
                        <td>
                            <input type="text" name="superiorRoleId" id="superiorRoleId">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            操作人编号：
                        </td>
                        <td>
                            <input type="text" name="operatorId" id="operatorId">
                        </td>
                    </tr>
                  
                    <tr>
                        <td>
                            最后修改时间：
                        </td>
                         <%Date date=new Date();
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String nowtime=sdf.format(date);
                        %>
                        
                        <td>
                            <input type="hidden" name="lastModifyDate"  value="<%=nowtime %>" id="lastModifyDate">
                             <%=nowtime %> 
                        </td>
                        
                    </tr>
                </table>
            </form>
        </div>
        
       
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray"> 
		<span class="l"> 
			<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
				<i class="Hui-iconfont">&#xe6e2;</i> 
				批量删除
			</a> 
				<a class="btn btn-primary radius" href="javascript:;" id="lay_add" onclick="admin_role_add('添加角色','admin-role-add.html','800')">
				<i class="Hui-iconfont">&#xe600;</i>
				 添加角色
		 	</a> 
		 </span> 
	 	<span class="r">共有数据：<strong>${r.total }</strong> 条</span> 
	 </div>
	<table class="table table-border table-bordered table-hover table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="6">角色管理</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" value="" name=""></th>
				<th width="40">角色编号</th>
				<th width="200">角色名</th>
				<th width="300">角色描述</th>
				<th width="40">上级角色编号</th>
				<th width="40">操作人编号</th>
				<th width="200">最后修改时间</th>
				<th width="70">操作</th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach items="${r.list }" var="XtRole">
		
			<tr class="text-c">
				<td><input type="checkbox" value="" name=""></td>
				<td>${XtRole.roleId }</td>
				<td><a onclick="member_info('xtrolememberctrl/goselectmumber.do?roleId=${XtRole.roleId }&roleName=${XtRole.roleName }')" >${XtRole.roleName }</a></td>
				<td>${XtRole.roleDetail }</td>
				<td>${XtRole.superiorRoleId }</td>
				<td>${XtRole.operatorId }</td>
				<td><fmt:formatDate value="${XtRole.lastModifyDate }"
								pattern="yyyy-MM-dd HH:mm:ss" /></td>
				
				<td class="f-14">
					<a title="编辑" href="javascript:;" onclick="admin_role_edit(${XtRole.roleId })" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6df;</i>
					</a> 
					<a title="删除" href="javascript:;" onclick="admin_role_del(this,'${XtRole.roleId }')" class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6e2;</i>
					</a>
				</td>
			</tr>
		</c:forEach>
			
		</tbody>
	</table>
	<div class="dataTables_info" id="DataTables_Table_0_info" role="status" aria-live="polite" style="float: left; margin-top: 10px;margin-bottom: 10px">
		当前 ${r.pageNum } / ${r.pages} 页 ，共 ${r.total } 条</div>
	<div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_0_paginate" style="float: right; margin-top: 10px;margin-bottom: 10px">
			<span> 
				<a class="paginate_button current" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0" 
				href="javascript:void(0)" onclick="gopage(${r.navigateFirstPage  }) ">首页</a>
			</span>
			<a class="paginate_button previous disabled" aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0" id="DataTables_Table_0_previous" 
			href="javascript:void(0)" onclick="gopage(${r.prePage  }) ">
				上一页
			</a>
			<span>
				<a class="paginate_button current" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"> ${r.pageNum }</a>
			</span>
			<a class="paginate_button next disabled" aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0" id="DataTables_Table_0_next"
			href="javascript:void(0)" onclick="gopage(${r.nextPage  }) ">
				下一页
			</a>
			<span>
				<a class="paginate_button current" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"
				href="javascript:void(0)" onclick="gopage(${r.navigateLastPage  }) ">尾页</a>
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


/*管理员-角色-编辑修改*/

function admin_role_edit(roleId){
	$.ajax({
	
			type:'post',
			url:'xtrolectrl/goupdatextrole.do?roleId='+roleId,
			/* data:"userId="+userId, */
			dataType: "json",
			success:function(data)
			{
			
			    
			    $("#roleId").val(data.roleId);
				$("#roleName").val(data.roleName);
				$("#roleDetail").val(data.roleDetail);
				$("#superiorRoleId").val(data.superiorRoleId);
				$("#operatorId").val(data.operatorId);
				
				<%Date date1=new Date();
				SimpleDateFormat sdf1 =new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
				String nowtime1=sdf1.format (date1 );
				%>
				$("#lastModifyDate").val('<%=nowtime1 %>');
				
			}
		})
		index=layer.open(
			{
				skin:"layui-layer-molv",
				type:1,
				title:"修改角色信息",
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
						url:"xtrolectrl/updatextrole.do",
						data:$('#from').serialize(),
						dataType:"json",
						success:function(d)
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
}

/*管理员-角色-添加*/
$('#lay_add').on('click', function() {
		var index="";
		layui.use(['layer'],function()
		{
			var layer=layui.layer,
			index=layer.open(
			{
				skin:"layui-layer-molv",
				type:1,
				title:"添加角色",
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
				//alert($('#from').serialize());
					$.ajax(
					{
						type:"post",
						url:"xtrolectrl/addxtrole.do",
						data:$('#from').serialize(),
						
						dataType:"json",
						success:function(d)
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
		})
		
		
	})


/*管理员-角色-删除*/
function admin_role_del(obj,id){
	layer.confirm('角色删除须谨慎，确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'xtrolectrl/deletextrole.do',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {            /* ??????data */
				
				layer.msg('删除失败!',{icon:5,time:1000});
			},
		});		
	});
}

//点击姓名，查看成员
function member_info(url)
{
	window.location.href=url;
}


	//分页
	function gopage(pageNum)
{
	$.ajax(
			{
				type:"post",
				url:"xtrolectrl/selectxtrole.do",
				data:"pageNum="+pageNum,
				
				dataType:"json",
				success:function(d)
				{
				},
				error:function(e)
				{
					
				}
			});
	
}
</script>
</body>
</html>
