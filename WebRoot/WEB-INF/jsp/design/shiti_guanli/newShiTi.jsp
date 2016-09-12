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
    <form id="shitiform" method="post">
    <div>
		<label for="stName">试题名称:</label>
		<input class="easyui-validatebox" type="text" name="stName"  />
    </div>
    <div>
		<label for="stType">试题类型:</label>
		<input class="easyui-validatebox" type="text" name="stType" />
    </div>
    <div>
		<label for="clType">流程类型:</label>
		<input class="easyui-validatebox" type="text" name="clType" />
    </div>
   
</form>
 <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="submitSTForm();">确定</a>
		
<script type="text/javascript">

$('#shitiform').form({
    url:'<%=basePath%>addNewShiTi',
    onSubmit: function(){
		// do some check
		// return false to prevent submit;
		
    },
    success:function(data){
		alert(data);
    }
});
//提交form
function submitSTForm(){
	$('#shitiform').submit();
}
</script>
  </body>
</html>
