<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showinstore.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <strong style="font-size:25px">查询统计报表</strong>原粮入库统计
   <center>
    <form  name="原粮入库统计" action="" method="post"> 
    
      <table border="1" width="600"  cellspacing="0" bordercolor="#8EE1F6">
   
     <tr height="20px"><td align="center" colspan="5" >原粮入库统计</td></tr> 
     <tr height="20px"><td align="left" colspan="3" >起始日期：</td><td align="right" colspan="3" >截止日期：</td>
     <tr>
    <td align="center" bgcolor="#f1f1f1">凭证编号</td>
     <td align="center" bgcolor="#f1f1f1">客户姓名</td>
      <td align="center" bgcolor="#f1f1f1">产品名称</td>
       <td align="center" bgcolor="#f1f1f1">交易日期</td>
        <td align="center" bgcolor="#f1f1f1">入库重量</td>
    </tr>
                              
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td></tr>
    <tr height="20px"><td></td><td></td><td></td><td></td><td></td></tr>
    <tr><td align="center" colspan="10" >[1][2][3]下一页</td></tr>
    <tr><td align="center" colspan="10" >
      <button type="button">返回</button>
      </td></tr>
    </table>
    </form>
    </center>
  </body>
</html>