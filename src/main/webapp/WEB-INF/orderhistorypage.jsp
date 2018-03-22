<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Old Order Page</title>
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
        <% User user = (User) session.getAttribute("user"); %>
        <h1>Old Order: <% out.println(user.getId());%></h1>
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