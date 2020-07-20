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

<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script src="layui/js/jquery.min.js"></script>
<!-- 这个js要放到css父包同级的位置，它要调用文件夹下面的所有css文件，不能乱放，不然找不到相对位置 -->
<script src="layui/layui.js"> </script>

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

<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
<script>DD_belatedPNG.fix('*');
</script>

<title>用户账号管理</title>
<style type="text/css">
.vv {
	display: none;
}
</style>



</head>
<body>
	<nav class="breadcrumb"> <i class="Hui-iconfont">&#xe67f;</i> 首页
	<span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span>
	用户账号管理 <a class="btn btn-success radius r"
		style="line-height:1.6em;margin-top:3px"
		href="javascript:location.replace(location.href);" title="刷新"><i
		class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="pd-20">
		<form action="xtuseraccountctrl/seletextuseraccountctrl.do"
			method="post" id="myfrom">
			<div class="text-c">
				日期范围： <input type="text"
					value="<fmt:formatDate value="${UA.datemin }" pattern="yyyy-MM-dd" />"
					id="datemin" name="datemin"
					onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})"
					class="input-text Wdate" style="width:120px;"> - <input
					type="text"
					value="<fmt:formatDate value="${UA.datemax }" pattern="yyyy-MM-dd" />"
					id="datemax" name="datemax"
					onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})"
					class="input-text Wdate" style="width:120px;"> <input
					type="text" value="${UA.userName }" class="input-text"
					style="width:250px" id="userName" name="userName"
					placeholder="输入用户名称。。"> <input type="hidden"
					value="${p.pageNum }" id="pageNum" name="pageNum">
				<button type="reset" class="btn btn-success" id="" name="">
					<i class="icon-search"></i> 重置
				</button>
				<button type="submit" class="btn btn-success" id="" name="">
					<i class="icon-search"></i> 查询
				</button>

			</div>
		</form>
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"><a href="javascript:;" onclick="datadel()"
				class="btn btn-danger radius"><i class="icon-trash"></i> 批量删除</a> <a
				href="javascript:;" class="btn btn-primary radius" id="lay_add"><i
					class="icon-plus"></i> 添加用户</a></span> <span class="r">共有数据：<strong>${p.total }</strong>
				条
			</span>
		</div>
		<!-- 添加账户 -->
		<div id="window-div" class="vv">
			<form id="from">
				<table>
					<tr>
						<td>用户名称：</td>
						<td><input type="hidden" name="userId" id="userId"> <input
							type="text" name="userName" id="userName"></td>
					</tr>
					<tr>
						<td>用户密码：</td>
						<td><input type="text" name="userPass" id="userPass">
						</td>
					</tr>
					<tr>
						<td>员工编号：</td>
						<td><input type="text" name="staffId" id="staffId"></td>
					</tr>
					<tr>
						<td>公司编号：</td>
						<td><input type="text" name="companyId" id="companyId">
						</td>
					</tr>
					<tr>
						<td>账户状态：</td>
						<td><input type="text" name="accountStatus"
							id="accountStatus"></td>
					</tr>
					<tr>
						<td>最后修改时间：</td>
						<%
							Date date = new Date();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String nowtime = sdf.format(date);
						%>

						<td><input type="hidden" name="lastModifyDate"
							value="<%=nowtime%>" id="lastModifyDate"> <%=nowtime%></td>

					</tr>
				</table>
			</form>
		</div>
		<!-- 账户修改，密码不能显示，也不能被修改 -->
		<div id="window-div1" class="vv">
			<form id="from1">
				<table>
					<tr>
						<td>用户名称：</td>
						<td><input type="hidden" name="userId" id="userId"> <input
							type="text" name="userName" id="userName"></td>
					</tr>
					<tr>
						<td>用户密码：</td>
						<td><input type="hidden" name="userPass" id="userPass">
						</td>
					</tr>
					<tr>
						<td>员工编号：</td>
						<td><input type="text" name="staffId" id="staffId"></td>
					</tr>
					<tr>
						<td>公司编号：</td>
						<td><input type="text" name="companyId" id="companyId">
						</td>
					</tr>
					<tr>
						<td>账户状态：</td>
						<td><input type="text" name="accountStatus"
							id="accountStatus"></td>
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
		<!-- 修改密码 -->
		<div id="window-div2" class="vv">
			<form id="from2">
				<table>
					<tr>
						<td></td>
						<td><input type="hidden" name="userId" id="userId"> <input
							type="hidden" name="userName" id="userName"></td>
					</tr>
					<tr>
						<td>请输入新密码：</td>
						<td><input type="password" name="userPass" id="userPass">
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="hidden" name="staffId" id="staffId"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="hidden" name="companyId" id="companyId">
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="hidden" name="accountStatus"
							id="accountStatus"></td>
					</tr>
					<tr>
						<td>最后修改时间：</td>
						<%
							Date date3 = new Date();
							SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String nowtime3 = sdf3.format(date3);
						%>

						<td><input type="hidden" name="lastModifyDate"
							value="<%=nowtime3%>" id="lastModifyDate"> <%=nowtime3%>
						</td>

					</tr>
				</table>
			</form>
		</div>
		<form action="xtuseraccountctrl/deletextuseraccountall.do"
			method="post" id="myform1">
			<table
				class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" id="all_check"></th>
						<th width="80">用户编号</th>
						<th width="100">用户名</th>
						<th width="90">员工编号</th>
						<th width="90">公司编号</th>
						<th width="130">最后修改时间</th>
						<th width="70">账号状态</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${p.list }" var="useraccount">
						<tr class="text-c">
							<td><input type="checkbox" value="${useraccount.userId }"
								name="ids"></td>
							<td>${useraccount.userId }</td>

							<td><u style="cursor:pointer" class="text-primary"
								onclick="user_show('10001','360','','张三','user-show.html')">${useraccount.userName }</u></td>

							<td>${useraccount.staffId }</td>
							<td>${useraccount.companyId }</td>
							<td><fmt:formatDate value="${useraccount.lastModifyDate }"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>

							<td class="user-status"><span class="label label-success">${useraccount.accountStatus!='0' ? '启用':'禁用'}</span></td>
							<td class="td-manage"><a style="text-decoration:none"
								onClick="admin_start(this,'10001')" href="javascript:;"
								title="启用"> <i class="Hui-iconfont">&#xe615;</i>
							</a> <a title="编辑" href="javascript:;"
								onclick="admin_edit(${useraccount.userId })" class="ml-5"
								style="text-decoration:none"> <i class="Hui-iconfont">&#xe6df;</i>
							</a> <a title="修改密码" href="javascript:;"
								onclick="admin_updatepass(${useraccount.userId })" class="ml-5"
								style="text-decoration:none"> <i class="Hui-iconfont">&#xe63f;</i>
							</a> <a title="删除" href="javascript:;"
								onclick="admin_del(this,'${useraccount.userId }')" class="ml-5"
								style="text-decoration:none"> <i class="Hui-iconfont">&#xe6e2;</i>
							</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</form>

		<div class="dataTables_info" id="DataTables_Table_0_info"
			role="status" aria-live="polite"
			style="float: left; margin-top: 10px;margin-bottom: 10px">当前
			${p.pageNum } / ${p.pages} 页 ，共 ${p.total } 条
		</div>
		<div class="dataTables_paginate paging_simple_numbers"
			id="DataTables_Table_0_paginate"
			style="float: right; margin-top: 10px;margin-bottom: 10px">
			<span> <a class="paginate_button current"
				aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"
				href="javascript:void(0)"
				onclick="gopage(${p.navigateFirstPage  }) ">首页</a>
			</span> <a class="paginate_button previous disabled"
				aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0"
				id="DataTables_Table_0_previous" href="javascript:void(0)"
				onclick="gopage(${p.prePage  }) "> 上一页 </a> <span> <a
				class="paginate_button current" aria-controls="DataTables_Table_0"
				data-dt-idx="1" tabindex="0"> ${p.pageNum }</a>
			</span> <a class="paginate_button next disabled"
				aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0"
				id="DataTables_Table_0_next" href="javascript:void(0)"
				onclick="gopage(${p.nextPage  }) "> 下一页 </a> <span> <a
				class="paginate_button current" aria-controls="DataTables_Table_0"
				data-dt-idx="1" tabindex="0" href="javascript:void(0)"
				onclick="gopage(${p.navigateLastPage  }) ">尾页</a>
			</span>
		</div>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="<%=basePath%>lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
	
		//添加脚本
		$('#lay_add').on('click', function() {
			var index = "";
			layui.use([ 'layer' ], function() {
				var layer = layui.layer,
					index = layer.open(
						{
							skin : "layui-layer-molv",
							type : 1,
							title : "添加用户账号",
							content : $('#window-div'),
							area : 'auto',
							fix : false,
							offset : [ '300px', '600px' ],
							btn : [ '提交', '取消' ],
							shade : [ 0.5, 'white' ],
							anim : 1,
							resize : true,
	
							yes : function() {
								//alert($('#from').serialize());
								$.ajax(
									{
										type : "post",
										url : "xtuseraccountctrl/addxtuseraccount.do",
										data : $('#from').serialize(),
	
										dataType : "json",
										success : function(d) /* ??????????????????????????????????????????????????????????????????????bug==只显示添加失败，实际上成了，但是显示时间没有设置成功 */
	                                     
										{
										
												layer.msg('添加成功！', {
													icon : 6,
													time : 2000
												});
											
										},
									error:function(e)
									{
										layer.msg('添加失败！',{icon:5,time:2000});
									}
									});
								layer.close(index);
							},
	
							end : function() {
								setTimeout(function() {
									window.location.reload(); //关闭窗口时刷新页面
								}, 1000)
	
							}
						})
			})
	
	
		})
	
	
		//删除脚本
		function admin_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				$.ajax({
					type : 'post',
					url : 'xtuseraccountctrl/deletextuseraccount.do',
					data : "userId=" + id,
					dataType : "json",
					success : function(a) {
						$(obj).parents("tr").remove();
						layer.msg('已删除！', {
							icon : 6,
							time : 1000
						})
					}
				})
			})
		}
	
	
		//修改脚本
	
		function admin_edit(userId) {
			$.ajax({
				type : 'post',
				url : 'xtuseraccountctrl/goupdatextuseraccount.do?userId=' + userId,
				/* data:"userId="+userId, */
				dataType : "json",
				success : function(data) {
	
					$("#userId").val(data.userId);
					$("#userName").val(data.userName);
					$("#userPass").val(data.userPass);
					$("#staffId").val(data.staffId);
					$("#companyId").val(data.companyId);
					$("#accountStatus").val(data.accountStatus);
	
	
				}
			})
	
	
			index = layer.open(
				{
					skin : "layui-layer-molv",
					type : 1,
					title : "修改用户账号",
					content : $('#window-div1'),
					area : 'auto',
					fix : false,
					offset : [ '300px', '600px' ],
					btn : [ '提交', '取消' ],
					shade : [ 0.5, 'white' ],
					anim : 1,
					resize : true,
					yes : function() {
	
						$.ajax(
							{
								type : "post",
								url : "xtuseraccountctrl/updatextuseraccount.do",
								data : $('#from1').serialize(),
								dataType : "json",
								success : function(d) /*，这里为什么显示不出来？？？？？？？？？？？？？？？ */
								{
									layer.msg('修改成功！', {
										icon : 6,
										time : 1000
									});
								},
								error : function(e) {
									layer.msg('修改失败！', {
										icon : 5,
										time : 1000
									});
								}
							});
						layer.close(index);
					},
					
					cancel : function() {
						layer.close(index);
					},
					end : function() {
						window.location.reload(); //关闭窗口时刷新页面
					}
				})
	
		}
	
	
		//修改密码
		function admin_updatepass(userId) {
			index = layer.open(
				{
					skin : "layui-layer-molv",
					type : 1,
					title : "修改用户密码",
					content : $('#window-div2'),
					area : 'auto',
					fix : false,
					offset : [ '300px', '600px' ],
					btn : [ '提交', '取消' ],
					shade : [ 0.5, 'white' ],
					anim : 1,
					resize : true,
					yes : function() {
	
						$.ajax(
							{
								type : "post",
								url : "xtuseraccountctrl/updatextuseraccountpass.do?userId=" + userId,
								data : $('#from2').serialize(),
								dataType : "json",
								success : function(d) {
									/* 显示不出来！！！？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？ */
									layer.msg('修改成功！', {
										icon : 6,
										time : 1000
									});
								},
								error : function(e) {
									layer.msg('修改失败！', {
										icon : 5,
										time : 1000
									});
								}
							});
						layer.close(index);
					},
					
					cancel : function() {
						layer.close(index);
					},
					end : function() {
						window.location.reload(); //关闭窗口时刷新页面
					}
				})
	
		}
	
		//分页
		function gopage(pageNum) {
			$("#pageNum").val(pageNum);
			$("#myfrom").submit();
		}
		//批量删除
	
		function datadel() {
			if ($("input[name='ids']:checked").length >= 1) {
				layer.confirm('确认要删除吗？', function(index) {
					$("#myform1").submit();
				})
			} else {
				layer.msg('请至少选择一条数据！', {
					icon : 5,
					time : 1000
				});
			}
	
	
		}
	
		/*  window.onload = (function(){
		    // optional set
		    pageNav.pre="&lt;上一页";
		    pageNav.next="下一页&gt;";
		    // p,当前页码,pn,总页面
		    pageNav.fn = function(p,pn){$("#pageinfo").text("当前页:"+p+" 总页: "+pn);};
		    //重写分页状态,跳到第三页,总页33页
		    pageNav.go(1,13);
		}); */
		$('.table-sort').dataTable({
			"lengthMenu" : false, //显示数量选择 
			"bFilter" : false, //过滤功能
			"bPaginate" : false, //翻页信息
			"bInfo" : false, //数量信息
			"aaSorting" : [ [ 1, "desc" ] ], //默认第几个排序
			"bStateSave" : true, //状态保存
			"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 5 ]
				} // 制定列不参与排序
			]
		});
	</script>
</body>
</html>
