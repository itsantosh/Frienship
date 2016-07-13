<%-- 
    Document   : menu
    Created on : Jul 13, 2016, 8:44:53 PM
    Author     : santosh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="men" items="${menu}">
            <h1>${men.menuName}</h1>  
        </c:forEach> 
    </body>
</html>
