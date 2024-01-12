<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<p >${msg} here</p>
<h3>Book Records</h3>

<table class= "table table-bodered table-striped table-hover">
<tablehead>
<tr class="table-dark">
	<th scope ="col">Book Id</th>
	<th scope ="col">Book Name</th>
		<th scope ="col">Book Type</th>
			<th scope ="col">Book Author</th>
			<th scope ="col">Book Price</th>
			<th scope ="col">Edit</th>
			<th scope ="col">Delete</th>
			
</tr>
</tablehead>

<tablebody>
	<c:forEach items="${bookList}" var="b">
	<tr>
		<th scope ="row">${b.bid }</th>
				<td>${b.bname }</td>
				<td>${b.btype }</td>
				<td>${b.author}</td>
				<td>${b.bprice }</td>
				<td><a href= "edit?id=${b.bid}">Edit</a></td>
				<td><a href="delete/${b.bid}">Delete</a></td>
				
		
	</tr>
	</c:forEach>

</tablebody>



</table>
<a href="/" role="button" class= "btn btn-primary">Add New Book</a>


</body>
</html>