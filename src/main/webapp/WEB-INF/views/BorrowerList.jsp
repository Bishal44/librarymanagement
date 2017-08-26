<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Borrower List</title>
</head>
<body>
<a href="signup">Add new</a>
<c:if test="${!empty borrower}">
<div>
<table>
<thead>
</thead>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last name</th>
<th>Date Of Birth</th>
<th>Email</th>
<th>Gender</th>
<th>Departments</th>
<th>Roll no.</th>
<th>User name</th>
<th>Password</th>
<th>Actions</th>
</tr>
<tbody>
<c:forEach items="${borrower}" var="borrower">
<tr>
<td><c:out value="${borrower.borrowerId}"></c:out></td>
<td><c:out value="${borrower.firstName}"></c:out></td>
<td><c:out value="${borrower.lastName}"></c:out></td>
<td><c:out value="${borrower.dob}"></c:out></td>
<td><c:out value="${borrower.email}"></c:out></td>
<td><c:out value="${borrower.gender}"></c:out></td>
<td><c:out value="${borrower.departments}"></c:out></td>
<td><c:out value="${borrower.roll}"></c:out></td>
<td><c:out value="${borrower.userName}"></c:out></td>
<td><c:out value="${borrower.password}"></c:out></td>

<td>
<a href="edit?id=${borrower.borrowerId}" >Edit</a>
<a href="deleteborrower?id=${borrower.borrowerId}">Delete</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</c:if>
</body>
</html>