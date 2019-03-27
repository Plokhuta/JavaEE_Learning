<%--
  Created by IntelliJ IDEA.
  User: Dimap
  Date: 14.03.2019
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Carts</title>
</head>
<body>
    <%@page import="logic.Cart" %>
    <% Cart cart = (Cart)session.getAttribute("cart");%>
    <p><%= "Товар: " + cart.getName()%></p>
    <p><%= "Кількість: " + cart.getQuantity()%></p>
</body>
</html>
