<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modifyclient.jsp' starting page</title>
    
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
    <strong>系统参数|</strong>客户管理</div>  
    <form action="modifyclient">
     <center>
    <table  border="1" style="border-collapse: collapse">
    
       <tr>
       <td  style="text-align:center"  colspan="2">
                         客户修改
       </td>
       </tr>
        <tr>
        <td width="30%"align="right" nowrap="nowrap" bgcolor="#f1f1f1">客户编号：</td>
       <td bgcolor="#f1f1f1">
         <input name="client.clientid" value="${list.clientid}" type="text"/>
       </td>
       </tr>
        <tr>
        <td width="30%"align="right" nowrap="nowrap" bgcolor="#f1f1f1">客户姓名/企业名称：</td>
       <td bgcolor="#f1f1f1">
         <input name="client.clientname" value="${list.clientname}" type="text"/><span style="color:red">*</span>
       </td>
       </tr>
       
        <tr>
         <td width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">联系地址：</td>
        <td bgcolor="#f1f1f1">
           <input name="client.address" value="${list.address}" type="text"/><span style="color:red">*</span>
       </td>
       </tr>
       
        <tr>
         <td width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">身份证/机构代码：</td>
       <td bgcolor="#f1f1f1">
        <input name="client.idcard"value="${list.idcard}" type="text"/><span style="color:red">*</span>
       </td>
       </tr>
          <tr>
           <td width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">移动电话：</td>
       <td bgcolor="#f1f1f1">
      <input name="client.phone" value="${list.phone}"type="text"/>
       </td>
       </tr>
          <tr>
          <td  width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">固定电话：</td>
       <td bgcolor="#f1f1f1">
        <input name="client.homephone" value="${list.homephone}"type="text"/>
       </td>
       </tr>
       
       
     <tr>
     <td  colspan="2">&nbsp</td>
     </tr>
     
     
      <tr>
     <td  align="center"   colspan="2">
       <input type="submit" value="修改"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="取消"/>
     </td>
     </tr>
    </table>
    </center>
    </form>
  </body>
</html>
