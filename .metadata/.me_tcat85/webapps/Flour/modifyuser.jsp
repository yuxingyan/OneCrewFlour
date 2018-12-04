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
    
    <title>My JSP 'modifyuser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-22" data-genuitec-path="/Flour/WebRoot/modifyuser.jsp">
  <center data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-22" data-genuitec-path="/Flour/WebRoot/modifyuser.jsp">
  <form action="modifyuser">
   <table  border="1" style="border-collapse:collapse" >
   <tr>
   <td    align="center" colspan="2" >用户修改 </td>
   
   </tr>
  
   <tr>
   <td  align="right" width="150"  bgcolor="#f1f1f1">用户序号：</td>
   <td width="300" bgcolor="#f1f1f1"> <input type="text" name="user.userid" value="${list.userid}"></input></td>
   
   </tr>
   <tr>
   <td align="right"  width="150" bgcolor="#f1f1f1">用户名称： </td>
   <td width="300" bgcolor="#f1f1f1"> <input type="text" name="user.username" value="${list.username}"><span style="color:red">*</span></td>
   
   </tr>
   <tr>
    <td  align="right"   width="150" bgcolor="#f1f1f1">原始密码：</td>
   <td width="300" bgcolor="#f1f1f1"> <input type="password"  name="user.password"><span style="color:red">*</span></td>
   
   </tr>
   
   <tr>
   <td align="right" width="150"  bgcolor="#f1f1f1">新密码：</td>
   <td width="300" bgcolor="#f1f1f1"> <input type="password" name="newpwd" ><span style="color:red">*</span></td>
   
   </tr>
   <tr>
   <td align="right"  width="150" bgcolor="#f1f1f1">确认密码：</td>
   <td width="300" bgcolor="#f1f1f1"> <input type="password" name="newpwd1"><span style="color:red">*</span></td>
   
   </tr>
   <tr>
   <td align="right" width="150" bgcolor="#f1f1f1">姓名：</td>
   <td width="300" bgcolor="#f1f1f1"> <input type="text" name="user.name" value="${list.name}"><span style="color:red">*</span></td>
   
   </tr>
   <tr>
   <td align="right"  width="150" bgcolor="#f1f1f1">电话：</td>
   <td width="300" bgcolor="#f1f1f1"><input type="text" name="user.phone"value="${list.phone}" ><span style="color:red">*</span></td>
   
   </tr>
  
   <tr>
   <td colspan="2"> &nbsp</td>
   </tr>
   
   
   <tr>
   <td align="center" colspan="2"> <input type="submit" value="修改" />  <button  type="button"   />取消 </td>
   
   </tr>
    
   
   
   </table>
   </form>
  </body>
</html>
