package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class employees_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setHeader("X-Powered-By", "JSP/2.2");
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
      out.write("\n");
      out.write("\n");
      out.write("    <!-- patients23:17-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <title>SPAN Hospitals and Research Center</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/dataTables.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                    <script src=\"assets/js/html5shiv.min.js\"></script>\n");
      out.write("                    <script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("            <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-wrapper\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header-left\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"logo\">\n");
      out.write("                        <img src=\"Hospital_LOGO.png\" width=\"35\" height=\"35\" alt=\"\"> <span>SPAN Hospitals</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <a id=\"toggle_btn\" href=\"javascript:void(0);\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <a id=\"mobile_btn\" class=\"mobile_btn float-left\" href=\"#sidebar\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <ul class=\"nav user-menu float-right\">\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown has-arrow\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle nav-link user-link\" data-toggle=\"dropdown\">\n");
      out.write("                            <span class=\"user-img\"><img class=\"rounded-circle\" src=\"assets/img/user.jpg\" width=\"40\" alt=\"Admin\">\n");
      out.write("                                <span class=\"status online\"></span></span>\n");
      out.write("                            <span>Admin</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"logout.jsp\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <div class=\"dropdown mobile-user-menu float-right\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" href=\"logout.jsp\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-inner slimscroll\">\n");
      out.write("                    <div id=\"sidebar-menu\" class=\"sidebar-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"menu-title\">Main</li>\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"adminhome.jsp\"><i class=\"fa fa-dashboard\"></i> <span>Dashboard</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"doctors.jsp\"><i class=\"fa fa-user-md\"></i> <span>Doctors</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"patients.jsp\"><i class=\"fa fa-wheelchair\"></i> <span>Patients</span></a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"submenu\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-user\"></i> <span> Employees </span> <span class=\"menu-arrow\"></span></a>\n");
      out.write("                                <ul style=\"display: none;\">\n");
      out.write("                                    <li><a href=\"employees.jsp\">Employees List</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4 col-3\">\n");
      out.write("                            <h4 class=\"page-title\">Employees</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-8 col-9 text-right m-b-20\">\n");
      out.write("                            <a href=\"add-employee.html\" class=\"btn btn-primary btn-rounded float-right\"><i class=\"fa fa-plus\"></i> Add Employee</a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    ");


                        Class.forName("com.mysql.jdbc.Driver");
                        String a = "jdbc:mysql://localhost:3306/mfas?characterEncoding=utf8";
                        Connection conn = DriverManager.getConnection(a, "root", "root18");

                        Statement p = null;
                        ResultSet rs = null;
                        String sql = null;
                        String rid = (String) session.getAttribute("user");
                        sql = "SELECT * FROM employee ";

                        p = conn.createStatement();
                        rs = p.executeQuery(sql);


                    
      out.write("        \n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped custom-table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th style=\"min-width:200px;\">Name</th>\n");
      out.write("                                            <th>Employee ID</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>Mobile</th>\n");
      out.write("                                            <th style=\"min-width: 110px;\">Join Date</th>\n");
      out.write("                                            <th>Role</th>\n");
      out.write("                                            <th class=\"text-right\">Action</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("\n");
      out.write("                                        ");

                                            int cnt = 1;
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(rs.getString("f_name"));
      out.write(' ');
      out.print(rs.getString("l_name"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("emp_id"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("phone"));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString("join_date"));
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"custom-badge status-green\">");
      out.print(rs.getString("role"));
      out.write("</span>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"text-right\">\n");
      out.write("                                                <div class=\"dropdown dropdown-action\">\n");
      out.write("                                                    <a href=\"#\" class=\"action-icon dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"edit-employee.jsp?id=");
      out.print(rs.getString("emp_id") );
      out.write("\"><i class=\"fa fa-pencil m-r-5\"></i> Edit</a>\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"delete-employee.jsp?id=");
      out.print(rs.getString("emp_id") );
      out.write("\" data-toggle=\"modal\" data-target=\"#delete_employee\"><i class=\"fa fa-trash-o m-r-5\"></i> Delete</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"notification-box\">\n");
      out.write("                    <div class=\"msg-sidebar notifications msg-noti\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar-overlay\" data-reff=\"\"></div>\n");
      out.write("            <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/jquery.slimscroll.js\"></script>\n");
      out.write("            <script src=\"assets/js/select2.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/moment.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- patients23:19-->\n");
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
