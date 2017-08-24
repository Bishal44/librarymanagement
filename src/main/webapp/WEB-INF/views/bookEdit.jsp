<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form:form action="update_bookinfo" method="post" modelAttribute="library">
<div>
<form:label path="bookId">Book Name</form:label>
<form:input type="text" path="bookId"/>
</div>
<div>
<form:label path="bookName">Book Name</form:label>
<form:input type="text" path="bookName"/>
</div>
<div>
<form:label path="description">Description</form:label>
<form:input path="description"/>
</div>
<div>
<form:label path="author">Author Name</form:label>
<form:input path="author"/>
</div>
<div>
<form:label path="price">Price</form:label>
<form:input path="price"/>
</div>
<div>
<form:label path="faculty">Faculty</form:label>
<form:select items="${facultylist}" path="faculty"></form:select>

</div>

<div>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</div>


</form:form>



</div>
</body>
</html>