<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>My JSP 'usermanage.jsp' starting page</title>
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
  	
  	function deleteAppuser(){
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
  			document.forms[0].action="deleteuser"
  				document.forms[0].submit();
  			}else{
  				document.forms[0].del.disabled=false;
  			}
  			
  		}else{
  		if(name==""){
  		
  			alert("请选择要删除的数据。");
  			}
  			else{
  			  alert("无法删除超级用户");
  			 
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
  		          document.getElementById("uid").value=name; 
  					break;
  				}
  			}
  		}
  			if(name==""){
  		
  			alert("请选择要更新的数据。");
  			}else{
  			

        document.form1.action="passmodify";      
        document.form1.submit();     
}

  } 




 </script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"28278",secure:"28283"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-36" data-genuitec-path="/Flour/WebRoot/usermanage.jsp">
  <strong style="font-size:25px" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-36" data-genuitec-path="/Flour/WebRoot/usermanage.jsp">系统参数|</strong>用户管理
 
  <form id="form1" name="form1">
  <center>
  <table border="1"  cellspacing="0" bordercolor="#8EE1F6"  id="box" width="600">
  <tr>
 <td colspan="6">  <input type="radio" name="flag" value="1" onClick="change(1)">
    全部选择 
    <input type="radio" name="flag" value="0" checked="checked" onClick="change(0)">
    全部取消</label>  </td>
  </tr>
  <tr>
    <td style="text-align:center" colspan="6">客户管理 </td>
  </tr>
  <tr>
    <td colspan="6">*请点击客户姓名进行修改 </td>
  </tr>
  <tr>
   
  </tr>

  <tr >
    <td  align="center" bgcolor="#f1f1f1">编号  </td>
    <td  align="center" bgcolor="#f1f1f1">用户名 </td>
    <td  align="center" bgcolor="#f1f1f1">姓名 </td>
    <td  align="center" bgcolor="#f1f1f1">电话   </td>
    <td  align="center" bgcolor="#f1f1f1">标志</td>
    <td  align="center" bgcolor="#f1f1f1">操作   </td>
    
  </tr>
   
 <s:iterator value="#session.list" var="l">
			<tr>
			    
				<td><s:property value="#l.userid" /></td>
				<td><s:property value="#l.username" /></td>
				<td><s:property value="#l.name" /></td>
				<td><s:property value="#l.phone" /></td>
				<td><input type="checkbox"name="movebox" value="<s:property value='#l.userid' />"></td>
				<td><input type="hidden" id="uid"name="modify"><input type="button" id="del"value="修改" onclick="action1();"></a></input></td>
				
				

				
				
			</tr>
			</s:iterator> 
			
 <!--<s:iterator value="#request['user']" var="userm">
	  	<tr>
	    <td>${userm.userid}</td>
	    <td>${userm.username}</td>
	    <td>${userm.name}</td>
	    <td>${userm.phone}</td>
	    <td>
	    <input type="checkbox" name="flag" value=${userm.userid}/></td>
	    <td>
	    <input type="button" name="change" value="修改" onclick="window.location.href='alteruser?appuser.appuserId=${userm.userid}'"/>
	    </td>
	</tr>
	 </s:iterator>
	<tr>
	    <s:if test="%{#attr.showpage==1}">  
	    <s:if test="#attr.maxpage==1"></s:if>
	    <s:else>
	     <a href="index?topage=${showpage+1}">下一页</a>&nbsp;
	          <a href="index?topage=${maxpage}">尾页</a>  
	    </s:else>
	    </s:if>
	    <s:elseif test="#request.topage>1&&#request.maxpage>#request.topage">
	    		<a href="index?topage=${1}">首页</a>&nbsp;
	    	    <a href="index?topage=${showpage-1}">上一页</a>&nbsp;
	            <a href="index?topage=${showpage+1}">下一页</a>   &nbsp;
                <a href="index?topage=${maxpage}">尾页</a>  
	   </s:elseif>
	   <s:elseif test="%{#attr.showpage==#attr.maxpage}">
	   <a href="index?topage=${1}">首页</a>&nbsp;
	   <a href="index?topage=${showpage-1}">上一页</a>&nbsp;
	   </s:elseif>
	   </tr>
	   
<!--  <tr>


         <td align="center" colspan="6" >
        <a href="#">首页</a>
        	<c:if test="">
         <a href="">上一页</a>
			</c:if>
		<c:if test="">
			<a href="">下一页</a>
		</c:if>	
			<a href=''>尾页</a>   
        
        </td>
        </tr>-->
  <tr>
    <td align="center" colspan="6"> <a href="adduser.jsp"><input type="button" value="添加" name="add"  style="width:50px;" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
         <input type="button" value="删除" name="del" style="width:50px;" onclick="deleteAppuser();"  />&nbsp;&nbsp;&nbsp;&nbsp;
         <input type="button" value="取消" name="view" style="width:50px;" />
         </td>
  </tr>
 
  </table>
   </center>
  
  </form>
   
  
  
     
  </body>
</html>