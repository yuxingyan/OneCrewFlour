<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addclient.jsp' starting page</title>
    
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
   
   var n1=document.getElementById("name").value;
   var n2=document.getElementById("address").value;
  var n3=document.getElementById("idcard").value;
  var n4=document.getElementById("phone").value;
    var n5=document.getElementById("homephone").value;
   var erroring="";
 
  if(n1==""||n1==null){
  erroring+="无效的客户名称!"+'\n';
  }
  if(n2==""||n1==null){
  erroring+="无效的联系地址!"+'\n';
  }
  if(n3==""||n1==null){
  erroring+="无效的身份证!"+'\n';
  }
  
  if(n4==""||n1==null){
  erroring+="无效的移动电话!"+'\n';
  }
   if(n4==""||n1==null){
  erroring+="无效的固定电话!"+'\n';
  }
  if(erroring.length!=0){
  alert(erroring);
  return false;

  
  }else{
     document.form1.submit();    
  
  }

  
  
 }  
   
   </script>

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/Flour/WebRoot/addclient.jsp">
     <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/Flour/WebRoot/addclient.jsp">系统参数|</strong>客户管理 
    <form action="addclient" id="form1" name="form1">
    
     <center>
    <table border="1px" cellspacing="0"
	 bordercolor="#8EE1F6">
    
       <tr>
       <td  style="text-align:center"  colspan="2">
                         客户添加
       </td>
       </tr>
       
        <tr>
        <td width="30%"align="right" nowrap="nowrap" bgcolor="#f1f1f1">客户姓名/企业名称：</td>
       <td bgcolor="#f1f1f1">
         <input name="client.clientname"  type="text" id="name"/><span style="color:red">*</span>
       </td>
       </tr>
       
        <tr>
         <td width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">联系地址：</td>
        <td bgcolor="#f1f1f1">
           <input name="client.address" type="text" id="address"/><span style="color:red">*</span>
       </td>
       </tr>
       
        <tr>
         <td width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">身份证/机构代码：</td>
       <td bgcolor="#f1f1f1">
        <input name="client.idcard" type="text" id="idcard"/><span style="color:red">*</span>
       </td>
       </tr>
          <tr>
           <td width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">移动电话：</td>
       <td bgcolor="#f1f1f1">
      <input name="client.phone" type="text" id="phone"/>
       </td>
       </tr>
          <tr>
          <td  width="30%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">固定电话：</td>
       <td bgcolor="#f1f1f1">
        <input name="client.homephone" type="text" id="homephone"/>
       </td>
       </tr>
       
       
     <tr>
     <td  colspan="2">&nbsp</td>
     </tr>
     
     
      <tr>
     <td  align="center"   colspan="2">
       <input type="button" onclick="Check();"  value="添加" /> &nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="取消"/>
     </td>
     </tr>
    </table>
    </center>
    </form>
  </body>
</html>
