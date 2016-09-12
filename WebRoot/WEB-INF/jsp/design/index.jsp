
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=basePath %>uimaker/css/style.css" rel="stylesheet" type="text/css" />
</head>


<body>
<script>
	function logout(){
		parent.window.location.href="<%=basePath %>designLogout"; 
	}
</script>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">工具箱</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>常用功能</span></div>
    
    <div class="toolsli">
    <ul class="toollist">
    <li><a href="shiTiGuanLi"><img src="<%=basePath %>uimaker/images/i01.png" /></a><h2>试题管理</h2></li>
    <li><a href="shiJuanGuanLi"><img src="<%=basePath %>uimaker/images/i02.png" /></a><h2>试卷管理</h2></li>
    <li><a href="biSaiGuanLi"><img src="<%=basePath %>uimaker/images/i03.png" /></a><h2>比赛管理</h2></li>
    <li><a href="canSaiDuiYuanGuanLi"><img src="<%=basePath %>uimaker/images/i04.png" /></a><h2>队员管理</h2></li>
    <li><a href="biSaiTongJi"><img src="<%=basePath %>uimaker/images/i05.png" /></a><h2>比赛统计</h2></li>
    </ul>
    </div>
    
    <div class="formtitle"><span>系统设置</span></div>
    
    <div class="toolsli">
    <ul class="toollist">
    <li><a href="xiTongSheZhi"><img src="<%=basePath %>uimaker/images/i06.png" /></a><h2>系统设置</h2></li>
    <li><a href="#" onclick="logout()"><img src="<%=basePath %>uimaker/images/i07.png" /></a><h2>退出系统</h2></li>     
    </ul>
    </div>
    
    
    
    </div>


</body>

</html>
