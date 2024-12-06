package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_002demployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- edit-employee24:07-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <title>Preclinic - Medical & Hospital - Bootstrap 4 Admin Template</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datetimepicker.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/select2.min.css\">\n");
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
      out.write("                        <img src=\"Hospital_LOGO.png\" width=\"35\" height=\"35\" alt=\"\"> <span>Preclinic</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <a id=\"toggle_btn\" href=\"javascript:void(0);\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <a id=\"mobile_btn\" class=\"mobile_btn float-left\" href=\"#sidebar\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <ul class=\"nav user-menu float-right\">\n");
      out.write("                  \n");
      out.write("                    <li class=\"nav-item dropdown has-arrow\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle nav-link user-link\" data-toggle=\"dropdown\">\n");
      out.write("                            <span class=\"user-img\"><img class=\"rounded-circle\" src=\"assets/img/user.jpg\" width=\"40\" alt=\"Admin\">\n");
      out.write("                                <span class=\"status online\"></span></span>\n");
      out.write("                            <span>Admin</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"logout.jsp\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"dropdown mobile-user-menu float-right\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                        \n");
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
      out.write("                                <a href=\"patients-admin.jsp\"><i class=\"fa fa-wheelchair\"></i> <span>Patients</span></a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"submenu\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-user\"></i> <span> Employees </span> <span class=\"menu-arrow\"></span></a>\n");
      out.write("                                <ul style=\"display: none;\">\n");
      out.write("                                    <li><a href=\"employees.jsp\">Employees List</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\n");
      out.write("                            <h4 class=\"page-title\">Edit Employee</h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2\">\n");
      out.write("                            ");

                                try {
                                    Connection conn = null;
                                    int empID = Integer.parseInt(request.getParameter("id"));
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mfas?characterEncoding=utf8", "root", "root18");
                                    Statement s = conn.createStatement();
                                    ResultSet rst = s.executeQuery("SELECT * from employee where emp_id='" + empID + "'");

                                    while (rst.next()) {
                            
      out.write("\n");
      out.write("                            <form action=\"edit-employee.jsp\">\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>First Name <span class=\"text-danger\">*</span></label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"");
      out.print(rst.getString("f_name"));
      out.write("\" name=\"f_name\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Last Name</label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"");
      out.print(rst.getString("l_name"));
      out.write("\" name=\"l_name\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Username <span class=\"text-danger\">*</span></label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"");
      out.print(rst.getString("username"));
      out.write("\" readonly=\"\" name=\"username\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Email <span class=\"text-danger\">*</span></label>\n");
      out.write("                                            <input class=\"form-control\" type=\"email\" value=\"");
      out.print(rst.getString("email"));
      out.write("\" name=\"email\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Employee ID <span class=\"text-danger\">*</span></label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rst.getString("emp_id"));
      out.write("\" readonly=\"\" name=\"emp_id\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Phone </label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" value=\"");
      out.print(rst.getString("phone"));
      out.write("\" name=\"phone\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Role</label>\n");
      out.write("                                            <select class=\"select\" value=\"");
      out.print(rst.getString("role"));
      out.write("\" name=\"role\">\n");
      out.write("                                                <option>Select Role</option>\n");
      out.write("                                                <option>Nurse</option>\n");
      out.write("                                                <option>Laboratorist</option>\n");
      out.write("                                                <option>Pharmacist</option>\n");
      out.write("                                                <option>Accountant</option>\n");
      out.write("                                                <option>Receptionist</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"display-block\">Status</label>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"status\" id=\"employee_active\" value=\"Active\" checked>\n");
      out.write("                                        <label class=\"form-check-label\" for=\"employee_active\">\n");
      out.write("                                            Active\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <input class=\"form-check-input\" type=\"radio\" name=\"status\" id=\"employee_inactive\" value=\"Inactive\">\n");
      out.write("                                        <label class=\"form-check-label\" for=\"employee_inactive\">\n");
      out.write("                                            Inactive\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"hidden\" name=\"h\" value=\"");
      out.print(empID);
      out.write("\">\n");
      out.write("                                <div class=\"m-t-20 text-center\">\n");
      out.write("                                    <button type=\"submit\" name=\"s1\" class=\"btn btn-primary submit-btn\">Save</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            ");
   }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                                if (request.getParameter("s1") != null) {
                                    try {
                                        Connection con = null;
                                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mfas?characterEncoding=utf8", "root", "root18");


                                        PreparedStatement p1 = null;
                                        String sql = null;
                                        String f_name = request.getParameter("f_name");
                                        String l_name = request.getParameter("l_name");
                                        String email = request.getParameter("email");
                                        String phone = request.getParameter("phone");
                                        String role = request.getParameter("role");
                                        String status = request.getParameter("status");

                                        int h1 = Integer.parseInt(request.getParameter("h"));

                                        sql = "UPDATE employee set f_name=?, l_name=?, email=?, phone=?, role=?, status=?  WHERE emp_id=?";

                                        p1 = con.prepareStatement(sql);
                                        p1.setString(1, f_name);
                                        p1.setString(2, l_name);
                                        p1.setString(3, email);
                                        p1.setString(4, phone);
                                        p1.setString(5, role);
                                        p1.setString(6, status);
                                        p1.setInt(7, h1);

                                        int y = p1.executeUpdate();
                                        out.print(y);
                                        if (y == 1) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <script>\n");
      out.write("                                alert(\"Record Update\");\n");
      out.write("                                window.location.href=\"employees.jsp\";\n");
      out.write("                            </script>\n");
      out.write("                            ");
                    } else {
                                            out.print("Record not Found");
                                        }

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }


                                }
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"notification-box\">\n");
      out.write("                    <div class=\"msg-sidebar notifications msg-noti\">\n");
      out.write("                                                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-overlay\" data-reff=\"\"></div>\n");
      out.write("        <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.slimscroll.js\"></script>\n");
      out.write("        <script src=\"assets/js/select2.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/moment.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- edit-employee24:07-->\n");
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
