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
<title>库存管理</title>
</head>
<body>
	<nav class="breadcrumb"> <i class="Hui-iconfont">&#xe67f;</i> 首页
	<span class="c-gray en">&gt;</span> 库存中心 <span class="c-gray en">&gt;</span>
	商品管理 <a class="btn btn-success radius r"
		style="line-height:1.6em;margin-top:3px"
		href="javascript:location.replace(location.href);" title="刷新"><i
		class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="page-container">
		<form action="kcgoodsctrl/selectgoods.do" method="post" id="myform">
			<div class="text-c">
				日期范围： <input type="text"
					value="<fmt:formatDate value="${goods.datemin }"
									pattern="yyyy-MM-dd" />"
					onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })"
					id="datemin" name="datemin" class="input-text Wdate"
					style="width:120px;"> - <input type="text"
					value="<fmt:formatDate value="${goods.datemax }"
									pattern="yyyy-MM-dd" />"
					onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })"
					id="datemax" name="datemax" class="input-text Wdate"
					style="width:120px;"> <input type="text" class="input-text"
					value="${goods.goodsName }" style="width:250px"
					placeholder="请输入商品名称" id="goodsName" name="goodsName"> <input
					type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
				<button type="submit" class="btn btn-success radius" id="" name="">
					<i class="Hui-iconfont">&#xe665;</i> 搜索
				</button>
			</div>
		</form>
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"> <a href="javascript:;" onclick="datadel()"
				class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
					批量删除</a> <a href="javascript:;"
				onclick="member_add('添加商品','kcgoodsctrl/goaddgoods.do','','500')"
				class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i>
					添加商品</a></span> <span class="r">共有数据：<strong>${p.total }</strong> 条
			</span>
		</div>
		<div class="mt-20">
			<form action="kcgoodsctrl/deletegoodsall.do" method="post"
				id="myform1">
				<table
					class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th><input type="checkbox" name="" value=""></th>
							<th>ID</th>
							<th>商品名称</th>
							<th>商品种类</th>
							<th>公司编号</th>
							<th>库存数量</th>
							<th>最后修改时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${p.list }" var="goods">
							<tr class="text-c">
								<td><input type="checkbox" value="${goods.goodsId }"
									name="ids"></td>
								<td>${goods.goodsId }</td>
								<td><a title="商品详情" href="javascript:;"
									onclick="member_detail('商品详情','kcgoodsctrl/goodsdetail.do','${goods.goodsId }','','500')">${goods.goodsName }</a>
								</td>
								<td>${goods.goodsKind }</td>
								<td>${goods.companyId }</td>
								<td>${goods.stockNumber }</td>
								<td><fmt:formatDate value="${goods.lastModifiedTime }"
										pattern="yyyy-MM-dd HH:mm:ss" /></td>
								<td class="td-manage"><a title="编辑" href="javascript:;"
									onclick="member_edit('编辑','kcgoodsctrl/goaddgoods.do','${goods.goodsId }','','500')"
									class="ml-5" style="text-decoration:none"><i
										class="Hui-iconfont">&#xe6df;</i></a> <a title="删除"
									href="javascript:;"
									onclick="member_del(this,'${goods.goodsId }')" class="ml-5"
									style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</form>
		</div>
		<div>
			<div>第${p.pageNum }页，共${p.pages }页</div>
			<div align="right">
				<a href="javascript:void(0)"
					onclick="gopage(${p.navigateFirstPage })">首页</a> <a
					href="javascript:void(0)" onclick="gopage(${p.prePage })">上页</a> <a
					href="javascript:void(0)" onclick="gopage(${p.nextPage })">下页</a> <a
					href="javascript:void(0)" onclick="gopage(${p.navigateLastPage })">尾页</a>
			</div>
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
		$(function() {
			$('.table-sort').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ], //默认第几个排序
				"bStateSave" : true, //状态保存
				"aoColumnDefs" : [
					//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
					{
						"orderable" : false,
						"aTargets" : [ 0, 6 ]
					} // 制定列不参与排序
				],
				paging : false
			});
			$("#DataTables_Table_0_info").hide();
			$("#DataTables_Table_0_filter").hide();
		});
		/*商品-添加*/
		function member_add(title, url, w, h) {
			layer_show(title, url, w, h);
		}
		/*商品-详情*/
		function member_detail(title, url, id, w, h) {
			url = url + "?goodsId=" + id;
			layer_show(title, url, w, h);
		}
		/*商品-查看*/
		function member_show(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}
		/*商品-编辑*/
		function member_edit(title, url, id, w, h) {
			url = url + "?goodsId=" + id;
			layer_show(title, url, w, h);
		}
		/*商品-删除*/
		function member_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				$.ajax({
					type : 'POST',
					url : 'kcgoodsctrl/deletegoods.do',
					dataType : "goodsId=" + id,
					dataType : 'json',
					success : function(data) {
						$(obj).parents("tr").remove();
						layer.msg('已删除!', {
							icon : 1,
							time : 1000
						});
					},
					error : function(data) {
						console.log(data.msg);
					},
				});
			});
		}
		/* 商品-分页 */
		function gopage(pageNum) {
			$("#pageNum").val(pageNum);
			$("#myform").submit();
		}
		/* 商品-批量删除 */
		function datadel() {
			$("input[name='ids']")
			if ($("input[name='ids']:checked").length > 0) {
				layer.confirm('确认要删除吗？', function(index) {
					$("#myform1").submit();
				});
			} else {
				layer.confirm('至少选择一条数据！', {
					icon : 1,
					time : 1000
				});
			}
	
		}
	</script>
</body>
</html>