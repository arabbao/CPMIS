/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-02-17 06:58:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" <meta http-equiv=\"refresh\" content=\"300\">\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" \r\n");
      out.write("  <title>工单查询</title> \r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write("#container {\r\n");
      out.write("    height: 70%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".highcharts-figure,\r\n");
      out.write(".highcharts-data-table table {\r\n");
      out.write("    min-width: 100%;\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("    margin: 1em auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#datatable {\r\n");
      out.write("    font-family: Verdana, sans-serif;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    border: 1px solid #ebebeb;\r\n");
      out.write("    margin: 10px auto;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    max-width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#datatable caption {\r\n");
      out.write("    padding: 1em 0;\r\n");
      out.write("    font-size: 1.2em;\r\n");
      out.write("    color: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#datatable th {\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    padding: 0.5em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#datatable td,\r\n");
      out.write("#datatable th,\r\n");
      out.write("#datatable caption {\r\n");
      out.write("    padding: 0.5em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#datatable thead tr,\r\n");
      out.write("#datatable tr:nth-child(even) {\r\n");
      out.write("    background: #f8f8f8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#datatable tr:hover {\r\n");
      out.write("    background: #f1f7ff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("		</style>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@10.100.0.20:1521:ledmes1","sajet","tech");
Statement stmt=connection.createStatement();
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
String name = request.getParameter("workorder");//用request得到 



ResultSet rs=stmt.executeQuery("SELECT PDLINE_NAME,PROCESS_NAME ,SUM(PASS_QTY)as good,SUM(FAIL_QTY)as Fail,sum(PASS_QTY+FAIL_QTY)as input,round(SUM(PASS_QTY)/sum(PASS_QTY+FAIL_QTY)*100,2)as Yield from(select * from sajet.G_SN_COUNT a LEFT join sajet.SYS_PROCESS b  on a.process_id = b.process_id LEFT join sajet.SYS_PDLINE b  on a.PDLINE_ID = b.PDLINE_ID WHERE WORK_ORDER='"+name+"' ) GROUP BY PROCESS_NAME,PDLINE_NAME ORDER BY Fail DESC  ");





      out.write("\r\n");
      out.write("<figure class=\"highcharts-figure\">\r\n");
      out.write("    <div id=\"container\"></div>\r\n");
      out.write("<table id=\"datatable\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>Pdline/Process</td>\r\n");
      out.write("       \r\n");
      out.write("        <td>Output</td>\r\n");
      out.write("        <td>Fail</td>\r\n");
      out.write("        <td>Input</td>\r\n");
      out.write("        <td>Yield(%)</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    ");
 while(rs.next()){ 
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>");
      out.print(rs.getString(1));
      out.write('/');
      out.print(rs.getString(2));
      out.write("</td>    \r\n");
      out.write("        <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("         <td>");
      out.print(rs.getString(6));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write(" \r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.onload = function() {\r\n");
      out.write("    // 第3列\r\n");
      out.write("    var column_num = 3;\r\n");
      out.write("                                      \r\n");
      out.write("    // 获取元素\r\n");
      out.write("    var table = document.getElementById(\"datatable\"),\r\n");
      out.write("        rows = table.getElementsByTagName(\"tr\");\r\n");
      out.write("                                      \r\n");
      out.write("    // 循环表格\r\n");
      out.write("    for(var i = 0; i < rows.length; i++) {\r\n");
      out.write("        var cells = rows[i].getElementsByTagName(\"td\");\r\n");
      out.write("        for(var c = 0; c < cells.length; c++) {\r\n");
      out.write("            // 对应列\r\n");
      out.write("            if(c + 1 === column_num\r\n");
      out.write("                // 判断是否大于 0\r\n");
      out.write("                && parseFloat(cells[c].innerHTML) > 0) {\r\n");
      out.write("                // 两者均成立，改变颜色\r\n");
      out.write("                rows[i].style.color = \"#f00\";\r\n");
      out.write("                // 检查下一行\r\n");
      out.write("                break;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("</figure>\r\n");
      out.write("<script src=\"highcharts.js\"></script>\r\n");
      out.write("<script src=\"data.js\"></script>\r\n");
      out.write("<script src=\"exporting.js\"></script>\r\n");
      out.write("<script src=\"accessibility.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("Highcharts.chart('container', {\r\n");
      out.write("    data: {\r\n");
      out.write("        table: 'datatable'\r\n");
      out.write("    },\r\n");
      out.write("    chart: {\r\n");
      out.write("        type: 'bar'\r\n");
      out.write("    },\r\n");
      out.write("   \r\n");
      out.write("    yAxis: {\r\n");
      out.write("        allowDecimals: false,\r\n");
      out.write("        title: {\r\n");
      out.write("            text: 'Units'\r\n");
      out.write("        }\r\n");
      out.write("    },\r\n");
      out.write("    title: {\r\n");
      out.write("		text: 'kanban'\r\n");
      out.write("		// 该功能依赖 data.js 模块，详见https://www.hcharts.cn/docs/data-modules\r\n");
      out.write("	},\r\n");
      out.write("    credits:{\r\n");
      out.write("        enabled: false // 禁用版权信息\r\n");
      out.write("   },\r\n");
      out.write("    tooltip: {\r\n");
      out.write("        formatter: function () {\r\n");
      out.write("            return '<b>' + this.series.name + '</b><br/>' +\r\n");
      out.write("                this.point.y + ' ' + this.point.name.toLowerCase();\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("		</script>\r\n");
      out.write("</body>\r\n");
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