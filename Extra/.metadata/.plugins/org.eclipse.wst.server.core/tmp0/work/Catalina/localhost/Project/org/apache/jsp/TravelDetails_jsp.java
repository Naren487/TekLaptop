/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-03-26 10:35:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TravelDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Rashika's Airline</title>\r\n");
      out.write("<style>\r\n");
      out.write("        body,h1,h2,h3,h4,h5,h6 {font-family: \"Raleway\", sans-serif}\r\n");
      out.write("        body, html {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            line-height: 1.8;\r\n");
      out.write("        }\r\n");
      out.write("        body {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: sans-serif;\r\n");
      out.write("   background: linear-gradient(#329cb1c9, #111c29);\r\n");
      out.write("}\r\n");
      out.write("        .bgimg-1 {\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-image: url(\"img/plane.png\");\r\n");
      out.write("            min-height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .w3-bar .w3-button {\r\n");
      out.write("            padding: 16px;\r\n");
      out.write("        }\r\n");
      out.write("          .login-box {\r\n");
      out.write("      width: 400px;\r\n");
      out.write("    padding: 40px;\r\n");
      out.write("      transform: translate(-116%, -83%);\r\n");
      out.write("    background: white;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    box-shadow: 0 15px 25px rgb(0 0 0 / 60%);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    left: 70%;\r\n");
      out.write("    top: 331px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box h2 {\r\n");
      out.write("    margin: 0 0 30px;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("      color: #111c29;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box .user-box {\r\n");
      out.write("    position: relative;\r\n");
      out.write("  }\r\n");
      out.write("  .option{\r\n");
      out.write("  color:black;\r\n");
      out.write("  }\r\n");
      out.write("  .login-box .user-box input,.login-box .user-box select{\r\n");
      out.write("   width: 100%;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: black;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    border-bottom: 1px solid #111c29;\r\n");
      out.write("  }\r\n");
      out.write("  .login-box .user-box label {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    pointer-events: none;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-box .user-box input:focus ~ label,\r\n");
      out.write("  .login-box .user-box input:valid ~ label{\r\n");
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
      out.write("  label{\r\n");
      out.write("      color: #111c29;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\r\n");
      out.write("        <a href=\"Login.jsp\" class=\"w3-bar-item w3-button\">Admin Login</a>\r\n");
      out.write("    </div>\r\n");
      out.write("<section class=\"container-fluid bg\">\r\n");
      out.write("    <section class=\"row justify-content-center\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col\">\r\n");
      out.write("                <h2 align=\"center\" style=\"color:black;\"><b>Airline Booking Form</b></h2>\r\n");
      out.write("                <br>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <section class=\"col-sm-6 col-md-3\" \">\r\n");
      out.write("            <img style=\" position: absolute;\r\n");
      out.write("    left: -1pc;\r\n");
      out.write("    top: 6pc;\r\n");
      out.write("    height: 33pc;\r\n");
      out.write("    width: 85pc;\"   src=\"http://www.myfreetextures.com/wp-content/uploads/2014/10/sky2.jpg\" >\r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"col-sm-6 col-md-3\" 	 >\r\n");
      out.write("     --  <div class=\"login-box\">\r\n");
      out.write("        <h2>Travel Details </h2>\r\n");
      out.write("        <form id=\"Login\" action=\"travelDetailsServlet\" method=\"post\">\r\n");
      out.write("          <label for=\"Date\">Date Of Travel</label>\r\n");
      out.write("  <div>\r\n");
      out.write("  <input type=\"date\" id=\"Date\" name=\"Date\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <label for=\"Source\">Source</label>\r\n");
      out.write("<div>\r\n");
      out.write("<select name=\"Source\" id=\"Source\">  \r\n");
      out.write("    <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("     <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("      <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("       <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("        <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("         <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("          <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("     <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("      <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("       <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("        <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("         <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("<label for=\"Destination\">Destination</label>\r\n");
      out.write("<div>\r\n");
      out.write("<select name=\"Destination\" id=\"Destination\">  \r\n");
      out.write("       <option value=\"Bangalore\">Bangalore</option>\r\n");
      out.write("        <option value=\"Bangalore\">Bangalore</option>\r\n");
      out.write("         <option value=\"Bangalore\">Bangalore</option>\r\n");
      out.write("     <option value=\"Mumbai\">Mumbai</option>\r\n");
      out.write("      <option value=\"Mumbai\">Mumbai</option>\r\n");
      out.write("     <option value=\"Mumbai\">Mumbai</option>\r\n");
      out.write("</select>\r\n");
      out.write("</div>\r\n");
      out.write("                    <label for=\"persons\">Number of Persons</label>\r\n");
      out.write("                <div class=\"user-box\">\r\n");
      out.write("                    <select  id=\"persons\" name=\"Persons\">\r\n");
      out.write("                        <option class=\"option\" value=\"1\">1</option>\r\n");
      out.write("                        <option class=\"option\" value=\"2\">2</option>\r\n");
      out.write("                        <option class=\"option\" value=\"3\">3</option>\r\n");
      out.write("                        <option class=\"option\" value=\"4\">4</option>\r\n");
      out.write("                        <option class=\"option\" value=\"5\">5</option>\r\n");
      out.write("                        <option class=\"option\" value=\"6\">6</option>\r\n");
      out.write("                        <option class=\"option\" value=\"7\">7</option>\r\n");
      out.write("                        <option class=\"option\" value=\"8\">8</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-success btn-block\" value=\"Submit\" style=\"    color: #333;\r\n");
      out.write("    background-color: cornflowerblue;\r\n");
      out.write("    border-color: cornflowerblue;\">Search Flights</button>\r\n");
      out.write("        \r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("</section>\r\n");
      out.write("<div class=\"footer\" align=\"center\">\r\n");
      out.write("</div>    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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