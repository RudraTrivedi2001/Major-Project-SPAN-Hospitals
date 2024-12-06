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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>HOME</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" />\n");
      out.write("    <link rel=\"icon\" href=\"images/OLX-Logo.png\" type=\"icon\" />\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"manifest\" href=\"manifest.json\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">Bargain Bazaar</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <!-- <li class=\"nav-item active \" >\n");
      out.write("            <a class=\"nav-link\" href=\"#\" id=\"greetUser\"></a>\n");
      out.write("          </li> -->\n");
      out.write("          <li class=\"nav-item active \" >\n");
      out.write("            <a class=\"nav-link\"><input class=\"form-control border-secondary py-2\" type=\"search\" name=\"search\" id=\"search\" placeholder=\"Search Ads Here\" onkeyup=\"searchFunction()\"/></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"index.html\">Home</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" class=\"userProfile\" href=\"User Profile.html\" id=\"userProfile\"></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("              <a class=\"nav-link\" class=\"favourite\" style=\"display: none\" href=\"favourite.html\" id=\"favourite\">Favourites</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" id=\"postad\" href=\"submitad.html\">Post An Ad</a>\n");
      out.write("          </li>                \n");
      out.write("          <li class=\"nav-item\" class=\"inActiveUser\" id=\"inActiveUser\">\n");
      out.write("            <a class=\"nav-link\" href=\"signin.html\">Sign In/Register</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"activeUser nav-item\" id=\"activeUser\">\n");
      out.write("            <a class=\"nav-link\" href=\"index.html\" onclick=\"signOut()\">Sign Out</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("  <h1 class=\"suh text-center text-dark\">Recent Ads</h1>\n");
      out.write("  <div class=\"container\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"category\"><b>Select Category</b></label>\n");
      out.write("    <select onchange=\"selectCategory()\" name=\"category\" id=\"homePageCategorySelection\" class=\"form-control\" id=\"category\">\n");
      out.write("        <option>All Categories</option>\n");
      out.write("        <option>Vehicles</option>\n");
      out.write("        <option>Electronics And Home Appliances</option>\n");
      out.write("        <option>Furnitue,Home And Decoration</option>\n");
      out.write("        <option>Fashion And Beauty</option>\n");
      out.write("        <option>Books Sports And Hobbies</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("</div>   \n");
      out.write("\n");
      out.write("  <!-- bootstrap Modal -->\n");
      out.write("    \n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">New message</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"messages-text\" class=\"col-form-label\">Messages:</label>\n");
      out.write("            <div class=\"modal-body\" id=\"messages-text\"><p id=\"modal-list\"></p></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"recipient-messege\" class=\"col-form-label\">Type Your Message Here</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"recipient-messege\">\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" onclick=\"sendMessage()\">Send Message</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <!-- Ads -->\n");
      out.write("  <div class=\"container\" id=\"container\">\n");
      out.write("    <div class=\"row\" id=\"row\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>  \n");
      out.write("     \n");
      out.write("  <!-- Footer -->\n");
      out.write("  <footer class=\"grid py-5 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <address style=\"color:#f0f5f5;font-family:Times New Roman;Text-Align:center\">\n");
      out.write("                    Website Owner : Nakul and Team<sup>©</sup><br>\n");
      out.write("                    Cell No.      : +919752102139<br>\n");
      out.write("                    Facebook      : <a href=\"#\">Find Us On Facebook</a><br>\n");
      out.write("                    Instagram       : <a href=\"#\">Find Us On Instagram</a><br>\n");
      out.write("                    Github       : <a href=\"#\">Find Us On Github</a><br>\n");
      out.write("                    </address>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("  </footer>\n");
      out.write(" \n");
      out.write("<!-- main -->\n");
      out.write("<script src=\"https://www.gstatic.com/firebasejs/5.2.0/firebase.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js\" integrity=\"sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\" integrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"signup.js\"></script>\n");
      out.write("    <script src=\"signin.js\"></script>\n");
      out.write("    <script src=\"submitad.js\"></script>\n");
      out.write("    <!-- <script src=\"User Profile.js\"></script> -->\n");
      out.write("    <script src=\"script.js\"></script>\n");
      out.write("\n");
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
