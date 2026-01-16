<%-- 
    Document   : login.jsp
    Created on : 16-01-2026, 07:46:14
    Author     : tungi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MainController" method="post">
            <input type="hidden" name="action" value="login" />
            Username: <input type="text" name="txtUsername" /> <br/>
            Password: <input type="password" name="txtPassword" /> <br/>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
