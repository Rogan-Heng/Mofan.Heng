<%-- 
    Document   : welcome
    Created on : 2020-5-3, 19:13:40
    Author     : User
--%>
<%@page import="uts.isd.model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/demo.css">
        <title>Welcome Page</title>
    </head>
    <body>
        <%
           String BookID = request.getParameter("BookID");
           String Title = request.getParameter("Title");
           String Authername = request.getParameter("Authername");
           String Publishername = request.getParameter("Publishername");
        %>   
        <h1>Welcome!<%= BookID %></h1>
        <p class = "p"> your Title: <%= Title %></p>
        <p class = "p"> your Authername: <%= Authername %></p>
        <p class = "p"> your Publishername: <%= Publishername %></p>
        
        <div class="panel_div">
            <a class="button" href="index.jsp">Cancel</a>
        </div>
         
    </body>
</html>
