<%@page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<stripes:form beanclass="stripes.demo.action.LoginActionBean">
<table>
<stripes:text name="user.username"></stripes:text>
<stripes:password name="user.password"></stripes:password>
<stripes:submit name="login" value="Login"></stripes:submit>

</table>

</stripes:form>
<stripes:link beanclass="stripes.demo.action.RegisterActionBean">Register</stripes:link>
</body>
</html>