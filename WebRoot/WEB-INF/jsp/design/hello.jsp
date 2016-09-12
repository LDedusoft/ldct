<%@ page isELIgnored="false" %>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'hello.jsp' starting page</title>
    <script type="text/javascript" src="<%=basePath%>/js/jquery.min.js"></script>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">
  $(function(){
      $("#myButton").click(function(){
        $.ajax({
          url:"ajax",
          type:"post",
          dataType:"text",
          data:{
            name:"zhangsan",
            time:"2016-8-29"
          },
          success:function(responseText){
            alert(responseText);
          },
          error:function(){
            alert("system error");
          }
        });
      });
    });
  </script>
  </head>
  
  <body>
   		<h3> ============== ${param} ================</h3>
   		现在时间是：<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) %>
   		<button id="myButton">请求数据</button>
  </body>
</html>
