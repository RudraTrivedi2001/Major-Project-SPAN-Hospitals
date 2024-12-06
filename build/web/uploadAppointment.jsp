<%-- 
    Document   : uploadAppointment
    Created on : 11-Oct-2023, 11:13:57 am
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
            
            String f_name = request.getParameter("f_name");
            String l_name = request.getParameter("l_name");
            String age = request.getParameter("age");
            String pat_history = request.getParameter("pat_history");
            String city = request.getParameter("city");
            String time_slot = request.getParameter("time_slot");
            String contact = request.getParameter("contact");
            String date = request.getParameter("date");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,user,passcode);
                
                String sql = "INSERT INTO appointment(f_name,l_name,age,pat_history,city,time_slot,contact,date) values(?,?,?,?,?,?,?,?)";
                PreparedStatement p = con.prepareStatement(sql);
                
                p.setString(1,f_name);
                p.setString(2,l_name);
                p.setString(3, age);
                p.setString(4,pat_history);
                p.setString(5,city);
                p.setString(6, time_slot);
                p.setString(7,contact);
                p.setString(8,date);
                
                int row = p.executeUpdate();
                    if(row>0){
                        %>
                        <script>
                            alert('Appointment Booked');
                            window.location.href = 'userhome.jsp';
                        </script>
                        <%
                    }
            }catch(Exception e){
                e.printStackTrace();
            }
        %>
    </body>
</html>
