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
    
    <title>My JSP 'payoutcount.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	--><script type="text/javascript">
	   
    function delRow(obj){ //参数为A标签对象 
   var row = obj.parentNode.parentNode; //A标签所在行  
  var tb = row.parentNode; //当前表格   
 var rowIndex = row.rowIndex; //A标签所在行下标   
 tb.deleteRow(rowIndex); //删除当前行}</
}

    </script>

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-24" data-genuitec-path="/Flour/WebRoot/payoutcount.jsp">
      <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-24" data-genuitec-path="/Flour/WebRoot/payoutcount.jsp">户欠款查询|</strong>客户欠款纵览
    <from><center>
    <table border="1"  cellspacing="0" bordercolor="#8EE1F6">
    <tr>
    <td align="center" colspan="7">客户欠款明细</td>
    </tr>
       <tr>
        <td align="left" colspan="3" style="border-right-style:none">身份证编码：</td>
    <td align="right" colspan="4" style="border-left-style:none"><img src="images/green.JPG">代表应收金额<img src="images/red.JPG">代表应付金额</td>
    </tr>
        <tr>
      <td align="center" bgcolor="#f1f1f1">交易类型</td>
         <td align="center" bgcolor="#f1f1f1">交易时间</td>
         <td align="center" bgcolor="#f1f1f1">凭证编号</td>
         <td align="center" bgcolor="#f1f1f1">应收金额</td>
         <td align="center" bgcolor="#f1f1f1">实收金额</td>
         <td align="center" bgcolor="#f1f1f1">欠款金额</td>
         <td align="center" bgcolor="#f1f1f1">收付清算</td>
    </tr>
    <s:iterator value="#session.list" var="l">
   <s:if test="#l.flag==1">
      <tr style="color:red;" >
      <td align="center"><s:property value="#l.changetype"/></td>
      <td align="center"><s:property value="#l.date"/></td>
      <td align="center"><s:property value="#l.eid"/></td>
      <td align="center"><s:property value="#l.pay1"/></td>
      <td align="center"><s:property value="#l.realpay1"/></td>
      <td align="center"><s:property value="#l.pay"/></td>
      <td align="center"><input type="button" onclick="delRow(this)" value="清算"></td>
      </tr>
     
   </s:if>
  <s:else>
      <tr style="color:green;" >
       <td align="center"><s:property value="#l.changetype"/></td>
      <td align="center"><s:property value="#l.date"/></td>
      <td align="center"><s:property value="#l.eid"/></td>
      <td align="center"><s:property value="#l.pay1"/></td>
      <td align="center"><s:property value="#l.realpay1"/></td>
      <td align="center"><s:property value="#l.pay"/></td>
      <td align="center"><input type="button"onclick="delRow(this)" value="清算"></td>
      </tr>
     
  </s:else>
   </s:iterator>
   
        <tr>
    <td align="center" colspan="7"><input type="button" onclick="" value="返回"></td>
     </tr>  
    </table>
    </center>
    </from>
  </body>
</html>
