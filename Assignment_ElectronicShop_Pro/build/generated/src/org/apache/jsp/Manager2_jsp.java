package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Manager2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Computer ERA</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tcolor: #566787;\n");
      out.write("\tbackground: #f5f5f5;\n");
      out.write("\tfont-family: 'Varela Round', sans-serif;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("}\n");
      out.write(".table-responsive {\n");
      out.write("    margin: 30px 0;\n");
      out.write("}\n");
      out.write(".table-wrapper {\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tpadding: 20px 25px;\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("\tmin-width: 1000px;\n");
      out.write("\tbox-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("}\n");
      out.write(".table-title {        \n");
      out.write("\tpadding-bottom: 15px;\n");
      out.write("\tbackground: #435d7d;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tpadding: 16px 30px;\n");
      out.write("\tmin-width: 100%;\n");
      out.write("\tmargin: -20px -25px 10px;\n");
      out.write("\tborder-radius: 3px 3px 0 0;\n");
      out.write("}\n");
      out.write(".table-title h2 {\n");
      out.write("\tmargin: 5px 0 0;\n");
      out.write("\tfont-size: 24px;\n");
      out.write("}\n");
      out.write(".table-title .btn-group {\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write(".table-title .btn {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfloat: right;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("\tborder: none;\n");
      out.write("\tmin-width: 50px;\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none !important;\n");
      out.write("\tmargin-left: 10px;\n");
      out.write("}\n");
      out.write(".table-title .btn i {\n");
      out.write("\tfloat: left;\n");
      out.write("\tfont-size: 21px;\n");
      out.write("\tmargin-right: 5px;\n");
      out.write("}\n");
      out.write(".table-title .btn span {\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-top: 2px;\n");
      out.write("}\n");
      out.write("table.table tr th, table.table tr td {\n");
      out.write("\tborder-color: #e9e9e9;\n");
      out.write("\tpadding: 12px 15px;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("}\n");
      out.write("table.table tr th:first-child {\n");
      out.write("\twidth: 60px;\n");
      out.write("}\n");
      out.write("table.table tr th:last-child {\n");
      out.write("\twidth: 100px;\n");
      out.write("}\n");
      out.write("table.table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("\tbackground-color: #fcfcfc;\n");
      out.write("}\n");
      out.write("table.table-striped.table-hover tbody tr:hover {\n");
      out.write("\tbackground: #f5f5f5;\n");
      out.write("}\n");
      out.write("table.table th i {\n");
      out.write("\tfont-size: 13px;\n");
      out.write("\tmargin: 0 5px;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\t\n");
      out.write("table.table td:last-child i {\n");
      out.write("\topacity: 0.9;\n");
      out.write("\tfont-size: 22px;\n");
      out.write("\tmargin: 0 5px;\n");
      out.write("}\n");
      out.write("table.table td a {\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #566787;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\toutline: none !important;\n");
      out.write("}\n");
      out.write("table.table td a:hover {\n");
      out.write("\tcolor: #2196F3;\n");
      out.write("}\n");
      out.write("table.table td a.edit {\n");
      out.write("\tcolor: #FFC107;\n");
      out.write("}\n");
      out.write("table.table td a.delete {\n");
      out.write("\tcolor: #F44336;\n");
      out.write("}\n");
      out.write("table.table td i {\n");
      out.write("\tfont-size: 19px;\n");
      out.write("}\n");
      out.write("table.table .avatar {\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\tmargin-right: 10px;\n");
      out.write("}\n");
      out.write(".pagination {\n");
      out.write("\tfloat: right;\n");
      out.write("\tmargin: 0 0 5px;\n");
      out.write("}\n");
      out.write(".pagination li a {\n");
      out.write("\tborder: none;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("\tmin-width: 30px;\n");
      out.write("\tmin-height: 30px;\n");
      out.write("\tcolor: #999;\n");
      out.write("\tmargin: 0 2px;\n");
      out.write("\tline-height: 30px;\n");
      out.write("\tborder-radius: 2px !important;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tpadding: 0 6px;\n");
      out.write("}\n");
      out.write(".pagination li a:hover {\n");
      out.write("\tcolor: #666;\n");
      out.write("}\t\n");
      out.write(".pagination li.active a, .pagination li.active a.page-link {\n");
      out.write("\tbackground: #03A9F4;\n");
      out.write("}\n");
      out.write(".pagination li.active a:hover {        \n");
      out.write("\tbackground: #0397d6;\n");
      out.write("}\n");
      out.write(".pagination li.disabled i {\n");
      out.write("\tcolor: #ccc;\n");
      out.write("}\n");
      out.write(".pagination li i {\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tpadding-top: 6px\n");
      out.write("}\n");
      out.write(".hint-text {\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("}    \n");
      out.write("/* Custom checkbox */\n");
      out.write(".custom-checkbox {\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write(".custom-checkbox input[type=\"checkbox\"] {    \n");
      out.write("\topacity: 0;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tmargin: 5px 0 0 3px;\n");
      out.write("\tz-index: 9;\n");
      out.write("}\n");
      out.write(".custom-checkbox label:before{\n");
      out.write("\twidth: 18px;\n");
      out.write("\theight: 18px;\n");
      out.write("}\n");
      out.write(".custom-checkbox label:before {\n");
      out.write("\tcontent: '';\n");
      out.write("\tmargin-right: 10px;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tvertical-align: text-top;\n");
      out.write("\tbackground: white;\n");
      out.write("\tborder: 1px solid #bbb;\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tz-index: 2;\n");
      out.write("}\n");
      out.write(".custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("\tcontent: '';\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: 6px;\n");
      out.write("\ttop: 3px;\n");
      out.write("\twidth: 6px;\n");
      out.write("\theight: 11px;\n");
      out.write("\tborder: solid #000;\n");
      out.write("\tborder-width: 0 3px 3px 0;\n");
      out.write("\ttransform: inherit;\n");
      out.write("\tz-index: 3;\n");
      out.write("\ttransform: rotateZ(45deg);\n");
      out.write("}\n");
      out.write(".custom-checkbox input[type=\"checkbox\"]:checked + label:before {\n");
      out.write("\tborder-color: #03A9F4;\n");
      out.write("\tbackground: #03A9F4;\n");
      out.write("}\n");
      out.write(".custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("\tborder-color: #fff;\n");
      out.write("}\n");
      out.write(".custom-checkbox input[type=\"checkbox\"]:disabled + label:before {\n");
      out.write("\tcolor: #b8b8b8;\n");
      out.write("\tcursor: auto;\n");
      out.write("\tbox-shadow: none;\n");
      out.write("\tbackground: #ddd;\n");
      out.write("}\n");
      out.write("/* Modal styles */\n");
      out.write(".modal .modal-dialog {\n");
      out.write("\tmax-width: 400px;\n");
      out.write("}\n");
      out.write(".modal .modal-header, .modal .modal-body, .modal .modal-footer {\n");
      out.write("\tpadding: 20px 30px;\n");
      out.write("}\n");
      out.write(".modal .modal-content {\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("}\n");
      out.write(".modal .modal-footer {\n");
      out.write("\tbackground: #ecf0f1;\n");
      out.write("\tborder-radius: 0 0 3px 3px;\n");
      out.write("}\n");
      out.write(".modal .modal-title {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("}\n");
      out.write(".modal .form-control {\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tbox-shadow: none;\n");
      out.write("\tborder-color: #dddddd;\n");
      out.write("}\n");
      out.write(".modal textarea.form-control {\n");
      out.write("\tresize: vertical;\n");
      out.write("}\n");
      out.write(".modal .btn {\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tmin-width: 100px;\n");
      out.write("}\t\n");
      out.write(".modal form label {\n");
      out.write("\tfont-weight: normal;\n");
      out.write("}\t\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t// Activate tooltip\n");
      out.write("\t$('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\t\n");
      out.write("\t// Select/Deselect checkboxes\n");
      out.write("\tvar checkbox = $('table tbody input[type=\"checkbox\"]');\n");
      out.write("\t$(\"#selectAll\").click(function(){\n");
      out.write("\t\tif(this.checked){\n");
      out.write("\t\t\tcheckbox.each(function(){\n");
      out.write("\t\t\t\tthis.checked = true;                        \n");
      out.write("\t\t\t});\n");
      out.write("\t\t} else{\n");
      out.write("\t\t\tcheckbox.each(function(){\n");
      out.write("\t\t\t\tthis.checked = false;                        \n");
      out.write("\t\t\t});\n");
      out.write("\t\t} \n");
      out.write("\t});\n");
      out.write("\tcheckbox.click(function(){\n");
      out.write("\t\tif(!this.checked){\n");
      out.write("\t\t\t$(\"#selectAll\").prop(\"checked\", false);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container-xl\">\n");
      out.write("\t<div class=\"table-responsive\">\n");
      out.write("\t\t<div class=\"table-wrapper\">\n");
      out.write("\t\t\t<div class=\"table-title\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<h2>Manage <b>Employees</b></h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#addEmployeeModal\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Employee</span></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#deleteEmployeeModal\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete</span></a>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<table class=\"table table-striped table-hover\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"selectAll\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"selectAll\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\n");
      out.write("\t\t\t\t\t\t<th>Address</th>\n");
      out.write("\t\t\t\t\t\t<th>Phone</th>\n");
      out.write("\t\t\t\t\t\t<th>Actions</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"checkbox1\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>Thomas Hardy</td>\n");
      out.write("\t\t\t\t\t\t<td>thomashardy@mail.com</td>\n");
      out.write("\t\t\t\t\t\t<td>89 Chiaroscuro Rd, Portland, USA</td>\n");
      out.write("\t\t\t\t\t\t<td>(171) 555-2222</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkbox2\" name=\"options[]\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"checkbox2\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>Dominique Perrier</td>\n");
      out.write("\t\t\t\t\t\t<td>dominiqueperrier@mail.com</td>\n");
      out.write("\t\t\t\t\t\t<td>Obere Str. 57, Berlin, Germany</td>\n");
      out.write("\t\t\t\t\t\t<td>(313) 555-5735</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkbox3\" name=\"options[]\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"checkbox3\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>Maria Anders</td>\n");
      out.write("\t\t\t\t\t\t<td>mariaanders@mail.com</td>\n");
      out.write("\t\t\t\t\t\t<td>25, rue Lauriston, Paris, France</td>\n");
      out.write("\t\t\t\t\t\t<td>(503) 555-9931</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkbox4\" name=\"options[]\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"checkbox4\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>Fran Wilson</td>\n");
      out.write("\t\t\t\t\t\t<td>franwilson@mail.com</td>\n");
      out.write("\t\t\t\t\t\t<td>C/ Araquil, 67, Madrid, Spain</td>\n");
      out.write("\t\t\t\t\t\t<td>(204) 619-5731</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkbox5\" name=\"options[]\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"checkbox5\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>Martin Blank</td>\n");
      out.write("\t\t\t\t\t\t<td>martinblank@mail.com</td>\n");
      out.write("\t\t\t\t\t\t<td>Via Monte Bianco 34, Turin, Italy</td>\n");
      out.write("\t\t\t\t\t\t<td>(480) 631-2097</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr> \n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t<div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("\t\t\t\t<ul class=\"pagination\">\n");
      out.write("\t\t\t\t\t<li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>        \n");
      out.write("</div>\n");
      out.write("<!-- Edit Modal HTML -->\n");
      out.write("<div id=\"addEmployeeModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<form>\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">Add Employee</h4>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Name</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Email</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Address</label>\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" required></textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Phone</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- Edit Modal HTML -->\n");
      out.write("<div id=\"editEmployeeModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<form>\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">Edit Employee</h4>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Name</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Email</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Address</label>\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" required></textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Phone</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- Delete Modal HTML -->\n");
      out.write("<div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<form>\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">Delete Employee</h4>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>Are you sure you want to delete these Records?</p>\n");
      out.write("\t\t\t\t\t<p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
}
