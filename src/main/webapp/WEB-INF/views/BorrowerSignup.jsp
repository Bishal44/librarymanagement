<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Borrower Signup</title>
</head>
<body>
<div>
<div>
<form:form action="borrowersignup" method="post" modelAttribute="borrower">
<div>
<form:label path="firstName">First Name</form:label>
<form:input type="text" path="firstName"/>
</div>
<div>
<form:label path="lastName">Last Name</form:label>
<form:input type="text" path="lastName"/>
</div>

<div>
<form:label path="dob">Date of Birth</form:label>
<form:input type="date" path="dob"/>
</div>
<div>
<form:label path="email">Email</form:label>
<form:input type="email" path="email"/>
</div>
<div>
<form:label path="gender">Gender</form:label>
<form:radiobuttons items="${genderlist}" path="gender"/>
</div>

<div>
<form:label path="departments">Departments</form:label>
<form:select items="${facultylist}" path="departments"></form:select>
</div>
<div>
<form:label path="roll">Roll No</form:label>
<form:input type="text" path="roll"/>

</div>
<div>
<form:label path="userName">Choose user name</form:label>
<form:input type="text" path="userName"/>
</div>
<div>
<form:label path="password">Choose password</form:label>
<form:input type="text" path="password"/>
</div>
<div>
<form:button type="submit">Signup</form:button>
<form:button type="reset">Reset</form:button>
</div>


</form:form>
</div>
</div>
</body>
</html>