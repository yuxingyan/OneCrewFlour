<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'inquireprocess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script language="javascript" type="text/javascript">
		function test(){
 var url = "inquireprocess.jsp";
 window.location.href= url;
}
 function Check(){
   
   var n1=document.getElementById("date1").value;
   var n2=document.getElementById("date2").value;
 
      var erroring="";
 
      if(n1==""||n1==null){
        erroring+="请输入起始日期!"+'\n';
  }
 if(n2==""||n2==null){
     erroring+="请输入截止日期!"+'\n';
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
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-14" data-genuitec-path="/Flour/WebRoot/inquireprocess.jsp">
    <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-14" data-genuitec-path="/Flour/WebRoot/inquireprocess.jsp">查询统计报表</strong>面粉加工统计
    <center>
     <form  name="form1" id="form1" action="inquireprocess" method="post">
  
     <table border="1" width="600" cellspacing="0" bordercolor="#8EE1F6">
   
    <tr height="20px"><td align="center" colspan="4" >面粉加工统计</td></tr> 
    <tr height="20px"><td align="center" colspan="4" >&nbsp</td></tr> 
    <tr height="20px"><td align="center" colspan="4"  bgcolor="#f1f1f1">起始日期：<input type="date" name="startdate" id="date1"/></td>
    </tr>
    <tr height="20px"><td align="center" colspan="4"  bgcolor="#f1f1f1">截止日期：<input type="date" name="endstart" id="date2"/></td>
    </tr>
    <tr height="20px"><td align="center" colspan="4" ></td></tr> 
    <tr><td align="center" colspan="10" >
      <input type="button" value="确定" onclick="Check();">
      <input type="button" value="取消" onclick="test();"/>
    </td>
    </tr>
    </table>
    </form>
    </center>
  </body>
</html>