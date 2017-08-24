<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of book</title>
</head>
<body>
<a href="book_form">Add new</a>
<c:if test="${!empty books }">
<table>
<thead>
<tr>
<th>Id</th>
<th>Book name</th>
<th>Description</th>
<th>Author</th>
<th>Faculty</th>
<th>Price</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${books}" var="books">
<tr>
<td><c:out value="${books.bookId}"></c:out></td>
<td><c:out value="${books.bookName}"></c:out></td>
<td><c:out value="${books.description}"></c:out></td>
<td><c:out value="${books.author}"></c:out></td>
<td><c:out value="${books.faculty}"></c:out></td>
<td><c:out value="${books.price}"></c:out></td>
<td>
<a href="edit?id=${books.bookId}" >Edit</a>
<a href="delete?id=${books.bookId}" >Delete</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>

</c:if>

</body>
</html>