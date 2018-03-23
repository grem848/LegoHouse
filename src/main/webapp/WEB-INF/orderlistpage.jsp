<%@page import="java.util.List"%>
<%@page import="FunctionLayer.OrderBOM"%>
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
        <% 
            User user = (User) session.getAttribute("user");
            
        %>
        <h1>Order History</h1>
        <h2>Hello
            <% out.println(user.getEmail());%>
        </h2>
            <%=request.getAttribute(("orders").toString())%>
    </body>
</html>
