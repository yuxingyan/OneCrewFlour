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
    
    <title>My JSP 'useflour.jsp' starting page</title>
    
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
 var url = "flouruse";
 window.location.href= url;
}
		//弹出信息窗口
	 function show(obj){
       
        var x = window.screen.height;
    var y = window.screen.width;
    var h = 400;
    var w = 600;
    var model = "title=word,resizable=yes,scrollbars=no,height=" + h + ",width=" + w + ",status=no,toolbar=no,menubar=no,location=no,top=" + (x-h)/2 + ",left=" + (y-w)/2;
    var url = "";

    url = "inquireclient.jsp";//弹出窗口的页面内容
    var oOpen = window.open(url,"add",model);
    oOpen.focus();
    }
function Check(){
   
   var n1=document.getElementById("uweight").value;
   var n2=document.getElementById("op").value;
   var n3=document.getElementById("date").value;
   var n4=document.getElementById("addresstext").value;
 
      var n5=document.getElementById("nametext").value;
      var n6=document.getElementById("price").value;
      var erroring="";
var select=document.getElementById("sele");
     var s=select.options[select.selectedIndex].innerHTML;
     document.getElementById("option").value=s;
      if(n1==""||n1==null){
        erroring+="请输入领取面粉重量!"+'\n';
  }
 if(n2==""||n2==null){
     erroring+="请输入客户编号!"+'\n';
  }
 if(n3==""||n3==null){
  erroring+="请输入日期!"+'\n';
  }
 if(n4==""||n4==null){
  erroring+="请输入客户地址!"+'\n';
  }
 if(n5==""||n5==null){
  erroring+="请输入客户姓名!"+'\n';
  }
 
  if(n6==""||n6==null){
  erroring+="请输入加工费!"+'\n';
  }
  if(erroring.length!=0){
  alert(erroring);
  return false;

  
  }else{
  alert("保存成功！");
     document.form1.submit();    
  
  }
}
function cha(){
var cha;
if(document.getElementById("pay").value>document.getElementById("realpay").value){
cha=document.getElementById("pay").value-document.getElementById("realpay").value;
//var select=document.getElementById("selectid");
//var s=select.options[select.selectedIndex].value;
document.getElementById("cha").value=cha;
document.getElementById("selectid").value=3;
}
if(document.getElementById("pay").value<document.getElementById("realpay").value){
cha=document.getElementById("realpay").value-document.getElementById("pay").value;
//var select=document.getElementById("selectid");
//var s=select.options[select.selectedIndex].value;
document.getElementById("cha").value=cha;
document.getElementById("selectid").value=2;
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
  var uw=document.getElementById("uweight").value;
  var n=document.getElementById("note").value;
  document.getElementById("rawweight").value=uw/(0.01*n);
  document.getElementById("branweight").value=uw/(0.01*n)-uw;
  var price=document.getElementById("price").value;
  document.getElementById("sum").value=price*uw;
  
document.getElementById("pay").value=price*uw;
document.getElementById("realpay").value=price*uw;
  
  }
		 </script>


		 

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-35" data-genuitec-path="/Flour/WebRoot/useflour.jsp">
  <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-35" data-genuitec-path="/Flour/WebRoot/useflour.jsp">原粮兑换面粉|</strong>面粉领用
   <form id="form1"name="form1" action="addflouruse">
   <center>
    <table border="1" width="700" cellspacing="0" bordercolor="#8EE1F6">
    <input type="hidden" id="op" name="bian"/>
      <input type="hidden" id="option" name="option"/>
    <tr>
    <td  colspan="9" align="center" >面粉领用</td>
    </tr>
    
    <tr>
    <td colspan="2" align="right" bgcolor="#f1f1f1">凭证编号：</td>
    <td colspan="3" bgcolor="#f1f1f1"><input value="${count}"type="text" style="width:263px" name="useflour.eid" readonly /></td>
    <td colspan="1" align="right" bgcolor="#f1f1f1"> 日期：</td>
    <td colspan="3" bgcolor="#f1f1f1"><input type="date"  style="width:260px" name="useflour.date" id="date"/></td>
    </tr>
    
    <tr>
    <td  colspan="2" align="right" bgcolor="#f1f1f1">客户编号：</td>
    <td id="idtext" colspan="3" bgcolor="#f1f1f1"><input type="button"  onclick="show(this);"value="获取" name="clientid"/></td>
    <td  colspan="1" align="right" bgcolor="#f1f1f1"> 姓名：</td>
    <td  colspan="3" bgcolor="#f1f1f1"><input id="nametext" type="text" style="width:260px;background-color:#f1f1f1" name="clientname"readonly/></td>
    
    <tr>
    <td colspan="2" align="right"  bgcolor="#f1f1f1">地址：</td>
    <td  colspan="7"  bgcolor="#f1f1f1"><input id="addresstext"   style="width:612px;background-color:#f1f1f1"type="text" name="clientaddress" readonly/></td>
    </tr>
    
    <tr><td colspan="9" align="center">交易明细</td></tr>
    
    <tr>
    <td width="30"  bgcolor="#f1f1f1">小麦库存</td>
    <td  bgcolor="#f1f1f1">面粉类型</td>
    <td  bgcolor="#f1f1f1">领用面粉重量</td>
    <td  bgcolor="#f1f1f1">加工费￥</td>
    <td  bgcolor="#f1f1f1">出粉率</td>
    <td bgcolor="#f1f1f1">加工小麦</td>
    <td  bgcolor="#f1f1f1">出库麸皮</td>
    <td  bgcolor="#f1f1f1">总价￥</td>
    <td  bgcolor="#f1f1f1">领用麸皮</td>
    </tr>
    
    <tr>
    <td bgcolor="#f1f1f1"><input  style="width:80px;background-color:#f1f1f1"type="text" id="rawstore" readonly/></td>
    <td bgcolor="#f1f1f1"><select  onchange="sel();" id="sele">
	<option>产品种类</option>
	<s:iterator value="#request.list" var="l" >
	<option name="flourtype" value="<s:property value='#l.note'/>"><s:property  value="#l.typename"/></option>
	
	</s:iterator>
	</select>
	</td>
    <td ><input style="width:95px" type="text"id="uweight" name="useflour.uweight"/></td>
    <td><input style="width:80px" id="price" type="text" name="useflour.price"/></td>
    <td><input style="width:80px;background-color:#f1f1f1" type="text" id="note" name="useflour.rate" readonly/></td>
    <td><input  style="width:80px;background-color:#f1f1f1"type="text" id="rawweight" onBlur="cal();" name="useflour.rawweight"readonly/></td>
    <td><input  style="width:80px;background-color:#f1f1f1"type="text" id="branweight" name="useflour.branweight"readonly/></td>
    <td><input  style="width:80px;background-color:#f1f1f1"id="sum" type="text" name="useflour.sum"readonly/></td>
    <td bgcolor="#f1f1f1"><input style="width:80px" type="checkbox"/></td>
    </tr>
    
    
    <tr><td colspan="9" align="center">交易信息</td></tr>
    
    <tr>
    <td colspan="3" align="right" bgcolor="#f1f1f1">应收金额￥：</td>
    <td colspan="2" bgcolor="#f1f1f1"><input type="text" id="pay" name="pay"readonly/></td>
    <td colspan="2" align="right">实收金额￥：</td>
    <td colspan="2" onclick="cha();"><input type="text"id="realpay" name="realpay"/></td>
    </tr>
    
    <tr>
    <td colspan="3" align="right">收付状态：</td>
    <td colspan="2"><select id="selectid">
                    <option  selected>收支平衡</option>
                    <option value=2>支大于收</option>
                    <option value=3>收大于支</option></select></td>
    <td colspan="2" align="right" bgcolor="#f1f1f1">收付差额￥：</td>
    <td colspan="2" bgcolor="#f1f1f1"><input type="text" id="cha" value="0"readonly/></td>
    </tr>
    
    <tr>
    <td colspan="5" align="right"><input type="button" onclick="Check();"value="保存"/></td>
    <td colspan="4"><input type="button" value="取消" onclick="test();"/></td>
    </tr>
    
    </table>
    </center>
    </form>
  
  </body>
</html>