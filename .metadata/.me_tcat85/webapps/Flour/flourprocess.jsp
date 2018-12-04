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
    
    <title>My JSP 'flourprocess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <script type="text/javascript">
         		function test(){
 var url = "flourprocess";
 window.location.href= url;
}
      function Check(){
   
       var n1=document.getElementById("weight").value;
       
        var n3=document.getElementById("date").value;
     
 
     
  var select=document.getElementById("sele");
     var s=select.options[select.selectedIndex].innerHTML;
     document.getElementById("option").value=s;
        var erroring="";
 
         if(n1==""||n1==null){
           erroring+="请输入加工重量!"+'\n';
         }
     
   if(n3==""||n3==null){
      erroring+="请输入日期!"+'\n';
  }

 
 
 
  if(erroring.length!=0){
  alert(erroring);
  return false;

  
  }else{
  alert("保存成功！");
     document.form1.submit();    
     window.location.href="flourMillTab.jsp?";
  
  }
}
  function sel(){
  	var a = document.getElementById("sele");
  	var index=a.selectedIndex;

  	document.getElementById("note").value=a.options[index].value;
  	document.getElementById("bran").value=0.0;
  	document.getElementById("flour").value=0.0;	
  	}
  	
  function cal(){
  var w=document.getElementById("weight").value;
  var n=document.getElementById("note").value;
  document.getElementById("flour").value=w*0.01*n;
  document.getElementById("bran").value=w-w*0.01*n;
  }
  
  </script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-7" data-genuitec-path="/Flour/WebRoot/flourprocess.jsp">
     <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-7" data-genuitec-path="/Flour/WebRoot/flourprocess.jsp">原粮兑换面粉|</strong>面粉加工
	<form id="form1" name="form1"action="addflourprocess" method="post">
	<center>
	<table border="1" cellspacing="0" bordercolor="#8EE1F6">
	 <input type="hidden" id="option" name="option"/>
	<tr>
	<td colspan="7" align="center">面粉加工</td>
	</tr>
	
	
	<tr>
	<td colspan="4" align="center" bgcolor="#f1f1f1">加工编号</td>
	<td colspan="3" align="center" bgcolor="#f1f1f1">加工日期</td>
	</tr>
	
	<tr>
	<td colspan="4" align="center" bgcolor="#f1f1f1"><input value="${id}"type="text" readonly/></td>
	<td colspan="3" align="center" bgcolor="#f1f1f1"><input type="date" id="date" name="process.date"/></td>
	</tr>
	
	<tr>
	<td  colspan="7">&nbsp</td>
	</tr>
	
	<tr>
	<td align="center" bgcolor="#f1f1f1">名称</td>
	<td align="center" bgcolor="#f1f1f1">库存</td>
	<td align="center" bgcolor="#f1f1f1">面粉类型</td>
	<td align="center" bgcolor="#f1f1f1">加工重量</td>
	<td align="center" bgcolor="#f1f1f1">出粉率</td>
	<td align="center" bgcolor="#f1f1f1">入库面粉</td>
	<td align="center" bgcolor="#f1f1f1">入库麸皮</td>
	</tr>
	
	
	<tr>
	<td align="center">小麦</td>
	<td><input style="width:95px" value="${count}" type="text" readonly/></td>
	<td><select  onchange="sel();" id="sele">
	<option>产品种类</option>
	<s:iterator value="#request.list" var="l" >
	<option name="flourtype" value="<s:property value='#l.note'/>"><s:property  value="#l.typename"/></option>
	
	</s:iterator>
	</select>
	</td>
	<td><input style="width:95px" onBlur="cal();" id="weight" name="process.rawweight"/></td>
	<td><input style="width:95px" id="note" name="process.rate"/>%</td>
	<td><input style="width:95px" id="flour" name="process.flourweight"/></td>
	<td><input style="width:95px"id="bran" name="process.branweight"/></td>
	</tr>
	
	<tr>
	<td colspan="7">&nbsp</td>
	</tr>
	
	<tr>
	<td colspan="4" align="right"><input type="button" value="保存"onclick="Check();"/></td>
	<td colspan="3"><input type="button" value="取消" onclick="test();"/></td>
	</tr>
	</table>
	</center>
	</form>
  </body>
</html>
