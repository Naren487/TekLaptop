/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-03-27 05:33:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Flight_005fSelection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1679142713890L));
    _jspx_dependants.put("jar:file:/D:/Extra/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323238578000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset='utf-8'>\r\n");
      out.write("    <meta http-equiv='X-UA-Compatible' content='IE=edge'>\r\n");
      out.write("    <title>Rashika's Airline</title>\r\n");
      out.write("    <meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("   	<style>\r\n");
      out.write("   	html {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("  }\r\n");
      out.write("  body {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: sans-serif;\r\n");
      out.write("    background:linear-gradient(#b9d2ff, #111c29);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    padding: 40px;\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    box-shadow: 0 15px 25px rgba(0, 0, 0, 0.6);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box h2 {\r\n");
      out.write("    margin: 0 0 30px;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("   color: black;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box .user-box {\r\n");
      out.write("    position: relative;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box .user-box input ,.login-box .user-box select {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: black;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    \r\n");
      out.write("  border-bottom: 1px solid #010a14;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("  }\r\n");
      out.write("  .login-box .user-box label {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    pointer-events: none;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box .user-box input:focus ~ label,\r\n");
      out.write("  .login-box .user-box input:valid ~ label {\r\n");
      out.write("    top: -20px;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    color: #03e9f4;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box form .design {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    color: #03e9f4;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("    margin-top: 40px;\r\n");
      out.write("    letter-spacing: 4px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box .design:hover {\r\n");
      out.write("    background: #03e9f4;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4,\r\n");
      out.write("      0 0 100px #03e9f4;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box a span {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    display: block;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box a span:nth-child(1) {\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: -100%;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 2px;\r\n");
      out.write("    background: linear-gradient(90deg, transparent, #03e9f4);\r\n");
      out.write("    animation: btn-anim1 1s linear infinite;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  @keyframes btn-anim1 {\r\n");
      out.write("    0% {\r\n");
      out.write("      left: -100%;\r\n");
      out.write("    }\r\n");
      out.write("    50%,\r\n");
      out.write("    100% {\r\n");
      out.write("      left: 100%;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box a span:nth-child(2) {\r\n");
      out.write("    top: -100%;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    width: 2px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background: linear-gradient(180deg, transparent, #03e9f4);\r\n");
      out.write("    animation: btn-anim2 1s linear infinite;\r\n");
      out.write("    animation-delay: 0.25s;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  @keyframes btn-anim2 {\r\n");
      out.write("    0% {\r\n");
      out.write("      top: -100%;\r\n");
      out.write("    }\r\n");
      out.write("    50%,\r\n");
      out.write("    100% {\r\n");
      out.write("      top: 100%;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box a span:nth-child(3) {\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    right: -100%;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 2px;\r\n");
      out.write("    background: linear-gradient(270deg, transparent, #03e9f4);\r\n");
      out.write("    animation: btn-anim3 1s linear infinite;\r\n");
      out.write("    animation-delay: 0.5s;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  @keyframes btn-anim3 {\r\n");
      out.write("    0% {\r\n");
      out.write("      right: -100%;\r\n");
      out.write("    }\r\n");
      out.write("    50%,\r\n");
      out.write("    100% {\r\n");
      out.write("      right: 100%;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box a span:nth-child(4) {\r\n");
      out.write("    bottom: -100%;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 2px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background: linear-gradient(360deg, transparent, #03e9f4);\r\n");
      out.write("    animation: btn-anim4 1s linear infinite;\r\n");
      out.write("    animation-delay: 0.75s;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  @keyframes btn-anim4 {\r\n");
      out.write("    0% {\r\n");
      out.write("      bottom: -100%;\r\n");
      out.write("    }\r\n");
      out.write("    50%,\r\n");
      out.write("    100% {\r\n");
      out.write("      bottom: 100%;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  .option{\r\n");
      out.write(" color: rgb(219 20 20 / 60%);\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("   	</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<section class=\"col-sm-6 col-md-3\">\r\n");
      out.write("            <img style=\"position: absolute;\r\n");
      out.write("   left: -1pc;\r\n");
      out.write("    top: 4pc;\r\n");
      out.write("    height: 35pc;\r\n");
      out.write("    width: 86pc;\"   \r\n");
      out.write("    src=\"http://www.myfreetextures.com/wp-content/uploads/2014/10/sky2.jpg\" >\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"login-box\">\r\n");
      out.write("        <h2>Flight Selection </h2>\r\n");
      out.write("        <form id=\"Login\" action=\"detailsServlet\" method=\"post\">\r\n");
      out.write("        <div class=\"user-box\">\r\n");
      out.write("           <select name=\"flight\">\r\n");
      out.write("<option class=\"option\" value=\"\">Select a Flight</option>\r\n");
      out.write("     ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	</select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"Date\">\r\n");
      out.write("          <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Persons}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"Persons\">\r\n");
      out.write("          <button type=\"submit\" >Submit</button>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /Flight_Selection.jsp(204,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("flight");
      // /Flight_Selection.jsp(204,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/Flight_Selection.jsp(204,5) '${flights__}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${flights__}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("	<option class=\"option\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flight.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flight.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('-');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flight.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("		");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
