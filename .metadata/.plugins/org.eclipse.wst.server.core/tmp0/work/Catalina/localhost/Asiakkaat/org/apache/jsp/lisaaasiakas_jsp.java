/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-09 12:15:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lisaaasiakas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<script src=\"scripts/main.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<title>Lisää asiakas</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form id=\"tiedot\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th colspan=\"4\"></th>\n");
      out.write("\t\t\t\t<th class=\"oikealle\"><span id=\"takaisin\">Listaukseen</span></th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>Etunimi</th>\n");
      out.write("\t\t\t\t<th>Sukunimi</th>\n");
      out.write("\t\t\t\t<th>Puhelinnumero</th>\n");
      out.write("\t\t\t\t<th>Sähköposti</th>\n");
      out.write("\t\t\t\t<th></th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"etunimi\" id=\"etunimi\"></td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"sukunimi\" id=\"sukunimi\"></td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"puhelin\" id=\"puhelin\"></td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"sposti\" id=\"sposti\"></td>\n");
      out.write("\t\t\t\t<td><input type=\"submit\" id=\"tallenna\" value=\"Lisää\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("<span id=\"ilmo\"></span>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(\"#takaisin\").click(function(){\n");
      out.write("\t\tdocument.location=\"listaaasiakkaat.jsp\";\n");
      out.write("\t});\n");
      out.write("\t//Lomakkeen tietojen tarkistus\n");
      out.write("\t$(\"#tiedot\").validate({\n");
      out.write("\t\trules: {\n");
      out.write("\t\t\tetunimi: {\n");
      out.write("\t\t\t\trequired: true,\n");
      out.write("\t\t\t\tminlength: 2\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsukunimi: {\n");
      out.write("\t\t\t\trequired: true,\n");
      out.write("\t\t\t\tminlength: 2\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tpuhelin: {\n");
      out.write("\t\t\t\trequired: true,\n");
      out.write("\t\t\t\tminlength: 3\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsposti: {\n");
      out.write("\t\t\t\trequired: true,\n");
      out.write("\t\t\t\temail: true\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tmessages: {\n");
      out.write("\t\t\tetunimi: {\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\n");
      out.write("\t\t\t\tminlength: \"Liian lyhyt\"\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsukunimi: {\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\n");
      out.write("\t\t\t\tminlength: \"Liian lyhyt\"\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tpuhelin: {\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\n");
      out.write("\t\t\t\tminlength: \"Liian lyhyt\"\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsposti: {\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\n");
      out.write("\t\t\t\temail: \"Ei sähköpostiosoite\"\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\tsubmitHandler: function(form) {\n");
      out.write("\t\t\tlisaaAsiakas();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t//Kursori valmiiksi etunimi-kenttään odottamaan\n");
      out.write("\t$(\"#etunimi\").focus();\n");
      out.write("\t\n");
      out.write("});\n");
      out.write(" \n");
      out.write("function lisaaAsiakas(){\n");
      out.write("\tvar formJsonStr = formDataJsonStr($(\"#tiedot\").serializeArray()); //muutetaan tiedot JSON-stringiksi\n");
      out.write("\tconsole.log(formJsonStr);\n");
      out.write("\t$.ajax({url:\"asiakkaat\", data:formJsonStr, type:\"POST\", dataType:\"json\", success:function(result){\n");
      out.write("\t\tif(result.response==0){\n");
      out.write("\t\t\t$(\"#ilmo\").html(\"Asiakkaan lisääminen epäonnistui.\");\n");
      out.write("\t\t} else if(result.response==1){\n");
      out.write("\t\t\t$(\"#ilmo\").html(\"Asiakkaan lisääminen onnistui.\");\n");
      out.write("\t\t\t$(\"#etunimi, #sukunimi, #puhelin, #sposti\").val(\"\");\n");
      out.write("\t\t}\n");
      out.write("\t}});\n");
      out.write("};\n");
      out.write("</script>\n");
      out.write("</html>");
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
