<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Admin Login</title>
</head>
<body>
<div>
<form:form action="userlogin" method="post" modelAttribute="user">
<div>
<form:label path="uname">User Name</form:label>
<form:input type="text" path="uname"/>
</div>
<div>
<form:label path="password">Password</form:label>
<form:input type="password" path="password"/>
</div>
<div>
<form:button type="submit">Login</form:button>
<form:button type="reset">Cancel</form:button>
</div>
</form:form>

</div>
</body>
</html>