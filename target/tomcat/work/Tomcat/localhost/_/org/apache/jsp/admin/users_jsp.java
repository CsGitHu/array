/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-15 08:01:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"easyUI/themes/default/easyui.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"easyUI/themes/icon.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.8.3.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/users.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"dg\"></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--定义工具栏-->\r\n");
      out.write("<div id=\"ToolBar\">\r\n");
      out.write("    <div style=\"height: 40px;\">\r\n");
      out.write("        <a href=\"javascript:Add()\" class=\"easyui-linkbutton\"\r\n");
      out.write("           iconCls=\"icon-add\" plain=\"true\">添加</a>\r\n");
      out.write("        <a href=\"javascript:ModifyBySelect()\" class=\"easyui-linkbutton\"\r\n");
      out.write("           iconCls=\"icon-edit\" plain=\"true\">修改</a>\r\n");
      out.write("        <a href=\"javascript:DeleteByFruitName()\" class=\"easyui-linkbutton\"\r\n");
      out.write("           iconCls=\"icon-remove\" plain=\"true\">删除</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--搜索条件-->\r\n");
      out.write("    <div>\r\n");
      out.write("        姓名:<input type=\"text\" name=\"username\" id=\"name\"/>\r\n");
      out.write("        存件码:<input type=\"text\" name=\"code\" id=\"code\"/>\r\n");
      out.write("        <a id=\"btn\" href=\"javascript:searchUser();\" class=\"easyui-linkbutton\"\r\n");
      out.write("           data-options=\"iconCls:'icon-search'\">搜索</a>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--添加窗口-->\r\n");
      out.write("<div id=\"AddDialog\" class=\"easyui-dialog\" buttons=\"#AddDialogButtons\"\r\n");
      out.write("     style=\"width: 280px; height: 250px; padding: 10px 20px;\" closed=\"true\">\r\n");
      out.write("    <form id=\"SaveDialogForm\" method=\"post\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>姓名:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"username\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>密码:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"password\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>身份证号:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"card\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>手机号:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"tel\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>地址:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"address\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--给添加对话框添加按钮-->\r\n");
      out.write("<div id=\"AddDialogButtons\">\r\n");
      out.write("    <a href=\"javascript:SaveDialog()\" class=\"easyui-linkbutton\"\r\n");
      out.write("       iconCls=\"icon-ok\">保存</a>\r\n");
      out.write("    <a href=\"javascript:CloseDialog()\"\r\n");
      out.write("       class=\"easyui-linkbutton\" iconCls=\"icon-cancel\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--修改对话框-->\r\n");
      out.write("<div id=\"upDialog\" class=\"easyui-dialog\" buttons=\"#upDialogButtons\"\r\n");
      out.write("     style=\"width: 280px; height: 250px; padding: 10px 20px;\" closed=\"true\">\r\n");
      out.write("    <form id=\"upDialogForm\" method=\"post\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><input type=\"hidden\" name=\"id\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>姓名:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"name\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>密码:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"password\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>身份证号:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"card\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>手机号:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"tel\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>地址:</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"address\"/></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--给修改对话框添加修改按钮-->\r\n");
      out.write("<div id=\"upDialogButtons\">\r\n");
      out.write("    <a href=\"javascript:updateDialog()\" class=\"easyui-linkbutton\"\r\n");
      out.write("       iconCls=\"icon-ok\">修改</a>\r\n");
      out.write("    <a href=\"javascript:CloseupDialog()\"\r\n");
      out.write("       class=\"easyui-linkbutton\" iconCls=\"icon-cancel\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
