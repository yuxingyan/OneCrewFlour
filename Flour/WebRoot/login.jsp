<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
      <link rel="stylesheet"href="css/bg.css"type="text/css"/>
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <style type="text/css">

body {
      overflow: hidden;
        position: fixed;
        width:100%;
        height:100%;
 background-image: url(images/timg.jpg);
 background-size:cover;    
}

</style>
<script type="text/javascript">
   function Check(){
   	var n=document.getElementById("name").value;
   	var p=document.getElementById("pwd").value;
   	
   	var erroring="";
   	if(n==""){
   	erroring+="用户名不能为空!"+'\n';
   	}
   
    if(p==""){
    erroring+="密码不能为空!"+'\n';
    }
    
    if(erroring.length!=0){
    alert(erroring);
    erroring="";
    }else{
    	document.addForm.submit();
    }
   }
   
   </script>
   
   
  </head>
  
  <body>
     <form action="login" method="post" >
   <div id="long">
 <fieldset>
  <legend>登陆界面</legend>
     用户名:<input type="text" name="user.username" id="name"/><br><br>
     密&nbsp&nbsp&nbsp码:<input type="password" name="user.password" id="pwd"/><br>
      <button onclick="Check();"  id="buttonbg" value=""/>
 </fieldset>
     
    </div>
    </form>
   
  
 
   
  </body>
</html>
