<%-- 
    Document   : UpdateAppointment
    Created on : 30-Oct-2023, 1:37:48 pm
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <style>*
            {
                padding: 0px;
                text-align: center;
            }
            .container {
                padding: 16px;

            }
            h2{
                margin-top: 4px;
                font-family: -apple-ystem, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
                text-align: center;


            }
            .logo
            {
                width:250px;
                height:220px;
                vertical-align: middle;

            }
            .Registration
            {
                margin: auto;
                width: 550px;
                margin-top: 25px;
                margin-bottom: 30px;
                box-sizing: border-box;
                border: 1px solid rgba(0,0,0.1);
                box-shadow: 0 5px 10px rgba(0,0,0.2);
            }
            input[type=text],input[type=tel],input[type=email], input[type=password], input[type=date],select{
                width:400px;
                border: none;
                padding:12px 20px  ;
                text-align: left;
                margin:5px 0px;
                display: inline-block;
                border:1px solid blue;
                border-radius: 5px;

            }
            input[type=Submit]
            {
                width: 300px;
                padding: 14px 20px;
                background-color:#4CAF50;
                border: none;
                cursor: pointer;
                margin-top: 20px;
                color:#000;
                font-weight: bold;
                font-variant: small-caps;
                border-radius: 1em;
            }
            button{
                width: 300px;
                padding: 14px 20px;
                background-color:#4CAF50;
                border: none;
                cursor: pointer;
                margin-top: 20px;
                color:#000;
                font-weight: bold;
                font-variant: small-caps;
                border-radius: 1em;
            }

            div  label{
                font-weight: bolder;
                padding: 3px;
                margin: 0px ;
                text-align: left;

            }
            select:focus,input[type=tel]:focus,input[type=text]:focus,input[type=email]:focus, input[type=password]:focus, input[type=date]:focus{
                border: 2px solid blue;
            }
            input[type=radio]
            {
                margin-left:10px ;
                display: inline-table;
            }

        </style>
    </style>
</head>
<body>


    <div class="Registration">
        <h2>Update Appointment</h2>
        <div class="container">
            <%
                try {
                    Connection conn = null;
                    int appID = Integer.parseInt(request.getParameter("id"));
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8", "root", "root18");
                    Statement s = conn.createStatement();
                    ResultSet rst = s.executeQuery("SELECT * from appointment where appointment_id='" + appID + "'");

                    while (rst.next()) {
            %>
            <form action="UpdateAppointment.jsp">
                <img class="logo" src="Hospital LOGO.png" alt="Logo">
                <br>
                <label style="text-align: left;">Appointment Id:</label><br>
                <input type="text" name="appointment_id" value="<%=rst.getString("appointment_id")%>" readonly="" required>
                <br>
                <label style="text-align: left;">First Name:</label><br>
                <input type="text" name="f_name" value="<%=rst.getString("f_name")%>" readonly="" required>
                <br>
                <br>
                <label style="text-align: left;">Last Name:</label><br>
                <input type="text" name="l_name" value="<%=rst.getString("l_name")%>" readonly="" required>
                <br>
                <br>
                <label style="text-align: left;">Age:</label><br>
                <input type="text" name="age" value="<%=rst.getString("age")%>" required>
                <br><br>
                <label style="text-align: left;">Patient History:</label><br>
                <input type="text" name="pat_history" value="<%=rst.getString("pat_history")%>" readonly="" required>
                <br>
                <br>
                <label>City:</label> <br>
                <input type="text" name="city" value="<%=rst.getString("city")%>" required>
                <br><br>
                <label>Time Slot:</label> <br>
                <select name="time_slot" value="<%=rst.getString("time_slot")%>" required>
                    <option>Select preferred time slot..</option>
                    <option>Morning (10:00 - 12:00)</option>
                    <option>Afternoon (12:00 - 15:00)</option>
                    <option>Evening (17:00 - 20:00)</option>
                </select>
                <br><br>
                <label style="text-align: left;">Contact:</label><br>
                <input type="text" name="contact" value="<%=rst.getString("contact")%>" required>
                <br>
                <br>
                <label style="text-align: left;">Date:</label><br>
                <input type="date" name="date" value="<%=rst.getString("date")%>" required>
                <br><br>
                <input type="checkbox" required> I agree to Terms & Conditions<br>
                <input type="hidden" name="h" value="<%=appID%>">
                <button type="submit" name="s1">Update Appointment</button>
            </form>
        </div>
        <%   }
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
        %>
        <script>
            alert("Record Update");
            window.location.href = "ShowAppointment.jsp";
        </script>
        <%                    } else {
                        out.print("Record not Found");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }%>

    </div>
</body>
</html>
