<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.ld.dbPOJO.TeacherUserInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
TeacherUserInfo userInfo = new TeacherUserInfo();
if(session.getAttribute("userInfo")!=null){
 userInfo = (TeacherUserInfo)session.getAttribute("userInfo");
 }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'newShiTi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>easyui/style/style.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>easyui/themes/icon.css">
	<script type="text/javascript" src="<%=basePath%>easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>easyui/jquery.easyui.min.js"></script>

  </head>
  
  <body>
<div style="width:500px">
		<div style="padding:10px 0px 20px 0px">
	    <form id="ff" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td width=60px;>用户名:</td>
	    			<td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>密码:</td>
	    			<td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>确认密码:</td>
	    			<td><input class="easyui-textbox" type="text" name="subject" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>真实密码:</td>
	    			<td><input class="easyui-textbox" type="text" name="subject" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>性别:</td>
	    			<td>
	    				<select id="sex" class="easyui-combobox" name="language" style="width:50px;"><option value="ar">男</option><option value="bg">女</option></select>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>电话:</td>
	    			<td><input class="easyui-textbox" type="text" name="subject" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>所属学校:</td>
	    			<td>
	    				<select id="school" class="easyui-combobox" name="language" style="width:80px;"><option value="ar">龙鼎</option><option value="bg">奇峰</option></select>
	    			</td>
	    		</tr>
	    		
	    	</table>
	 <div style="height:60px;margin:0px;padding:0px;margin-top: 10px">
	 <div style="width:60px;height:60px;line-height:60px;padding-left:7px;float:left;vertical-align: top;">
	 	<label style="height:20px;line-height:20px;vertical-align: top;margin-top: 0px">权限分配:</label>
	 </div>
	 
	 <div style="width:400px;height: 50px;padding-left:15px;float:left;">
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input  type="checkbox" name="sex" value="male" style="margin:0px;margin-right: 0px;">
	    		<label style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	
	    	
	    	
	    			
	    	 </div>
	    </div>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
	    </div>
	    </div>
	</div>
	<script>
		var sexNum = document.getElementById("sex").options.length;
            var schoolNum = document.getElementById("school").options.length;
            $("#sex").combobox({panelHeight:25*sexNum});
            $("#school").combobox({panelHeight:25*schoolNum});
            $('#fb').filebox({
            buttonText: '选择图片',
            buttonAlign: 'left'
            })
		function submitForm(){
			$('#ff').form('submit');
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
  </body>
</html>
