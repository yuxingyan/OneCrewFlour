<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'buy.jsp' starting page</title>
    
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
 var url = "buy";
 window.location.href= url;
}
    function Check(){
   
   var n1=document.getElementById("bagweight").value;
   var n2=document.getElementById("op").value;
   var n3=document.getElementById("date").value;
   var n4=document.getElementById("addresstext").value;
 
      var n5=document.getElementById("nametext").value;
      var n6=document.getElementById("price").value;
       var n7=document.getElementById("bag").value;
      var erroring="";
 
      if(n1==""||n1==null){
        erroring+="请输入每袋小麦重量!"+'\n';
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
   if(n7==""||n7==null){
  erroring+="请输小麦袋数!"+'\n';
  }
  if(erroring.length!=0){
  alert(erroring);
  return false;

  
  }else{
  alert("保存成功！");
     document.form1.submit();    
  
  }
}
		//弹出信息窗口
		function showWindow(){

			window.open ('otherinquireclient.jsp','add', 
'height=600, width=800, top=60, left=200, toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no, status=no') ;
} 
function add(){

var bagweight=document.getElementById("bagweight").value;
var bag=document.getElementById("bag").value;
var sum=bagweight*bag;
var price=document.getElementById("price").value
var sumprice=sum*price;
document.getElementById("sumbag").value=sum;
document.getElementById("sumprice").value=sumprice;
document.getElementById("pay").value=sumprice;
document.getElementById("realpay").value=sumprice;

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

		 </script>
  </head>
  
  <body>
    <form action="addbuy" id="form1" name="form1">
   
    <strong style="font-size:25px">原粮兑换面粉|</strong>原粮购置
    
     <center>
    <table  border="1" cellspacing="0" bordercolor="#8EE1F6" >
    <tr >
    <td  colspan="7" width="600" align="center"  >原粮购置 </td>
   
    </tr>
    <tr>
    <td  colspan="2" align="right"   bgcolor="#f1f1f1">凭证编号：</td>
    <td  colspan="1"  bgcolor="#f1f1f1" ><input type="text" name="buy.eid"value="${count}"readonly/></td>
    <td  colspan="2" align="right"   bgcolor="#f1f1f1" >日期：</td>
    <td colspan="2" ><input type="date" name="buy.date" id="date" style="width:148px"></td>
    </tr>
     <input type="hidden" id="op" name="bian"/>
    <tr>
    <td  colspan="2" align="right"   bgcolor="#f1f1f1">供应商编号：</td>
    <td  colspan="1"  bgcolor="#f1f1f1" id="idtext" ><input  type="button" onclick="showWindow();" value="获取" /></td>
    <td  colspan="2" align="right"   bgcolor="#f1f1f1" >供应商姓名：</td>
    <td  colspan="2"  bgcolor="#f1f1f1" ><input  id="nametext" type="text" readonly/></td>
    </tr>
    <tr>
    <td  colspan="2" align="right"   bgcolor="#f1f1f1">供应商地址：</td>
    <td colspan="5"  bgcolor="#f1f1f1" ><input id="addresstext" type="text" readonly/></td>
    </tr>
    <tr>
    <td colspan="7" align="left">交易明细</td>
    </tr> 
    <tr>
    <td align="center"   bgcolor="#f1f1f1">名称</td>
    
    <td align="center"   bgcolor="#f1f1f1">每袋重量</td>
    <td align="center"   bgcolor="#f1f1f1">袋数</td>
    <td align="center"   bgcolor="#f1f1f1">总重量</td>
    <td align="center"   bgcolor="#f1f1f1">单价￥</td>
    <td align="center"   bgcolor="#f1f1f1">总价￥</td>
    </tr> 
    <tr>
    <td align="center" > <select >产品种类
    <option value="1">产品 种类</option>
    <option value="2">小麦</option>
  
    </select></td>
    
    <td ><input type="text"name="buy.bagweight" id="bagweight" ></td>
    <td> <input type="text" id="bag" name="buy.bag" ></td>
    <td onclick="add();" align="center"  bgcolor="#f1f1f1"><input type="text" id="sumbag" name="buy.weight"value="0"readonly></td>
    <td><input type="text" id="price" name="buy.price"></td>
    <td  onclick="add();"bgcolor="#f1f1f1"><input type="text" id="sumprice" value="0" name="buy.sum"></td>
    </tr> 
    <tr>
    <td colspan="7">&nbsp</td>
    </tr> 
    <tr>
    <td colspan="7" align="left">交易信息</td>
    </tr>
    <tr>
    <td colspan="2" align="right"   bgcolor="#f1f1f1">应付金额￥：</td>
    <td  colspan="1"  bgcolor="#f1f1f1"><input type="text" id="pay" value="0" name="pay"readonly/></td>
    <td  colspan="2" align="right"   bgcolor="#f1f1f1">实付金额￥：</td>
    <td colspan="2" onclick="cha();"><input type="text" id="realpay" value="0" name="realpay"readonly></td>
    </tr>
    <tr>
    <td colspan="2" align="right"   bgcolor="#f1f1f1">收付状态：</td>
    <td align="left"   bgcolor="#f1f1f1"> <select id="selectid" >收付平衡
                    <option  selected>收支平衡</option>
                    <option value=2>支大于收</option>
                    <option value=3>收大于支</option>
    </select></td>
    <td  colspan="2" align="right"   bgcolor="#f1f1f1">收付差额￥：</td>
    <td colspan="2"  bgcolor="#f1f1f1"><input type="text" id="cha" value="0" readonly/></td>
    </tr>
    <tr>
   <td align="center" colspan="7"> <input type="button" onclick="Check();"value="保存" />  <input type="button" value="取消" onclick="test();"/>
   
   </tr>
    
    </table>
  </center>
  
  </form>
  </body>
</html>
