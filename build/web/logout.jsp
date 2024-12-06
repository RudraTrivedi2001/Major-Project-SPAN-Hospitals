<%-- 
    Document   : logout
    Created on : 15 Sep, 2023, 10:14:54 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
session.removeValue("user");
session.invalidate();
response.setHeader("pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache=Control","must-revalidate");
response.setDateHeader("Expires",0);
response.sendRedirect("index.jsp");
%>
<script>
    alert("You Have Been Successfully Logged Out");
</script>
    </body>
</html>
