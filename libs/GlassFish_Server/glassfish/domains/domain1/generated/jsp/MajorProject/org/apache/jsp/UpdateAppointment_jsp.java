package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class UpdateAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <style>*\n");
      out.write("            {\n");
      out.write("                padding: 0px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                padding: 16px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                margin-top: 4px;\n");
      out.write("                font-family: -apple-ystem, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .logo\n");
      out.write("            {\n");
      out.write("                width:250px;\n");
      out.write("                height:220px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .Registration\n");
      out.write("            {\n");
      out.write("                margin: auto;\n");
      out.write("                width: 550px;\n");
      out.write("                margin-top: 25px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 1px solid rgba(0,0,0.1);\n");
      out.write("                box-shadow: 0 5px 10px rgba(0,0,0.2);\n");
      out.write("            }\n");
      out.write("            input[type=text],input[type=tel],input[type=email], input[type=password], input[type=date],select{\n");
      out.write("                width:400px;\n");
      out.write("                border: none;\n");
      out.write("                padding:12px 20px  ;\n");
      out.write("                text-align: left;\n");
      out.write("                margin:5px 0px;\n");
      out.write("                display: inline-block;\n");
      out.write("                border:1px solid blue;\n");
      out.write("                border-radius: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input[type=Submit]\n");
      out.write("            {\n");
      out.write("                width: 300px;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                background-color:#4CAF50;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                color:#000;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-variant: small-caps;\n");
      out.write("                border-radius: 1em;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 300px;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                background-color:#4CAF50;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                color:#000;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-variant: small-caps;\n");
      out.write("                border-radius: 1em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div  label{\n");
      out.write("                font-weight: bolder;\n");
      out.write("                padding: 3px;\n");
      out.write("                margin: 0px ;\n");
      out.write("                text-align: left;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            select:focus,input[type=tel]:focus,input[type=text]:focus,input[type=email]:focus, input[type=password]:focus, input[type=date]:focus{\n");
      out.write("                border: 2px solid blue;\n");
      out.write("            }\n");
      out.write("            input[type=radio]\n");
      out.write("            {\n");
      out.write("                margin-left:10px ;\n");
      out.write("                display: inline-table;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"Registration\">\n");
      out.write("        <h2>Update Appointment</h2>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

                try {
                    Connection conn = null;
                    int appID = Integer.parseInt(request.getParameter("id"));
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8", "root", "root18");
                    Statement s = conn.createStatement();
                    ResultSet rst = s.executeQuery("SELECT * from appointment where appointment_id='" + appID + "'");

                    while (rst.next()) {
            
      out.write("\n");
      out.write("            <form action=\"UpdateAppointment.jsp\">\n");
      out.write("                <img class=\"logo\" src=\"Hospital LOGO.png\" alt=\"Logo\">\n");
      out.write("                <br>\n");
      out.write("                <label style=\"text-align: left;\">Appointment Id:</label><br>\n");
      out.write("                <input type=\"text\" name=\"appointment_id\" value=\"");
      out.print(rst.getString("appointment_id"));
      out.write("\" readonly=\"\" required>\n");
      out.write("                <br>\n");
      out.write("                <label style=\"text-align: left;\">First Name:</label><br>\n");
      out.write("                <input type=\"text\" name=\"f_name\" value=\"");
      out.print(rst.getString("f_name"));
      out.write("\" readonly=\"\" required>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <label style=\"text-align: left;\">Last Name:</label><br>\n");
      out.write("                <input type=\"text\" name=\"l_name\" value=\"");
      out.print(rst.getString("l_name"));
      out.write("\" readonly=\"\" required>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <label style=\"text-align: left;\">Age:</label><br>\n");
      out.write("                <input type=\"text\" name=\"age\" value=\"");
      out.print(rst.getString("age"));
      out.write("\" required>\n");
      out.write("                <br><br>\n");
      out.write("                <label style=\"text-align: left;\">Patient History:</label><br>\n");
      out.write("                <input type=\"text\" name=\"pat_history\" value=\"");
      out.print(rst.getString("pat_history"));
      out.write("\" readonly=\"\" required>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <label>City:</label> <br>\n");
      out.write("                <input type=\"text\" name=\"city\" value=\"");
      out.print(rst.getString("city"));
      out.write("\" required>\n");
      out.write("                <br><br>\n");
      out.write("                <label>Time Slot:</label> <br>\n");
      out.write("                <select name=\"time_slot\" value=\"");
      out.print(rst.getString("time_slot"));
      out.write("\" required>\n");
      out.write("                    <option>Select preferred time slot..</option>\n");
      out.write("                    <option>Morning (10:00 - 12:00)</option>\n");
      out.write("                    <option>Afternoon (12:00 - 15:00)</option>\n");
      out.write("                    <option>Evening (17:00 - 20:00)</option>\n");
      out.write("                </select>\n");
      out.write("                <br><br>\n");
      out.write("                <label style=\"text-align: left;\">Contact:</label><br>\n");
      out.write("                <input type=\"text\" name=\"contact\" value=\"");
      out.print(rst.getString("contact"));
      out.write("\" required>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <label style=\"text-align: left;\">Date:</label><br>\n");
      out.write("                <input type=\"date\" name=\"date\" value=\"");
      out.print(rst.getString("date"));
      out.write("\" required>\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"checkbox\" required> I agree to Terms & Conditions<br>\n");
      out.write("                <input type=\"hidden\" name=\"h\" value=\"");
      out.print(appID);
      out.write("\">\n");
      out.write("                <button type=\"submit\" name=\"s1\">Update Appointment</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
   }
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (request.getParameter("s1") != null) {
                try {
                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8", "root", "root18");

                    PreparedStatement p1 = null;
                    String sql = null;
                    String f_name = request.getParameter("f_name");
                    String l_name = request.getParameter("l_name");
                    String age = request.getParameter("age");
                    String pat_history = request.getParameter("pat_history");
                    String city = request.getParameter("city");
                    String time_slot = request.getParameter("time_slot");
                    String contact = request.getParameter("contact");
                    String date = request.getParameter("date");

                    int h1 = Integer.parseInt(request.getParameter("h"));

                    sql = "UPDATE appointment set f_name=?, l_name=?, age=?, pat_history=?, city=?, time_slot=?, contact=? date=? WHERE appointment_id=?";

                    p1 = con.prepareStatement(sql);
                    p1.setString(1, f_name);
                    p1.setString(2, l_name);
                    p1.setString(3, age);
                    p1.setString(4, pat_history);
                    p1.setString(5, city);
                    p1.setString(6, time_slot);
                    p1.setString(7, contact);
                    p1.setString(8, date);
                    p1.setInt(9, h1);
                    int y = p1.executeUpdate();
                        out.print(y);
                    if (y == 1) {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert(\"Record Update\");\n");
      out.write("            window.location.href = \"ShowAppointment.jsp\";\n");
      out.write("        </script>\n");
      out.write("        ");
                    } else {
                        out.print("Record not Found");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
