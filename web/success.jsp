<%-- 
    Document   : success
    Created on : May 18, 2013, 11:20:36 PM
    Author     : TATARAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <h1>Success</h1><br></br>
        
        <bean:message key="label.user" /> <bean:write name="LoginForm" property="name" /><br>   
        <bean:message key="label.pwd" /><bean:write name="LoginForm" property="password" />
    </body>
</html>
