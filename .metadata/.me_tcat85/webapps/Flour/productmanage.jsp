<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'productmanage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
  	function change(state){
  	 try{
  	   var checks = document.getElementsByTagName("input");
  	   var i=0;
  	   var length = checks.length;
  	   var flag = true;
  	   if(state==1){
  	     flag = true;
  	   }
  	   if(state==0){
  	   	flag = false;
  	   }
  	   for(i;i<length;i++){
  	   		if(checks[i].type=="checkbox"){
  	   			checks[i].checked=flag;
  	   		}
  	   }
  	 }catch(e){
  	   window.alert(e.message);
  	 }
  	}
  	
  	function deleteproduct(){
  		var checks = document.getElementsByTagName("input");
  		var i = 0;
  		var length = checks.length;
  		var name = "";
  		for(i;i<length;i++){
  		
  			if(checks[i].type=="checkbox"){
  		
  				if(checks[i].checked){
  					name= name + checks[i].value;
  		          
  					break;
  				}
  			}
  		}
  		if(name!=""&&name!="1"+","+"all"){
  			document.forms[0].del.disabled = true;
  			
              
  			var confirm_value = window.confirm("是否确定要删除？");
  			if(confirm_value==true){
  			document.forms[0].action="deleteproduct"
  				document.forms[0].submit();
  			}else{
  				document.forms[0].del.disabled=false;
  			}
  			
  		}else{
  		if(name==""){
  		
  			alert("请选择要删除的数据。");
  			}
  			else{
  			  alert("无法删除");
  			 
  			}
  			
  		}
  	}
  	 function   action1()      
  {   
  			var checks = document.getElementsByTagName("input");
  		var i = 0;
  		var length = checks.length;
  		var name = "";
  		for(i;i<length;i++){
  		
  			if(checks[i].type=="checkbox"){
  		
  				if(checks[i].checked){
  					name= name + checks[i].value;
  		          document.getElementById("pid").value=name; 
  					break;
  				}
  			}
  		}
  			
  				if(name==""){
  		
  			alert("请选择要更新的数据。");
  			}else{

        document.form1.action="passmodifyproduct";      
        document.form1.submit();     
}

  } 




 </script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-25" data-genuitec-path="/Flour/WebRoot/productmanage.jsp">
      <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-25" data-genuitec-path="/Flour/WebRoot/productmanage.jsp">系统参数</strong>产品类型管理
    <center>
    <form name="form1" id="form1" method="post">

    <table border="1" width="600"  cellspacing="0" bordercolor="#8EE1F6" >
    <tr><td colspan="10" >
    <input type="radio" name="select" value="male" id="select1" chacked="chacked"/>
    <lable for="select1">全部选择</lable>
     <input type="radio" name="select" value="female" id="select2"/>
    <lable for="select2">全部取消</lable></td>
    </tr>
   <tr height="20px"><td align="center" colspan="4" >产品类型管理</td></tr>  
    <tr><td colspan="10" >*请点击产品进行修改</td></tr>
    <tr><td colspan="10" >总页数:1 当前页数:1</td></tr>
    <tr>
    <td align="center">编号</td>
     <td align="center">产品</td>
      <td align="center">标志</td>
       <td align="center">操作</td>
    </tr>
    <s:iterator value="#session.list" var="l">
			<tr>
			    
				<td><s:property value="#l.typeid" /></td>
				<td><s:property value="#l.typename" /></td>
				<td><input type="checkbox"name="movebox" value="<s:property value='#l.typeid' />"></td>
				<td><input type="hidden" id="pid"name="modify"><input type="button" id="del"value="修改" onclick="action1();"></a></input></td>
				
				
				

				
				
			</tr>
			</s:iterator> 
    <tr><td align="center" colspan="10" >[1]</td></tr>
    <tr><td align="center" colspan="10" >
   <a href=addproduct.jsp> <button type="button">添加</button></a>
    <button type="button" onclick="deleteproduct();">删除</button>
    <button type="button">取消</button>
    </td>
    </tr>
    </table>
    
    
    
    </form>
    </center>
  </body>
</html>
