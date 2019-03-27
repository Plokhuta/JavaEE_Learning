<%--
  Created by IntelliJ IDEA.
  User: Dimap
  Date: 13.03.2019
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Test</title>
</head>
<body>
    <h1>Test JSP</h1>
    <p>
        <%@page import="java.util.Date, logic.TestClass" %>

        <% TestClass testClass = new TestClass();%>

        <%= testClass.getInfo() %>

    </p>
    <p>
        <%= new Date() %>
    </p>
    <p>
        <% String name = request.getParameter("name");%>
        <%= "Hallo " + name%>
    </p>
</body>
</html>
