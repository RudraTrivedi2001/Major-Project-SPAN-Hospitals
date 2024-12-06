<%-- 
    Document   : uploadEnquiry
    Created on : 16-Oct-2023, 11:58:29 pm
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
            String message = request.getParameter("message");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,user,passcode);
                
                String sql = "INSERT INTO enquiry(name,email,message) values(?,?,?)";
                PreparedStatement p = con.prepareStatement(sql);
                
                p.setString(1,name);
                p.setString(2,email);
                p.setString(3,message);
                
                int row = p.executeUpdate();
                    if(row>0){
                        %>
                        <script>
                            alert('Submitted!!');
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
