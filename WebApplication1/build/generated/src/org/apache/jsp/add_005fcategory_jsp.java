package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class add_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        Hello, today is ");
      out.print( new java.util.Date());
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Add a category</title>\n");
      out.write("    </head>\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("background-color:brown;\n");
      out.write("}\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("color:orange;\n");
      out.write("text-align:black;\n");
      out.write("}\n");
      out.write("p\n");
      out.write("{\n");
      out.write("font-family:\"Times New Roman\";\n");
      out.write("font-size:20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("        <h1></h1>\n");
      out.write("            \n");
      out.write("       <div style=\"background-color: brown; height: 570px; width: 100px; alignment-adjust: center \">     \n");
      out.write("      \n");
      out.write("           \n");
      out.write("          \n");
      out.write("           <form method=\"POST\" action=\"product_cat12.jsp\">\n");
      out.write("               <div id=\"outbox\" style=\"align:center; padding-top: 50px; padding-left: 500px;\">\n");
      out.write("               <table border=\"1\" align=\"center\" cellpadding=\"7\" cellspacing=\"7\">\n");
      out.write("               \n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"200\" align=\"center\"> <strong> Add category </strong> </td>\n");
      out.write("                    <td width=\"200\"> <input type=\"text\" name=\"cat\" id=\"cat\">\n");
      out.write("                    <input type=\"submit\" value=\"submit\">\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("               </div>\n");
      out.write("           </form>               \n");
      out.write("           \n");
      out.write("       </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div id=\"footer\" style=\"background-color: skyblue; clear: both; text-align: center \">\n");
      out.write("                Copyright e-commerce.com\n");
      out.write("             </div>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
