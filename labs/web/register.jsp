<%-- 
    Document   : register
    Created on : 2020-5-3, 19:00:30
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/demo.css">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Sign up</h1>
    
    <form method="post" action="controller">
        <table>
            <tr><td>BookID:</td><td><input type="Integer" placeholder="Enter BookID" name="BookID"></td></tr>
            <tr><td>Title:</td><td><input type="text" placeholder="Enter Title" name="Title"></td></tr>
            <tr><td>Authorname:</td><td><input type="text" placeholder="Enter Author name" name="Authorname"></td></tr>
            <tr><td>Publishername:</td><td><input type="text" placeholder="Enter Publisher name" name="Publishername"></td></tr>
            <tr><td></td>
                <td>
                    <a href="index.jsp" class="button"> Cancel </a>
                    <input class="button" type="submit" value="subumit">
                </td>
            </tr>    
        </table>
    </form>
    </body>
</html>
