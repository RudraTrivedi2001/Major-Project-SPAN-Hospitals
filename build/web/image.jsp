<%-- 
    Document   : image
    Created on : 11-Oct-2023, 6:27:26 pm
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.sql.*,java.io.*,java.util.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            String c = "jdbc:mysql://localhost:3306/major_project?characterEncoding=utf8";

            if (request.getParameter("imgid") != null && request.getParameter("imgid") != "") {
                int id = Integer.parseInt(request.getParameter("imgid"));

                String filename = "image" + id + ".jpg";

                Connection con = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection(c, "root", "root18");
                    Statement st1 = con.createStatement();

                    String strQuery = "select image from doctor where doctor_id=" + id;

                    ResultSet rs1 = st1.executeQuery(strQuery);
                    String imgLen = "";
                    if (rs1.next()) {
                        imgLen = rs1.getString(1);

                        int len = imgLen.length();//123456

                        byte rb[] = new byte[len];//to create location in the array

                        InputStream readImg = rs1.getBinaryStream(1);

                        int index = readImg.read(rb, 0, len);

                        st1.close();
                        response.reset();
                        response.setContentType("image/jpg");
                        response.setHeader("Content-disposition", "attachment; filename=" + filename);
                        response.getOutputStream().write(rb, 0, len);
                        response.getOutputStream().flush();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        %>
