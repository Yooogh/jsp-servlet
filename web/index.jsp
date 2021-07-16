<%--
  Created by IntelliJ IDEA.
  User: bitcamp
  Date: 2021-07-16
  Time: 오전 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <c:out value="hello world" />
  <a href="hi">인사하기</a><br>
<%--링크의 쿼리스트링을 통해 값을 전달--%>
  <a href="hi?cnt=3">인사하기</a><br>
  </body>
</html>
