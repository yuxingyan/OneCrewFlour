/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2018-01-11 11:20:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adduser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'adduser.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("   function Check(){\r\n");
      out.write("   \r\n");
      out.write("   var n1=document.getElementById(\"name1\").value;\r\n");
      out.write("   var n2=document.getElementById(\"name2\").value;\r\n");
      out.write("   var te=document.getElementById(\"tel\").value;\r\n");
      out.write("    \r\n");
      out.write("   var erroring=\"\";\r\n");
      out.write(" \r\n");
      out.write("  if(n1==\"\"||n1==null){\r\n");
      out.write("  erroring+=\"无效的用户名!\"+'\\n';\r\n");
      out.write("  }\r\n");
      out.write("  if(n2==\"\"||n1==null){\r\n");
      out.write("  erroring+=\"无效的姓名!\"+'\\n';\r\n");
      out.write("  }if(te==\"\"||te==null){\r\n");
      out.write("  erroring+=\"无效的手机号!\"+'\\n';\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  if(erroring.length!=0){\r\n");
      out.write("  alert(erroring);\r\n");
      out.write("  return false;\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  }else{\r\n");
      out.write("     document.form1.submit();    \r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" }  \r\n");
      out.write("   \r\n");
      out.write("   </script>\r\n");
      out.write("  <script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"28278\",secure:\"28283\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("  \r\n");
      out.write("  <body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-2\" data-genuitec-path=\"/Flour/WebRoot/adduser.jsp\"> <strong style=\"font-size:25px\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-2\" data-genuitec-path=\"/Flour/WebRoot/adduser.jsp\">系统参数|</strong>用户管理\r\n");
      out.write("  <center>\r\n");
      out.write("  <form id=\"form1\" name=\"form1\" action=\"adduser\">\r\n");
      out.write("  \r\n");
      out.write("   <table  border=\"1\" cellspacing=\"0\" width=\"500px\"  bordercolor=\"#8EE1F6\">\r\n");
      out.write("   <tr>\r\n");
      out.write("   <td align=\"center\"  colspan=\"2\">用户添加 </td>\r\n");
      out.write("   \r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("   <td  width=\"30%\"align=\"right\" nowrap=\"nowrap\" bgcolor=\"#f1f1f1\">用户名称：</td>\r\n");
      out.write("   <td bgcolor=\"#f1f1f1\"><input id=\"name1\" type=\"text\" name=\"user.username\" value=\"\"/><span style=\"color:red\">*</span> </td>\r\n");
      out.write("   \r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("   <td  width=\"30%\" align=\"right\" nowrap=\"nowrap\" bgcolor=\"#f1f1f1\">姓        名：</td>\r\n");
      out.write("   <td  bgcolor=\"#f1f1f1\"> <input id=\"name2\" type=\"text\" name=\"user.name\" value=\"\"/></td>\r\n");
      out.write("   \r\n");
      out.write("   </tr> \r\n");
      out.write("   <tr>\r\n");
      out.write("   <td  width=\"30%\"align=\"right\" nowrap=\"nowrap\" bgcolor=\"#f1f1f1\">电       话：</td>\r\n");
      out.write("   <td  bgcolor=\"#f1f1f1\"> <input id=\"tel\" type=\"text\" name=\"user.phone\" value=\"\"/></td>\r\n");
      out.write("   \r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("   <td colspan=\"2\">&nbsp </td>\r\n");
      out.write("   \r\n");
      out.write("   </tr>\r\n");
      out.write(" \r\n");
      out.write("   <tr><td align=\"center\" colspan=\"2\" >\r\n");
      out.write("  <input type=\"button\" onclick=\"Check();\"  value=\"添加\" /> \r\n");
      out.write("   <button  type=\"button\" >取消</button> \r\n");
      out.write("   </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   </table>\r\n");
      out.write("   </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
