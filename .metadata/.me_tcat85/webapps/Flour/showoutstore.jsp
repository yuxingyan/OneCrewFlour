<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showoutstore.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-30" data-genuitec-path="/Flour/WebRoot/showoutstore.jsp">
   <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-30" data-genuitec-path="/Flour/WebRoot/showoutstore.jsp">查询统计报表</strong>产品出库统计
    <center>
    <form   name="产品出库统计" action="" method="post">
   
     <table border="1" width="600"  cellspacing="0" bordercolor="#8EE1F6">
  
     <tr height="20px"><td align="center" colspan="7" >产品出库统计</td></tr> 
     <tr height="20px"><td align="left" colspan="4" >起始日期：</td><td align="right" colspan="4" >截止日期：</td>
     <tr>
    <td align="center" bgcolor="#f1f1f1">凭证编号</td>
     <td align="center" bgcolor="#f1f1f1">客户姓名</td>
      <td align="center" bgcolor="#f1f1f1">商品名称</td>
       <td align="center" bgcolor="#f1f1f1">出库重量</td>
        <td align="center" bgcolor="#f1f1f1">交易日期</td>
         <td align="center" bgcolor="#f1f1f1">单价</td>
          <td align="center" bgcolor="#f1f1f1">总价</td>
    </tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td><td></td><td></td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>
    <tr><td align="center" colspan="10" >[1]</td></tr>
    <tr><td align="center" colspan="10" >
      <button type="button">返回</button>
      </td></tr>
    </table>
    </form>
    </center>
  </body>
</html>
