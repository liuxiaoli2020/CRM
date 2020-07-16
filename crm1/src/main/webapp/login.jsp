<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	<link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
	<link href="static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
	<link href="static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
	<link href="lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<title>后台登录 - 客户关系管理系统</title>
	<meta name="keywords" content="客户关系管理系统">
	<meta name="description" content="客户关系管理系统">
	</head>
	<body>
	<input type="hidden" id="TenantId" name="TenantId" value="" />
	<div class="header"></div>
	<div class="loginWraper">
	  <div id="loginform" class="loginBox">
	    <form class="form form-horizontal" action="loginctrl/login.do" method="post">
	      <div class="row cl">
	        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
	        <div class="formControls col-xs-8">
	          <input id="userName" name="userName" type="text" placeholder="账户" class="input-text size-L">
	        </div>
	      </div>
	      <div class="row cl">
	        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
	        <div class="formControls col-xs-8">
	          <input id="userPass" name="userPass" type="password" placeholder="密码" class="input-text size-L">
	        </div>
	      </div>
	      <div class="row cl">
	        <div class="formControls col-xs-8 col-xs-offset-3">
	          <input class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
	          <img src=""> <a id="kanbuq" href="javascript:;">看不清，换一张</a> </div>
	      </div>
	      <div class="row cl">
	        <div class="formControls col-xs-8 col-xs-offset-3">
	          <label for="online">
	            <input type="checkbox" name="online" id="online" value="">
	            使我保持登录状态</label>
	        </div>
	      </div>
	      <div class="row cl">
	        <div class="formControls col-xs-8 col-xs-offset-3">
	          <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
	          <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
	        </div>
	      </div>
	    </form>
	  </div>
	</div>
	<div class="footer">Copyright 你的公司名称 by H-ui.admin v3.1</div>
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>

	<script>
	var _hmt = _hmt || [];
	(function() {
	  var hm = document.createElement("script");
	  hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
	  var s = document.getElementsByTagName("script")[0]; 
	  s.parentNode.insertBefore(hm, s);
	})();
	</script>
	
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
	
	<script type="text/javascript">
	var isfail="${param.isfail}";
	if(isfail=="unknow"){
	layer.msg('账户不存在', {icon: 5,time:3000});
	}else if(isfail=="error"){
	layer.msg('账户或密码错误', {icon: 5,time:3000});
	}else if(isfail=="code"){
	layer.msg('验证码错误', {icon: 5,time:3000});
	}
	else if(isfail=="other"){
	layer.msg('登录未知错误', {icon: 5,time:3000});
	}
	</script>
	</body>
	</html>
