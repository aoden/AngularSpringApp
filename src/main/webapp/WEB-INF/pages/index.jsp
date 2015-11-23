<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: INSPIRON
  Date: 11/21/2015
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AAA</title>
</head>
<body>
<form id="tw_signin" action="<c:url value="/signin/twitter"/>" method="POST">
  <button type="submit">
    <img src="https://g.twimg.com/dev/sites/default/files/images_documentation/sign-in-with-twitter-gray.png"
         alt="Sign in with Twitter">
  </button>
</form>
</body>
</html>
