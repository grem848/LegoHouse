<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order History Page</title>
    </head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <body>
        <h1>Order History</h1>
        <% User user = (User) session.getAttribute("user"); %>
        <h2>Hello
            <% out.println(user.getEmail());%>
        </h2>
    </body>
    Length:<br>
    <%=request.getParameter("length")%> 
    <br>
    Width:<br>
    <%=request.getParameter("width")%>
    <br>
    Height:<br>
    <%=request.getParameter("height")%>
    <br>
    Total Dots:<br>
    <%=request.getAttribute("totalDots")%>
    <br>
    <br>

    
</html>
