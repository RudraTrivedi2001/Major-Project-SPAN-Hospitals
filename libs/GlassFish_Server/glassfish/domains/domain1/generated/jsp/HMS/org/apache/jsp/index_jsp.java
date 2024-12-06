package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <title>SPAN Hospitals and Research Center</title>\n");
      out.write("        <!--<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/logo-center.css\">\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                    <script src=\"assets/js/html5shiv.min.js\"></script>\n");
      out.write("                    <script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("            <![endif]-->\n");
      out.write("        <script>\n");
      out.write("            window.history.backward();\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            if (session.getAttribute("user") != null) {
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
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
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown has-arrow\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle nav-link user-link\" data-toggle=\"dropdown\">\n");
      out.write("                            <span class=\"user-img\">\n");
      out.write("                                <img class=\"rounded-circle\" src=\"assets/img/user.jpg\" width=\"24\" alt=\"Admin\">\n");
      out.write("                                <span class=\"status online\"></span>\n");
      out.write("                            </span>\n");
      out.write("                            <span>Admin</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"adminlogin.jsp\">Login</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"dropdown mobile-user-menu float-right\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-ellipsis-v\"></i></a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" href=\"adminlogin.jsp\">Login</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-inner slimscroll\">\n");
      out.write("                    <div id=\"sidebar-menu\" class=\"sidebar-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"menu-title\">Main</li>\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"index.jsp\"><i class=\"fa fa-home\"></i> <span>Home</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"doctorlogin.jsp\"><i class=\"fa fa-user-md\"></i> <span>Doctors</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"patientlogin.jsp\"><i class=\"fa fa-wheelchair\"></i> <span>Patients</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"employeelogin.jsp\"><i class=\"fa fa-user-secret\"></i> <span> Employees </span> </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"visitor-home.jsp\"><i class=\"fa fa-user\"></i> <span> Visitor's Portal </span> </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"center\">\n");
      out.write("                    <img src=\"Hospital_LOGO.png\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"footer-col\">\n");
      out.write("                                <h4>Contact</h4>\n");
      out.write("                                <div class=\"social-links\">\n");
      out.write("                                    <a href=\"mailto:lincedorado1988@gmail.com\" target=\"_blank\"><i class=\"fab fa-google\"></i></a>\n");
      out.write("                                    <a href=\"https://instagram.com/nakulmishraa?igshid=OGQ5ZDc2ODk2ZA==\" target=\"_blank\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"https://www.linkedin.com/in/nakul-mishra-795865228?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app\" target=\"_blank\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                                    <a href=\"https://github.com/NakulMishra\" target=\"_blank\"><i class=\"fab fa-github\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"statement\" style=\"color: #ffffff\">\n");
      out.write("                            Content available on this project are only for fair purposes. This a web-based Hospital Management System Project and is only for educational purposes.\n");
      out.write("                            Developed by Nakul Mishra.\n");
      out.write("                            <p></p>\n");
      out.write("                            E-Mail :- lincedorado1988@gmail.com\n");
      out.write("                            <p></p>\n");
      out.write("                            Copyright © 2023, All Right Reserved..\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"sidebar-overlay\" data-reff=\"\"></div>\n");
      out.write("<script src=\"assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"assets/js/jquery.slimscroll.js\"></script>\n");
      out.write("<script src=\"assets/js/Chart.bundle.js\"></script>\n");
      out.write("<script src=\"assets/js/chart.js\"></script>\n");
      out.write("<script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
