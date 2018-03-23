<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        You are now logged in as a customer of our wonderful site.
        <br>
        <br>
        <form name="Building" action="FrontController" method="POST">
            <input type="hidden" name="command" value="products" />
            <input type="submit" value="Lego House Builder" />
        </form>
        <form name="Building" action="FrontController" method="POST">
            <input type="hidden" name="command" value="orderlist" />
            <input type="submit" value="Order History" />
        </form>
        For products <a href="FrontController?command=products"> click here </a>
        <br>
        For order history <a href="FrontController?command=orderlist"> click here </a>
    </body>
</html>
