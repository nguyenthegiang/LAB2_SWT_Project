package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Finish_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Success</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Varela Round', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm {\n");
      out.write("                color: #434e65;\n");
      out.write("                width: 525px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .modal-content {\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .modal-header {\n");
      out.write("                background: #47c9a2;\n");
      out.write("                border-bottom: none;\n");
      out.write("                position: relative;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: -20px -20px 0;\n");
      out.write("                border-radius: 5px 5px 0 0;\n");
      out.write("                padding: 35px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm h4 {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 36px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .form-control,\n");
      out.write("            .modal-confirm .btn {\n");
      out.write("                min-height: 40px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .close {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 15px;\n");
      out.write("                right: 15px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: none;\n");
      out.write("                opacity: 0.5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .close:hover {\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .icon-box {\n");
      out.write("                color: #fff;\n");
      out.write("                width: 95px;\n");
      out.write("                height: 95px;\n");
      out.write("                display: inline-block;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                z-index: 9;\n");
      out.write("                border: 5px solid #fff;\n");
      out.write("                padding: 15px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .icon-box i {\n");
      out.write("                font-size: 64px;\n");
      out.write("                margin: -4px 0 0 -4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm.modal-dialog {\n");
      out.write("                margin-top: 80px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .btn,\n");
      out.write("            .modal-confirm .btn:active {\n");
      out.write("                color: #fff;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background: #eeb711 !important;\n");
      out.write("                text-decoration: none;\n");
      out.write("                transition: all 0.4s;\n");
      out.write("                line-height: normal;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                padding: 6px 20px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .btn:hover,\n");
      out.write("            .modal-confirm .btn:focus {\n");
      out.write("                background: #eda645 !important;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .btn span {\n");
      out.write("                margin: 1px 3px 0;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-confirm .btn i {\n");
      out.write("                margin-left: 1px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .trigger-btn {\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 100px auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"modal-dialog modal-confirm\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header justify-content-center\">\n");
      out.write("                    <div class=\"icon-box\">\n");
      out.write("                        <i class=\"material-icons\">&#xE876;</i>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body text-center\" style=\"background-color: blanchedalmond;\">\n");
      out.write("                    <h4>Success!</h4>\n");
      out.write("                    <p>You have finished your purchase successfully</p>\n");
      out.write("                    <p>Check your email for details.</p>\n");
      out.write("                    <button onclick=\"window.location.href=google.com\" class=\"btn btn-success\" data-dismiss=\"modal\"><span>Continue Purchase</span> <i\n");
      out.write("                            class=\"material-icons\">&#xE5C8;</i></button>\n");
      out.write("                    <button onclick=\"window.location.href=home\">click me</button>\n");
      out.write("                            \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
