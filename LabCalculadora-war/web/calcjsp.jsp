<%-- 
    Document   : calcjsp
    Created on : 20/10/2022, 11:40:16 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="calcservlet" method="POST">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <br>
            <br>
            <input type="submit" name="action" value="add">
            <input type="submit" name="action" value="rest">
            <input type="submit" name="action" value="mult">
            <input type="submit" name="action" value="div">
            <input type="submit" name="action" value="mod">
            <input type="submit" name="action" value="pot">
        </form>
    </body>
</html>
