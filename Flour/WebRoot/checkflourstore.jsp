<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'checkflourstore.jsp' starting page</title>
    
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
   <strong style="font-size:25px">面粉厂库存清点|</strong>库存清点
    <form name="面粉厂库存清点" action="" method="post">
    <center>
    <table border="1" width="700" cellspacing="0" bordercolor="#8EE1F6">
    <tr>
    <td  colspan="12" align="center" >面粉厂库存清点</td>
    </tr>
    
 
    
    <tr>
    <td  align="center" bgcolor="#f1f1f1">编号</td>
    <td  align="center" bgcolor="#f1f1f1"> 产品名称</td>
    <td  align="center" bgcolor="#f1f1f1">库存总量</td>
    <td  align="center" bgcolor="#f1f1f1">客户库存</td>
    </tr>
    
   <s:iterator value="#session.list" var="l">
			<tr>
			    
				<td><s:property value="#l.id" /></td>
				<td><s:property value="#l.type" /></td>
				<td><s:property value="#l.sumstore" /></td>
				<td><s:property value="#l.clientstore" /></td>
				
				
				

				
				
			</tr>
			</s:iterator> 
    
    <tr><td  colspan="4" align="center">页码数</td></tr>
    
    
    
    
    </table>
    </center>
    </form>

  </body>
</html>
