<%-- 
    Document   : CheckAdmin
    Created on : 17-Oct-2023, 12:19:19 am
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                String admin_id = request.getParameter("admin_id");
                String password = request.getParameter("password");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8","root","root18");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from admin where admin_id ='" + admin_id + "' and password ='" + password + "'");
                
                if(rs.next()){
                    session.setAttribute("user", admin_id);
                    response.sendRedirect("AdminHome.jsp");
                }
                else{
                    %>
                    <script>
                        alert('Invalid Login please try again !');
                        window.location = 'index.jsp';
                    </script>
                    <%
                }
            }
            catch(Exception e){
                out.print(e.toString());
            }

        %>
    </body>
</html>
