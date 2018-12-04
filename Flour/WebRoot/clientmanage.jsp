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
    
    <title>My JSP 'clientmanage.jsp' starting page</title>
    
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
  	
  	function deleteclient(){
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
  			document.forms[0].action="deleteclient"
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
  		          document.getElementById("cid").value=name; 
  					break;
  				}
  			}
  		}
  			
  				if(name==""){
  		
  			alert("请选择要更新的数据。");
  			}else{

        document.form1.action="passmodifyclient";      
        document.form1.submit();  }   

       } 
 </script>
  </head>
  
  <body>
  <strong style="font-size:25px">系统参数|</strong>客户管理
 
  <form name="form1" id="form1" >
  <center>
  <table border="1"  cellspacing="0" bordercolor="#8EE1F6" width="600">
  <tr>
 <td colspan="5"> <input type="radio" name="all" value="全部选择" checked />全部选择
 <input type="radio" name="all" value="全部取消 "/>全部取消  </td>
  </tr>
  <tr>
    <td style="text-align:center" colspan="5">客户管理 </td>
  </tr>
  <tr>
    <td colspan="5">*请点击客户姓名进行修改 </td>
  </tr>
  <tr>
    <td colspan="5">总页数；，当前页数：   </td>
  </tr>

  <tr >
    <td  align="center" bgcolor="#f1f1f1">编号  </td>
    <td  align="center" bgcolor="#f1f1f1">客户姓名 </td>
    <td  align="center" bgcolor="#f1f1f1">地址 </td>
    <td  align="center" bgcolor="#f1f1f1">标志</td>
    <td  align="center" bgcolor="#f1f1f1">操作   </td>
  </tr>
   <s:iterator value="#session.list" var="l">
			<tr>
			    
				<td><s:property value="#l.clientid" /></td>
				<td><s:property value="#l.clientname" /></td>
				<td><s:property value="#l.address" /></td>
				
				<td><input type="checkbox"name="movebox" value="<s:property value='#l.clientid' />"></td>
				<td><input type="hidden" id="cid"name="modify"><input type="button" id="del"value="修改" onclick="action1();"></a></input></td>
	
			</tr>
			</s:iterator> 
<tr>
         <td align="center" colspan="5" >
        <a href="#">首页</a>
        	<c:if test="">
         <a href="">上一页</a>
			</c:if>
		<c:if test="">
			<a href="">下一页</a>
		</c:if>	
			<a href=''>尾页</a>   
        
        </td>
        </tr>
  <tr>
    <td align="center" colspan="5"> <a href="addclient.jsp"><input type="button" value="添加" name="add"  style="width:50px;" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
         <input type="button" onclick="deleteclient();" value="删除" name="del" style="width:50px;" />&nbsp;&nbsp;&nbsp;&nbsp;
         <input type="button" value="取消" name="view" style="width:50px;" />
         </td>
  </tr>
 
  </table>
   </center>
  </body>
</html>
