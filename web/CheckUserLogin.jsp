<%-- 
    Document   : CheckUserLogin
    Created on : 11-Oct-2023, 1:33:25 am
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
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8","root","root18");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from user where email ='" + email + "' and password ='" + password + "'");
                
                if(rs.next()){
                    session.setAttribute("user", email);
                    response.sendRedirect("userhome.jsp");
                }
                else{
                    %>
                    <script>
                        alert('invalid Login please try again !');
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
