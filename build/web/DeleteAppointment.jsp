<%-- 
    Document   : DeleteAppointment
    Created on : 30-Oct-2023, 1:45:37 pm
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
            String id = request.getParameter("id");
            int no = Integer.parseInt(id);

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8", "root", "root18");
                Statement st = conn.createStatement();

                int y = st.executeUpdate("DELETE FROM appointment WHERE appointment_id = '" + no + "'");
                if (y == 1) {
        %>
        <script>
            alert("Record Deleted");
            window.location.href = "ShowAppointment.jsp";
        </script>
        <%
                }
            } catch (Exception e) {
            }
        %>
    </body>
</html>
