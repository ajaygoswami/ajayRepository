<%@page contentType="text/html;charset=ISO-8859-1" language="java"%>
<%@taglib prefix="stripes"
	uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2 style="color:blue;" align="center">Please Register Here</h2>

	<stripes:form beanclass="stripes.demo.action.RegisterActionBean">
	<table>
	
	First Name:<stripes:text name="user.contact.firstName"></stripes:text>
	Middle Name:<stripes:text name="user.contact.middleName"></stripes:text>
	Last Name:<stripes:text name="user.contact.lastName"></stripes:text>
	User Name:<stripes:text name="user.username"></stripes:text>
	Password:<stripes:password name="user.password"></stripes:password>
	Confirm Password:<stripes:password name="user.confirmPassword"></stripes:password>
	Email:<stripes:text name="user.contact.email"></stripes:text>
	Confirm Email:<stripes:text name="user.contact.confirmEmail"></stripes:text>
	Mobile No:<stripes:text name="user.contact.mobNo"></stripes:text>
	
	
	<%-- Address
	 House No : <stripes:text name="user.contact.address.houseNo"></stripes:text>
	 Street No : <stripes:text name="user.contact.address.streetNo"></stripes:text>
	 LandMark : <stripes:text name="user.contact.address.landMark"></stripes:text>
	 City : <stripes:text name="user.contact.address.city"></stripes:text>
	 State : <stripes:text name="user.contact.address.state"></stripes:text>
	 PinCode :  <stripes:text name="user.contact.address.pinCode"></stripes:text>
	 Country : <stripes:text name="user.contact.address.country"></stripes:text>
	 --%>
	<stripes:submit name="register" value="Register"></stripes:submit>
	
	</table>
	</stripes:form>
</body>
</html>