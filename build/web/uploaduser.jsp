<%-- 
    Document   : uploaduser
    Created on : 11-Oct-2023, 1:10:49 am
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
            String url = "jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8";
            String user = "root";
            String passcode = "root18";
            
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String dob = request.getParameter("dob");
            String phone = request.getParameter("phone");
            String password = request.getParameter("password");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,user,passcode);
                
                String sql = "INSERT INTO user(name,email,dob,phone,password) values(?,?,?,?,?)";
                PreparedStatement p = con.prepareStatement(sql);
                
                p.setString(1,name);
                p.setString(2,email);
                p.setString(3,dob);
                p.setString(4,phone);
                p.setString(5,password);
                
                int row = p.executeUpdate();
                    if(row>0){
                        %>
                        <script>
                            alert('Registration Done');
                            window.location.href = 'index.jsp';
                        </script>
                        <%
                    }
            }catch(Exception e){
                e.printStackTrace();
            }
        %>
    </body>
</html>
