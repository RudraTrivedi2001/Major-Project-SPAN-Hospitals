<%-- 
    Document   : displayImage
    Created on : 11-Oct-2023, 6:16:27 pm
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

            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");
            String a = "jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8";
            conn = DriverManager.getConnection(a, "root", "root18");

            ResultSet rs = null;
            String sql = "SELECT * FROM doctor";

            PreparedStatement p = conn.prepareStatement(sql);

            rs = p.executeQuery(sql);
            int cnt = 1;
            while (rs.next()) {
            if (cnt % 4 == 1) 
            {
        %>
        <div>
            ID:<%=rs.getString("doctor_id")%> <p>
            Image: <img src='image.jsp?imgid=<%=rs.getString("doctor_id")%>' alt="alt" shape="circle"/><hr>
        </div>
        <%
        } 
        else 
        {
        %>
        <div>
            ID:<%=rs.getString("doctor_id")%> <p>
            Image: <img src='image.jsp?imgid=<%=rs.getString("doctor_id")%>' alt="alt" shape="circle"/><hr> 
        </div>
        <%       
        }

            cnt++;
        }
        %>
    </body>
</html>
