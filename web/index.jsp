<%--
  Created by IntelliJ IDEA.
  User: vietngatran
  Date: 04/11/2019
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Convert</title>
  </head>
  <body>
  <form action="/change" method="post">
    <label>rate</label>
    <input type="number" name="rate" placeholder="rate" value="22000">
    <br/>
    <label>usd</label>
    <input type="number " name="usd" placeholder="usd " value="0">
    <br/>
    <input type="submit" value="Convert" id="submit">
  </form>
  </body>
</html>
