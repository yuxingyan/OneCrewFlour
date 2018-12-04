<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adduser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <script type="text/javascript">
   function Check(){
   
   var n1=document.getElementById("name1").value;
   var n2=document.getElementById("name2").value;
   var te=document.getElementById("tel").value;
    
   var erroring="";
 
  if(n1==""||n1==null){
  erroring+="无效的用户名!"+'\n';
  }
  if(n2==""||n1==null){
  erroring+="无效的姓名!"+'\n';
  }if(te==""||te==null){
  erroring+="无效的手机号!"+'\n';
  }
  
  if(erroring.length!=0){
  alert(erroring);
  return false;

  
  }else{
     document.form1.submit();    
  
  }

  
  
 }  
   
   </script>
  </head>
  
  <body> <strong style="font-size:25px">系统参数|</strong>用户管理
  <center>
  <form id="form1" name="form1" action="adduser">
  
   <table  border="1" cellspacing="0" width="500px"  bordercolor="#8EE1F6">
   <tr>
   <td align="center"  colspan="2">用户添加 </td>
   
   </tr>
   <tr>
   <td  width="30%"align="right" nowrap="nowrap" bgcolor="#f1f1f1">用户名称：</td>
   <td bgcolor="#f1f1f1"><input id="name1" type="text" name="user.username" value=""/><span style="color:red">*</span> </td>
   
   </tr>
   <tr>
   <td  width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">姓        名：</td>
   <td  bgcolor="#f1f1f1"> <input id="name2" type="text" name="user.name" value=""/></td>
   
   </tr> 
   <tr>
   <td  width="30%"align="right" nowrap="nowrap" bgcolor="#f1f1f1">电       话：</td>
   <td  bgcolor="#f1f1f1"> <input id="tel" type="text" name="user.phone" value=""/></td>
   
   </tr>
   <tr>
   <td colspan="2">&nbsp </td>
   
   </tr>
 
   <tr><td align="center" colspan="2" >
  <input type="button" onclick="Check();"  value="添加" /> 
   <button  type="button" >取消</button> 
   </td>
   </tr>
    
   
   
   </table>
   </form>
  </body>
</html>
