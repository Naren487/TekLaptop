/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-03-26 10:31:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("  	<title>Rashika's Airline</title>\r\n");
      out.write("		<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"https://mazipan.github.io/login-page-css/favicon/apple-touch-icon.png\">\r\n");
      out.write("		<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"https://mazipan.github.io/login-page-css/favicon/favicon-32x32.png\">\r\n");
      out.write("		<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"https://mazipan.github.io/login-page-css/favicon/favicon-16x16.png\">\r\n");
      out.write("		<link rel=\"manifest\" href=\"https://mazipan.github.io/login-page-css/manifest.json\" />\r\n");
      out.write("		<meta name=\"msapplication-TileColor\" content=\"#fdcb04\" />\r\n");
      out.write("		<meta name=\"theme-color\" content=\"#fdcb04\" />\r\n");
      out.write("		<link rel=\"manifest\" href=\"https://mazipan.github.io/login-page-css/manifest.json\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../shared/normalize.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../shared/additional.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\r\n");
      out.write("  </head>\r\n");
      out.write("  <style>\r\n");
      out.write("  @import url(\"https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600;700&display=swap\");\r\n");
      out.write(".flex {\r\n");
      out.write("  display: -webkit-box;\r\n");
      out.write("  display: -ms-flexbox;\r\n");
      out.write("  display: flex;\r\n");
      out.write("}\r\n");
      out.write(".flex-col {\r\n");
      out.write("  -webkit-box-orient: vertical;\r\n");
      out.write("  -webkit-box-direction: normal;\r\n");
      out.write("  -ms-flex-direction: column;\r\n");
      out.write("  flex-direction: column;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".justify-center {\r\n");
      out.write("  -webkit-box-pack: center;\r\n");
      out.write("  -ms-flex-pack: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".justify-between {\r\n");
      out.write("  -webkit-box-pack: justify;\r\n");
      out.write("  -ms-flex-pack: justify;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".justify-around {\r\n");
      out.write("  -ms-flex-pack: distribute;\r\n");
      out.write("  justify-content: space-around;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".justify-evenly {\r\n");
      out.write("  -webkit-box-pack: space-evenly;\r\n");
      out.write("  -ms-flex-pack: space-evenly;\r\n");
      out.write("  justify-content: space-evenly;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".items-center {\r\n");
      out.write("  -webkit-box-align: center;\r\n");
      out.write("  -ms-flex-align: center;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".items-start {\r\n");
      out.write("  -webkit-box-align: start;\r\n");
      out.write("  -ms-flex-align: start;\r\n");
      out.write("  align-items: flex-start;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mx-auto {\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".w-auto {\r\n");
      out.write("  width: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".w-full {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".w-half {\r\n");
      out.write("  width: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".relative {\r\n");
      out.write("  position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".absolute {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  -webkit-box-sizing: border-box;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  font-family: \"Montserrat\", sans-serif;\r\n");
      out.write("  color: #3e4348;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  letter-spacing: -0.01em;\r\n");
      out.write("  font-size: 1.063rem;\r\n");
      out.write("  background: -webkit-gradient(linear, left top, left bottom, color-stop(0, #fff9ec), color-stop(90%, #fff));\r\n");
      out.write("  background: linear-gradient(to bottom, #fff9ec 0, #fff 90%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("  color: #3e4348;\r\n");
      out.write("  font-size: 0.9411764706rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("  color: #0521ca;\r\n");
      out.write("  text-decoration: underline;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("  font-size: 2rem;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  margin: 1rem 0;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-screen {\r\n");
      out.write("  height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 500px) {\r\n");
      out.write("  .login-screen {\r\n");
      out.write("    height: auto;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-mangools {\r\n");
      out.write("  max-width: 1024px;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("  padding: 4rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 500px) {\r\n");
      out.write("  .login-mangools {\r\n");
      out.write("    padding: 1rem;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-mangools__card {\r\n");
      out.write("  -webkit-box-shadow: 0 10px 30px 0 rgba(0, 0, 0, 0.1);\r\n");
      out.write("  box-shadow: 0 10px 30px 0 rgba(0, 0, 0, 0.1);\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  background: white;\r\n");
      out.write("  -webkit-animation: fadein ease-in 0.6s;\r\n");
      out.write("  animation: fadeIn ease-in 0.6s;\r\n");
      out.write("  padding: 1.8rem 2rem;\r\n");
      out.write("  max-width: 456px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin: 2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-mangools__footer {\r\n");
      out.write("  margin-top: 1rem;\r\n");
      out.write("  margin-bottom: 2rem;\r\n");
      out.write("  -ms-flex-wrap: nowrap;\r\n");
      out.write("  flex-wrap: nowrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px) {\r\n");
      out.write("  .login-mangools__footer {\r\n");
      out.write("    -ms-flex-wrap: wrap;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    -webkit-box-pack: center;\r\n");
      out.write("    -ms-flex-pack: center;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .login-mangools__footer > a {\r\n");
      out.write("    margin-bottom: 1rem;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-mangools__notes {\r\n");
      out.write("  margin-top: 4rem;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write("  max-width: 20rem;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-mangools__notes > a {\r\n");
      out.write("  font-size: 0.75rem;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px) {\r\n");
      out.write("  .login-mangools__notes {\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__label {\r\n");
      out.write("  font-size: 0.875rem;\r\n");
      out.write("  color: #7c7d80;\r\n");
      out.write("  margin: 0.5rem 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__icon {\r\n");
      out.write("  padding: 0.75rem 1rem 1rem 1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__icon > svg {\r\n");
      out.write("  height: 1.25rem;\r\n");
      out.write("  width: 1.25rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__list {\r\n");
      out.write("  margin-bottom: 1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__input {\r\n");
      out.write("  padding-top: 0.5rem;\r\n");
      out.write("  padding-bottom: 0.5rem;\r\n");
      out.write("  padding-left: 3rem;\r\n");
      out.write("  padding-right: 1rem;\r\n");
      out.write("  font-size: 1.125rem;\r\n");
      out.write("  line-height: 28px;\r\n");
      out.write("  font-weight: 500;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border: 1px solid #acacad;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px) {\r\n");
      out.write("  .card__input {\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__input:hover {\r\n");
      out.write("  -webkit-box-shadow: rgba(0, 0, 0, 0.18) 0 2px 4px;\r\n");
      out.write("  box-shadow: rgba(0, 0, 0, 0.18) 0 2px 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__input:focus {\r\n");
      out.write("  border: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__sign-in {\r\n");
      out.write("  padding: 0.8rem 3rem;\r\n");
      out.write("  color: white;\r\n");
      out.write("  max-width: 320px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin: 1rem auto 1rem auto;\r\n");
      out.write("  background: -webkit-gradient(linear, left top, right top, color-stop(0, #1ba005), to(#0ec851));\r\n");
      out.write("  background: linear-gradient(to right, #1ba005 0, #0ec851 100%);\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 24px;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  font-size: 1.125rem;\r\n");
      out.write("  -webkit-box-shadow: 0 2px 4px 0 rgba(27, 160, 5, 0.2);\r\n");
      out.write("  box-shadow: 0 2px 4px 0 rgba(27, 160, 5, 0.2);\r\n");
      out.write("  -webkit-transition: 0.3s;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__sign-in:hover {\r\n");
      out.write("  -webkit-box-shadow: 0 5px 20px 0 rgba(27, 160, 5, 0.5);\r\n");
      out.write("  box-shadow: 0 5px 20px 0 rgba(27, 160, 5, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card__url {\r\n");
      out.write("  font-size: 0.875rem;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  margin-top: 1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px) {\r\n");
      out.write("  .card__url {\r\n");
      out.write("    font-size: 0.75rem;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes fadeIn {\r\n");
      out.write("  0% {\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  100% {\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fadeIn {\r\n");
      out.write("  0% {\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  100% {\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer__box {\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  background: white;\r\n");
      out.write("  -webkit-box-shadow: 0 2px 10px 0 rgba(0, 0, 0, 0.15);\r\n");
      out.write("  box-shadow: 0 2px 10px 0 rgba(0, 0, 0, 0.15);\r\n");
      out.write("  height: 36px;\r\n");
      out.write("  width: 36px;\r\n");
      out.write("  margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer__logo {\r\n");
      out.write("  height: 1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer__text {\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  font-size: 1.125rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer__link {\r\n");
      out.write("  margin: 0 0.5rem;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px) {\r\n");
      out.write("  .footer__link {\r\n");
      out.write("    margin: 0.5rem 1rem;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".shape-bottom {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  margin-left: 2%;\r\n");
      out.write("  margin-bottom: 5%;\r\n");
      out.write("  z-index: -1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".shape-bottom__small {\r\n");
      out.write("  height: 8rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".shape-top {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  margin-top: 8%;\r\n");
      out.write("  margin-right: 4%;\r\n");
      out.write("  z-index: -1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px) {\r\n");
      out.write("  .shape-top {\r\n");
      out.write("    margin-top: 12%;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 500px) {\r\n");
      out.write("  .shape-top {\r\n");
      out.write("    margin-right: 0;\r\n");
      out.write("    margin-top: 30%;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".shape-top__big {\r\n");
      out.write("  height: 14rem;\r\n");
      out.write("}\r\n");
      out.write("  </style> \r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"login-screen flex\">\r\n");
      out.write("      <div class=\"login-mangools\">\r\n");
      out.write("        <div class=\"login-mangools__bg--small relative flex flex-col items-center\">\r\n");
      out.write("          <!-- Shape -->\r\n");
      out.write("          <div class=\"flex shape-top\">\r\n");
      out.write("            <img  style=\"position: absolute;\r\n");
      out.write("    left: -62pc;\r\n");
      out.write("    top: -6pc;\r\n");
      out.write("    height: 42pc;\r\n");
      out.write("    width:  92pc;\r\n");
      out.write("    right: 5pc;\"        \r\n");
      out.write("            src=\"https://thumbs.dreamstime.com/b/aeroplane-sky-2943676.jpg\">\r\n");
      out.write("              <defs>\r\n");
      out.write("                <linearGradient id=\"gradient\" x1=\"0%\" y1=\"0%\" x2=\"0%\" y2=\"100%\">\r\n");
      out.write("                  <stop offset=\"0%\" style=\"stop-color: rgb(255, 95, 109)\"></stop>\r\n");
      out.write("                  <stop offset=\"100%\" style=\"stop-color: rgb(255, 195, 113)\"></stop>\r\n");
      out.write("                </linearGradient>\r\n");
      out.write("              </defs>\r\n");
      out.write("              <path\r\n");
      out.write("                id=\"blob\"\r\n");
      out.write("                d=\"M429.5,291.5Q364,333,341.5,398.5Q319,464,249,466.5Q179,469,116.5,431Q54,393,71,321.5Q88,250,98.5,199Q109,148,142.5,84.5Q176,21,246,34Q316,47,352.5,98Q389,149,442,199.5Q495,250,429.5,291.5Z\"\r\n");
      out.write("                fill=\"url(#gradient)\"\r\n");
      out.write("              ></path>\r\n");
      out.write("            </svg>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- End Shape -->\r\n");
      out.write("          <div class=\"login-mangools__logo\">\r\n");
      out.write("            <img src=\"img/logo.png\" class=\"\" style=\"height: 2.25rem\" alt=\"\" />\r\n");
      out.write("          </div>\r\n");
      out.write("          <h2>Admin Login</h2>\r\n");
      out.write("          <div class=\"login-mangools__card\">\r\n");
      out.write("            <form action=\"LoginServlet\" method=\"post\" class=\"flex flex-col\">\r\n");
      out.write("              <div for=\"\" class=\"flex flex-col card__list\">\r\n");
      out.write("                <span class=\"card__label\">Your email</span>\r\n");
      out.write("                <label for=\"\" class=\"relative\">\r\n");
      out.write("                  <span class=\"absolute card__icon\">\r\n");
      out.write("                    <svg\r\n");
      out.write("                      xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("                      xmlns:xlink=\"http://www.w3.org/1999/xlink\"\r\n");
      out.write("                      aria-hidden=\"true\"\r\n");
      out.write("                      focusable=\"false\"\r\n");
      out.write("                      width=\"1em\"\r\n");
      out.write("                      height=\"1em\"\r\n");
      out.write("                      style=\"\r\n");
      out.write("                        -ms-transform: rotate(360deg);\r\n");
      out.write("                        -webkit-transform: rotate(360deg);\r\n");
      out.write("                        transform: rotate(360deg);\r\n");
      out.write("                      \"\r\n");
      out.write("                      preserveAspectRatio=\"xMidYMid meet\"\r\n");
      out.write("                      viewBox=\"0 0 36 36\"\r\n");
      out.write("                    >\r\n");
      out.write("                      <path\r\n");
      out.write("                        d=\"M30.61 24.52a17.16 17.16 0 0 0-25.22 0a1.51 1.51 0 0 0-.39 1v6A1.5 1.5 0 0 0 6.5 33h23a1.5 1.5 0 0 0 1.5-1.5v-6a1.51 1.51 0 0 0-.39-.98z\"\r\n");
      out.write("                        class=\"clr-i-solid clr-i-solid-path-1\"\r\n");
      out.write("                        fill=\"#626262\"\r\n");
      out.write("                      />\r\n");
      out.write("                      <circle cx=\"18\" cy=\"10\" r=\"7\" class=\"clr-i-solid clr-i-solid-path-2\" fill=\"#626262\" />\r\n");
      out.write("                      <rect x=\"0\" y=\"0\" width=\"36\" height=\"36\" fill=\"rgba(0, 0, 0, 0)\" />\r\n");
      out.write("                    </svg>\r\n");
      out.write("                  </span>\r\n");
      out.write("                  <input class=\"card__input\" type=\"text\" placeholder=\"eg. abc@gmail.com\" />\r\n");
      out.write("                </label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div for=\"\" class=\"flex flex-col card__list\">\r\n");
      out.write("                <span class=\"card__label\">Password</span>\r\n");
      out.write("                <label for=\"\" class=\"relative\">\r\n");
      out.write("                  <span class=\"absolute card__icon\">\r\n");
      out.write("                    <svg\r\n");
      out.write("                      xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("                      xmlns:xlink=\"http://www.w3.org/1999/xlink\"\r\n");
      out.write("                      aria-hidden=\"true\"\r\n");
      out.write("                      focusable=\"false\"\r\n");
      out.write("                      width=\"1em\"\r\n");
      out.write("                      height=\"1em\"\r\n");
      out.write("                      style=\"\r\n");
      out.write("                        -ms-transform: rotate(360deg);\r\n");
      out.write("                        -webkit-transform: rotate(360deg);\r\n");
      out.write("                        transform: rotate(360deg);\r\n");
      out.write("                      \"\r\n");
      out.write("                      preserveAspectRatio=\"xMidYMid meet\"\r\n");
      out.write("                      viewBox=\"0 0 24 24\"\r\n");
      out.write("                    >\r\n");
      out.write("                      <path\r\n");
      out.write("                        d=\"M20 12c0-1.103-.897-2-2-2h-1V7c0-2.757-2.243-5-5-5S7 4.243 7 7v3H6c-1.103 0-2 .897-2 2v8c0 1.103.897 2 2 2h12c1.103 0 2-.897 2-2v-8zM9 7c0-1.654 1.346-3 3-3s3 1.346 3 3v3H9V7z\"\r\n");
      out.write("                        fill=\"#626262\"\r\n");
      out.write("                      />\r\n");
      out.write("                    </svg>\r\n");
      out.write("                  </span>\r\n");
      out.write("                  <input class=\"card__input\" type=\"password\" placeholder=\"eg.password\" />\r\n");
      out.write("                </label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <button class=\"card__sign-in\" type=\"submit\">Sign In</button>\r\n");
      out.write("      \r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- Shape -->\r\n");
      out.write("         \r\n");
      out.write("              \r\n");
      out.write("    <!-- ADDITIONAL CODE -- start YOU MIGHT NOT NEEDED -->\r\n");
      out.write("    <footer>\r\n");
      out.write("      <a href=\"TravelDetails.jsp\"> Back to Home </a>\r\n");
      out.write("      <span class=\"author\">\r\n");
      out.write("        Crafted by Rashika</span>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ADDITIONAL CODE -- end YOU MIGHT NOT NEEDED -->\r\n");
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
