/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2018-01-11 11:45:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.2.1.jar", Long.valueOf(1515652906491L));
    _jspx_dependants.put("jar:file:/E:/7组/.metadata/.me_tcat85/webapps/Flour/WEB-INF/lib/struts2-core-2.2.1.jar!/META-INF/struts-tags.tld", Long.valueOf(1279401888000L));
  }

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

      out.write("\r\n");
      out.write("\r\n");

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
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("    <link rel=\"stylesheet\"href=\"css/bg.css\"type=\"text/css\"/>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("  <script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"28278\",secure:\"28283\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("  \r\n");
      out.write("  <body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-8\" data-genuitec-path=\"/Flour/WebRoot/index.jsp\">\r\n");
      out.write("  \r\n");
      out.write("  <img src=\"images/login_05.gif\"width=\"100%\"height=\"100\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-8\" data-genuitec-path=\"/Flour/WebRoot/index.jsp\"> \r\n");
      out.write("  <div id=\"body\" >\r\n");
      out.write("  <img src=\"images/icon_1.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("   <img src=\"images/icon_2.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("    <img src=\"images/icon_3.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("     <img src=\"images/icon_4.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("      <img src=\"images/icon_5.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("       <img src=\"images/icon_6.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("        <img src=\"images/icon_7.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("         <img src=\"images/icon_8.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("          <img src=\"images/icon_9.bmp\"width=\"50\"height=\"50\"> \r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"main\">\r\n");
      out.write(" \r\n");
      out.write("   <div id=\"font\">菜单列表</div>\r\n");
      out.write("   \r\n");
      out.write("    <div id=\"esunTree\" class=\"tree\">系统菜单</div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("try{document.execCommand(\"BackgroundImageCache\",false,true)}catch(e){};\r\n");
      out.write("function Tree(data, el) {\r\n");
      out.write("    this.app=function(par,tag){return par.appendChild(document.createElement(tag))};\r\n");
      out.write("    this.create(document.getElementById(el),data)\r\n");
      out.write("};\r\n");
      out.write("Tree.fn = Tree.prototype = {\r\n");
      out.write("    create: function (par,group){\r\n");
      out.write("        var host=this, length = group.length;\r\n");
      out.write("        for (var i = 0; i < length; i++) {\r\n");
      out.write("            var dl =this.app(par,'DL'), dt = this.app(dl,'DT'), dd = this.app(dl,'DD');\r\n");
      out.write("            dt.innerHTML='<a href=\"javascript:void(0)\">'+group[i]['t']+'</a>';\r\n");
      out.write("            if (!group[i]['s'])continue;\r\n");
      out.write("            dt.group=group[i]['s'];\r\n");
      out.write("            dt.className+=\" node-close\";\r\n");
      out.write("            dt.onclick=function (){\r\n");
      out.write("                var dd= this.nextSibling;\r\n");
      out.write("                if (!dd.hasChildNodes()){\r\n");
      out.write("                     host.create(dd,this.group);\r\n");
      out.write("                     this.className='node-open'\r\n");
      out.write("                 }else{\r\n");
      out.write("                    var set=dd.style.display=='none'?['','node-open']:['none','node-close'];\r\n");
      out.write("                     dd.style.display=set[0];\r\n");
      out.write("                     this.className=set[1]\r\n");
      out.write("                 }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("var data=[{\r\n");
      out.write("        t:'原粮兑换面粉',s:[\r\n");
      out.write("            {t:'<a href=rawfoodinstore target=\"name\">原粮入库</a>'},\r\n");
      out.write("            {t:'<a href=flouruse target=\"name\">面粉领用</a>'},\r\n");
      out.write("            {t:'<a href=managestore target=\"name\">库存处理</a>'}\r\n");
      out.write("        ]\r\n");
      out.write("    },\r\n");
      out.write("    {t:'面粉厂原粮购置',s:[{t:'<a href=buy target=\"name\">面粉厂原粮购置</a>'}]},\r\n");
      out.write("    {t:'面粉厂面粉加工',s:[{t:'<a href=flourprocess target=\"name\">面粉厂面粉加工</a>'}]},\r\n");
      out.write("    {t:'面粉厂产品销售',s:[{t:'<a href=sale target=\"name\">面粉厂产品销售</a>'}]},\r\n");
      out.write("    {t:'欠款催收管理',s:[{t:'<a href=change target=\"name\">欠款催收管理</a>'}]},\r\n");
      out.write("    {t:'面粉厂库存清点',s:[{t:'<a href=checkflourstore target=\"name\">面粉厂库存清点</a>'}]},\r\n");
      out.write("    {\r\n");
      out.write("        t:'查询凭证报表',s:[\r\n");
      out.write("            {t:'<a href=inquireinstore.jsp target=\"name\">原粮入库查询</a>'},\r\n");
      out.write("            {t:'<a href=inquireuse.jsp target=\"name\">原粮领用查询</a>'},\r\n");
      out.write("            {t:'<a href=inquireprocess.jsp target=\"name\">面粉加工查询</a>'},\r\n");
      out.write("            {t:'<a href=inquireoutstore.jsp target=\"name\">产品出库查询</a>'},\r\n");
      out.write("            {t:'<a href=inquirebuy.jsp target=\"name\">原粮购置查询</a>'},\r\n");
      out.write("            {t:'<a href=inquiresale.jsp target=\"name\">产品销售查询</a>'},\r\n");
      out.write("            \r\n");
      out.write("        ]\r\n");
      out.write("    },\r\n");
      out.write("    {\r\n");
      out.write("        t:'系统参数',s:[\r\n");
      out.write("            {t:'<a href=\"userlogin\" target=\"name\">系统用户管理</a>'},\r\n");
      out.write("            {t:'<a href=\"clientlogin\" target=\"name\">客户管理</a>'},\r\n");
      out.write("            {t:'<a href=\"productlogin\" target=\"name\">产品类型管理</a>'}\r\n");
      out.write("        ]\r\n");
      out.write("    }\r\n");
      out.write("];\r\n");
      out.write("var et=new Tree(data,'esunTree');\r\n");
      out.write(" //]]>\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write(" <div id=\"gb\"><iframe src=\"welcome.jsp\"width=\"1000\"height=\"610\"name=\"name\"></div>\r\n");
      out.write("  \r\n");
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
