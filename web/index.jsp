<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <html:base/>
    </head>
    <body style="background-color:gainsboro">
    <center>
        <html:form action="login" >
            <div style="color:red">
            <html:errors />
            </div>
            <bean:message key="label.user" /> :  <html:text property="name" /><br>
            <bean:message key="label.pwd" /> : <html:password property="password" />
            </br>
            <html:submit value="Sign in" />
        </html:form>
    </center>
    </body>
</html:html>
