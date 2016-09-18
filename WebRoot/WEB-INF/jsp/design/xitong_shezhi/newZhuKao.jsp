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
<div style="width:500px;">
		<div style="padding:0px 0px 0px 0px; overflow:hidden;">
	    <form id="newZhuKaoForm" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td style="width：60px;">用户名:</td>
	    			<td><input style="height:23px;" class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>密码:</td>
	    			<td><input style="height:23px;" class="easyui-textbox" type="password" name="pwd" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>确认密码:</td>
	    			<td><input style="height:23px;" class="easyui-textbox" type="password" name="surepwd" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>真实姓名:</td>
	    			<td><input style="height:23px;" class="easyui-textbox" type="text" name="truename" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>性别:</td>
	    			<td>
	    				<select id="sex" class="easyui-combobox" name="sex" style="width:50px;height:23px;"><option value="男">男</option><option value="女">女</option></select>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>电话:</td>
	    			<td><input style="height:23px;" class="easyui-textbox" type="text" name="tel" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td width=60px;>所属学校:</td>
	    			<td>
	    				<select id="school" class="easyui-combobox" name="school" style="width:80px;height:23px;"><option value="1">龙鼎</option><option value="2">奇峰</option></select>
	    			</td>
	    		</tr>
	    		<input id="words" type="hidden" name="words" value="">
	    	</table>
	 <div style="height:60px;margin:0px;padding:0px;margin-top: 10px">
	 	<div style="width:60px;height:60px;line-height:60px;padding-left:7px;float:left;vertical-align: top;">
	 		<label style="height:20px;line-height:20px;vertical-align: top;margin-top: 0px">权限分配:</label>
	 	</div>
	 
	 	<div style="width:400px;height: 50px;padding-left:15px;float:left;">
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input id="shiti"  type="checkbox" value="shiti" style="margin:0px;margin-right: 0px">
	    		<label onclick="selectCheck('shiti')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试题管理</label>
	    	</div>
	    	
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input id='shijuan'  type="checkbox" value="shijuan" style="margin:0px;margin-right: 0px">
	    		<label onclick="selectCheck('shijuan')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">试卷管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input id="bisaiguanli"  type="checkbox" value="bisaiguanli" style="margin:0px;margin-right: 0px">
	    		<label onclick="selectCheck('bisaiguanli')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">比赛管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;">
	    		<input id="duiyuan" type="checkbox" value="duiyuan" style="margin:0px;margin-right: 0px">
	    		<label onclick="selectCheck('duiyuan')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">参赛队员管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input id="bisaitongji" type="checkbox" value="bisaitongji" style="margin:0px;margin-right: 0px">
	    		<label onclick="selectCheck('bisaitongji')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">比赛统计</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input id="xuexiao"  type="checkbox" value="xuexiao" style="margin:0px;margin-right: 0px">
	    		<label onclick="selectCheck('xuexiao')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">学校管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input id="zhukao"  type="checkbox" value="zhukao" style="margin:0px;margin-right: 0px">
	    		<label onclick="selectCheck('zhukao')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">主考管理</label>
	    	</div>
	    	<div style="float:left;height:20px;line-height:20px;margin-right: 10px;text-align:center;margin-top:10px;">
	    		<input id="jiankao" type="checkbox" value="jiankao" style="margin:0px;margin-right: 0px;">
	    		<label onclick="selectCheck('jiankao')" style="height:20px;line-height:20px;font-size: 15px;margin-left: -5px">监考管理</label>
	    	</div>
	    </div>
	  </div>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">保存</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
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
		$('#newZhuKaoForm').form({
		    url:'<%=basePath%>addZhuKao',
		    onSubmit: function(){
				// do some check
				// return false to prevent submit;
		    },
		    success:function(data){
				alert(data);
		    }
		});
		//提交form
		function submitForm(){
			var words = "";
			$('#newZhuKaoForm').find(':checkbox').each(function(){
			   if ($(this).is(":checked")) { 
			      words += ","+$(this).val();
			 	 } 
			 });
			 if(words.length>0){
			 	words = words.substring(1);
			 }
			 $('#words').attr("value",words);
			 alert($('#words').val());
			$('#newZhuKaoForm').submit();
		}
		function clearForm(){
			$('#newZhuKaoForm').form('clear');
		}
		
		function selectCheck(checkName){
			$('#'+checkName).prop('checked',!$('#'+checkName).prop('checked'));
			
		}
	</script>
  </body>
</html>
