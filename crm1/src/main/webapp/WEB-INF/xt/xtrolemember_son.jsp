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

<title>成员管理</title>

</head>
<body>

 
 
            
         <form action="xtrolememberctrl/addmumberall.do" id="myform2">
				<table
					class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width="25"><input type="checkbox" id="all_check"></th>
							<th width="80">用户编号</th>
							<th width="100">用户名</th>
							<th width="90">员工编号</th>
							<th width="90">公司编号</th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${p2.list }" var="g">
							<tr class="text-c">
								<td><input type="checkbox" value="${g.userId }" name="idss"></td>
								<td>${g.userId }</td>
	
								<td><u style="cursor:pointer" class="text-primary"
									onclick="user_show('10001','360','','张三','user-show.html')">${g.userName }</u></td>
	
								<td>${g.staffId }</td>
								<td>${g.companyId }</td>
								
							</tr>
						</c:forEach>
	
					</tbody>
	
				</table>
				<input type="hidden" name="roleId" value="${sessionScope.nowRole1.roleId }">
				<a onclick="addmembers()">提 交</a>
			</form>

		<div class="dataTables_info" id="DataTables_Table_0_info"
			role="status" aria-live="polite"
			style="float: left; margin-top: 10px;margin-bottom: 10px">当前
			${p2.pageNum } / ${p2.pages} 页 ，共 ${p2.total } 条</div>
		<div class="dataTables_paginate paging_simple_numbers"
			id="DataTables_Table_0_paginate"
			style="float: right; margin-top: 10px;margin-bottom: 10px">
			<span> <a class="paginate_button current"
				aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"
				href="javascript:void(0)"
				onclick="gopage(${p2.navigateFirstPage  }) ">首页</a>
			</span> <a class="paginate_button previous disabled"
				aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0"
				id="DataTables_Table_0_previous" href="javascript:void(0)"
				onclick="gopage(${p2.prePage  }) "> 上一页 </a> <span> <a
				class="paginate_button current" aria-controls="DataTables_Table_0"
				data-dt-idx="1" tabindex="0"> ${p2.pageNum }</a>
			</span> <a class="paginate_button next disabled"
				aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0"
				id="DataTables_Table_0_next" href="javascript:void(0)"
				onclick="gopage(${p2.nextPage  }) "> 下一页 </a> <span> <a
				class="paginate_button current" aria-controls="DataTables_Table_0"
				data-dt-idx="1" tabindex="0" href="javascript:void(0)"
				onclick="gopage(${p2.navigateLastPage  }) ">尾页</a>
			</span>
		</div>

        
         



<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript">
function addmembers()
{
	if($("input[name='idss']:checked").length>0)
	{
		
		 $("#myform2").submit();
		alert("41111");
		 
	}else
	{
		layer.msg('请至少选择一条数据！',{icon:5,time:1000});
	}
	var index = parent.layer.getFrameIndex(window.name); //获取窗口索引  
         parent.layer.close(index);
        
}
</script>
</body>
</html>