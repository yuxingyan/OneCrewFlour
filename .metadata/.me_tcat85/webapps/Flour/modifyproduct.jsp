<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modifyproduct.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-21" data-genuitec-path="/Flour/WebRoot/modifyproduct.jsp">
  <form action="modifyproduct" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-21" data-genuitec-path="/Flour/WebRoot/modifyproduct.jsp">
  <table border="1" width="300">
     <tr height="20px"><td align="center" colspan="4" >产品类型修改</td></tr>
     <tr> <td>产品类型编号：<input name="product.typeid" type="text" style="height:20px;width:100px;"value="${list.typeid}" /></td></tr>  
     <tr> <td>产品类型名称：<input name="product.typename"type="text" style="height:20px;width:100px;" value="${list.typename}" /><font color="#ff0000">*</font></td></tr>  
     <tr height="20px"><td colspan="4" >商品类型：面粉</td></tr>
      <tr> <td>出粉率：<input name="product.note"type="text" style="height:20px;width:100px;" value="${list.note}" />%<font color="#ff0000">*</font></td></tr>  
      <tr><td align="center" colspan="10" >
      <button type="submit" >修改</button>
      <button type="button">取消</button>
    </td>
    </tr>
    </table>
    </form>
  </body>
</html>
