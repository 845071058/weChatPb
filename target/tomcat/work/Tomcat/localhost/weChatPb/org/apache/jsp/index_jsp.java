/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-17 08:40:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write(" <head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!--   <script type=\"text/javascript\"src=\"../weChatPb/static/js/jquery-3.4.0.min.js\"></script> -->\r\n");
      out.write("<!--   <link rel=\"stylesheet\" href=\"../weChatPb/static/css/weui.min.css\"/> -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.bootcss.com/weui/1.1.3/style/weui.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.bootcss.com/jquery-weui/1.2.1/css/jquery-weui.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- body 最后 -->\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery-weui/1.2.1/js/jquery-weui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 如果使用了某些拓展插件还需要额外的JS -->\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery-weui/1.2.1/js/swiper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery-weui/1.2.1/js/city-picker.min.js\"></script>\r\n");
      out.write("  <title>注册个人信息</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body ontouchstart>\r\n");
      out.write("       <div class=\"weui-cells weui-cells_form\" onsubmit=\"\">\r\n");
      out.write("  <div class=\"weui-cell\">\r\n");
      out.write("    <div class=\"weui-cell__hd\"><label class=\"weui-label\">姓名</label></div>\r\n");
      out.write("    <div class=\"weui-cell__bd\">\r\n");
      out.write("      <input class=\"weui-input\" type=\"text\" id=\"name_id\" height=\"30%\" placeholder=\"请输入姓名\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"weui-cell weui-cell_vcode\">\r\n");
      out.write("    <div class=\"weui-cell__hd\">\r\n");
      out.write("      <label class=\"weui-label\">手机号</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"weui-cell__bd\">\r\n");
      out.write("      <input class=\"weui-input\" type=\"tel\" id=\"phone_id\" name=\"phone\" height=\"50%\" placeholder=\"请输入手机号\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"weui-cell\">\r\n");
      out.write("    <div class=\"weui-cell__hd\"><label for=\"\" class=\"weui-label\">出生日期</label></div>\r\n");
      out.write("    <div class=\"weui-cell__bd\">\r\n");
      out.write("      <input class=\"weui-input\" id=\"date-id\" type=\"date\" value=\"\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<a href=\"javascript:;\" class=\"weui-btn weui-btn_primary\" id=\"submit\">提交</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function () {\r\n");
      out.write("\t\t$(\"#submit\").click(function () {\r\n");
      out.write("\t\t\tvar name = $(\"#name_id\").val();\r\n");
      out.write("\t\t\tvar phone = $(\"#phone_id\").val();\r\n");
      out.write("\t\t\tvar time = $(\"#date-id\").val();\r\n");
      out.write("\t\t\tif (null == name || name == \"\") {\r\n");
      out.write("\t\t\t\t$.alert({\r\n");
      out.write("\t\t\t\t\t  title: '提示',\r\n");
      out.write("\t\t\t\t\t  text: '请输入姓名',\r\n");
      out.write("\t\t\t\t\t  onOK: function () {\r\n");
      out.write("\t\t\t\t\t    //点击确认\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if (null == phone || phone == \"\") {\r\n");
      out.write("\t\t\t\t$.alert({\r\n");
      out.write("\t\t\t\t\t  title: '提示',\r\n");
      out.write("\t\t\t\t\t  text: '请输入电话',\r\n");
      out.write("\t\t\t\t\t  onOK: function () {\r\n");
      out.write("\t\t\t\t\t    //点击确认\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if (null == time || time == \"\") {\r\n");
      out.write("\t\t\t\t$.alert({\r\n");
      out.write("\t\t\t\t\t  title: '提示',\r\n");
      out.write("\t\t\t\t\t  text: '请输入出生日期',\r\n");
      out.write("\t\t\t\t\t  onOK: function () {\r\n");
      out.write("\t\t\t\t\t    //点击确认\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse {\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\tcache: true,\r\n");
      out.write("\t\t\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\t\turl:'weixin/test',\r\n");
      out.write("\t\t\t\t\tasync: false,\r\n");
      out.write("\t\t\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\t\tname:name,\r\n");
      out.write("\t\t\t\t\t\tphone:phone,\r\n");
      out.write("\t\t\t\t\t\ttime:time\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror: function(request) {\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
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
