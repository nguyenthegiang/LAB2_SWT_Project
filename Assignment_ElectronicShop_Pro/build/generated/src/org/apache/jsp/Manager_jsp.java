package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Manager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!--Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"image/faviconLogo.png\" />\n");
      out.write("        <title>Computer ERA</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\"\n");
      out.write("              integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                color: #566787;\n");
      out.write("                background: #f5f5f5;\n");
      out.write("                font-family: 'Varela Round', sans-serif;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .table-responsive {\n");
      out.write("                margin: 30px 0;\n");
      out.write("            }\n");
      out.write("            .table-wrapper {\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 20px 25px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                min-width: 1000px;\n");
      out.write("                box-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .table-title {        \n");
      out.write("                padding-bottom: 15px;\n");
      out.write("                background: #435d7d;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 16px 30px;\n");
      out.write("                min-width: 100%;\n");
      out.write("                margin: -20px -25px 10px;\n");
      out.write("                border-radius: 3px 3px 0 0;\n");
      out.write("            }\n");
      out.write("            .table-title h2 {\n");
      out.write("                margin: 5px 0 0;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn-group {\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .table-title .btn {\n");
      out.write("                color: #fff;\n");
      out.write("                float: right;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border: none;\n");
      out.write("                min-width: 50px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                border: none;\n");
      out.write("                outline: none !important;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn i {\n");
      out.write("                float: left;\n");
      out.write("                font-size: 21px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn span {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 2px;\n");
      out.write("            }\n");
      out.write("            table.table tr th, table.table tr td {\n");
      out.write("                border-color: #e9e9e9;\n");
      out.write("                padding: 12px 15px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("            }\n");
      out.write("            table.table tr th:first-child {\n");
      out.write("                width: 60px;\n");
      out.write("            }\n");
      out.write("            table.table tr th:last-child {\n");
      out.write("                width: 100px;\n");
      out.write("            }\n");
      out.write("            table.table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("                background-color: #fcfcfc;\n");
      out.write("            }\n");
      out.write("            table.table-striped.table-hover tbody tr:hover {\n");
      out.write("                background: #f5f5f5;\n");
      out.write("            }\n");
      out.write("            table.table th i {\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\t\n");
      out.write("            table.table td:last-child i {\n");
      out.write("                opacity: 0.9;\n");
      out.write("                font-size: 22px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("            }\n");
      out.write("            table.table td a {\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #566787;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-decoration: none;\n");
      out.write("                outline: none !important;\n");
      out.write("            }\n");
      out.write("            table.table td a:hover {\n");
      out.write("                color: #2196F3;\n");
      out.write("            }\n");
      out.write("            table.table td a.edit {\n");
      out.write("                color: #FFC107;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #F44336;\n");
      out.write("            }\n");
      out.write("            table.table td i {\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            table.table .avatar {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .pagination {\n");
      out.write("                float: right;\n");
      out.write("                margin: 0 0 5px;\n");
      out.write("            }\n");
      out.write("            .pagination li a {\n");
      out.write("                border: none;\n");
      out.write("                font-size: 13px;\n");
      out.write("                min-width: 30px;\n");
      out.write("                min-height: 30px;\n");
      out.write("                color: #999;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                line-height: 30px;\n");
      out.write("                border-radius: 2px !important;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 0 6px;\n");
      out.write("            }\n");
      out.write("            .pagination li a:hover {\n");
      out.write("                color: #666;\n");
      out.write("            }\t\n");
      out.write("            .pagination li.active a, .pagination li.active a.page-link {\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .pagination li.active a:hover {        \n");
      out.write("                background: #0397d6;\n");
      out.write("            }\n");
      out.write("            .pagination li.disabled i {\n");
      out.write("                color: #ccc;\n");
      out.write("            }\n");
      out.write("            .pagination li i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding-top: 6px\n");
      out.write("            }\n");
      out.write("            .hint-text {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }    \n");
      out.write("            /* Custom checkbox */\n");
      out.write("            .custom-checkbox {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"] {    \n");
      out.write("                opacity: 0;\n");
      out.write("                position: absolute;\n");
      out.write("                margin: 5px 0 0 3px;\n");
      out.write("                z-index: 9;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox label:before{\n");
      out.write("                width: 18px;\n");
      out.write("                height: 18px;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox label:before {\n");
      out.write("                content: '';\n");
      out.write("                margin-right: 10px;\n");
      out.write("                display: inline-block;\n");
      out.write("                vertical-align: text-top;\n");
      out.write("                background: white;\n");
      out.write("                border: 1px solid #bbb;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("                content: '';\n");
      out.write("                position: absolute;\n");
      out.write("                left: 6px;\n");
      out.write("                top: 3px;\n");
      out.write("                width: 6px;\n");
      out.write("                height: 11px;\n");
      out.write("                border: solid #000;\n");
      out.write("                border-width: 0 3px 3px 0;\n");
      out.write("                transform: inherit;\n");
      out.write("                z-index: 3;\n");
      out.write("                transform: rotateZ(45deg);\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:before {\n");
      out.write("                border-color: #03A9F4;\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("                border-color: #fff;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:disabled + label:before {\n");
      out.write("                color: #b8b8b8;\n");
      out.write("                cursor: auto;\n");
      out.write("                box-shadow: none;\n");
      out.write("                background: #ddd;\n");
      out.write("            }\n");
      out.write("            /* Modal styles */\n");
      out.write("            .modal .modal-dialog {\n");
      out.write("                max-width: 400px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-header, .modal .modal-body, .modal .modal-footer {\n");
      out.write("                padding: 20px 30px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-content {\n");
      out.write("                border-radius: 3px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-footer {\n");
      out.write("                background: #ecf0f1;\n");
      out.write("                border-radius: 0 0 3px 3px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-title {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .modal .form-control {\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: none;\n");
      out.write("                border-color: #dddddd;\n");
      out.write("            }\n");
      out.write("            .modal textarea.form-control {\n");
      out.write("                resize: vertical;\n");
      out.write("            }\n");
      out.write("            .modal .btn {\n");
      out.write("                border-radius: 2px;\n");
      out.write("                min-width: 100px;\n");
      out.write("            }\t\n");
      out.write("            .modal form label {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\t\n");
      out.write("\n");
      out.write("            .searchbar {\n");
      out.write("                margin-bottom: auto;\n");
      out.write("                margin-top: auto;\n");
      out.write("                height: 60px;\n");
      out.write("                background-color: #353b48;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .search_input {\n");
      out.write("                color: white;\n");
      out.write("                border: 0;\n");
      out.write("                outline: 0;\n");
      out.write("                background: none;\n");
      out.write("                width: 0;\n");
      out.write("                caret-color: transparent;\n");
      out.write("                line-height: 40px;\n");
      out.write("                transition: width 0.4s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .searchbar:hover>.search_input {\n");
      out.write("                padding: 0 10px;\n");
      out.write("                width: 450px;\n");
      out.write("                caret-color: red;\n");
      out.write("                transition: width 0.4s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .searchbar:hover>.search_icon {\n");
      out.write("                background: white;\n");
      out.write("                color: #e74c3c;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search_icon {\n");
      out.write("                height: 40px;\n");
      out.write("                width: 40px;\n");
      out.write("                float: right;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function ProductID(PID) {\n");
      out.write("                document.getElementById(\"pid\").setAttribute(\"value\", PID);\n");
      out.write("            }\n");
      out.write("            function ProductID2(PID) {\n");
      out.write("                document.getElementById(\"pid2\").setAttribute(\"value\", PID);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light flex-column\" style=\"position: fixed; left: 10px;\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"dashBoard\"><img src=\"image/MenuLogo.png\" width=\"200px\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <ul class=\"nav flex-column\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"home\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">&nbsp;\n");
      out.write("                </li> \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container-xl\"style=\"position: fixed; right: 50px;\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Manager <b>Product</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <a href=\"#addEmployeeModal\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Product</span></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Image</th>\n");
      out.write("                                <th>Price</th>\n");
      out.write("                                <th>Actions</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"clearfix\">\n");
      out.write("                        <div class=\"hint-text\">Showing <b>6</b> out of <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> entries</div>\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("        </div>\n");
      out.write("        <!-- Add Product -->\n");
      out.write("        <div id=\"addEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"add\" method=\"post\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Add Product</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required name=\"name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Description</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required name=\"description\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required name=\"price\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Image Link</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required name=\"imageLink\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Category</label>\n");
      out.write("                                <select name=\"CategoryID\" class=\"form-control\" required>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Seller</label>\n");
      out.write("                                <select name=\"SellerID\" class=\"form-control\" required>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Amount</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required name=\"amount\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Delete Product -->\n");
      out.write("        <div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"delete\" method=\"post\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Delete Product</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <p>Are you sure you want to delete this Product?</p>\n");
      out.write("                            <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"text\" id=\"pid2\" name=\"ProductID\" visibility: hidden>\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <li class=\"nav-item\">\n");
        out.write("                        <a class=\"nav-link\" href=\"login\">Login</a>\n");
        out.write("                    </li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <li class=\"nav-item\">\n");
        out.write("                        <a class=\"nav-link text-info\" href=\"login\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                    </li>\n");
        out.write("                    ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSell == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"manager\">Manager Product</a>\n");
        out.write("                        </li> \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"accountManager\">Manager Account</a>\n");
        out.write("                        </li> \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td><img src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.imageLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 100px\"></td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.priceWithDot}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <!--Link to GET in EditControl-->\n");
          out.write("                                        <a href=\"edit?ProductID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
          out.write("                                        <a href=\"#deleteEmployeeModal\" onclick=\"ProductID2(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${end}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag == i?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"manager?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"page-link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("o");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("o");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
