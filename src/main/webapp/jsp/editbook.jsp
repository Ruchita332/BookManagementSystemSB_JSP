<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${msg }</p>
<h3>Edit New Book</h3>

<form:form action="/update" modelAttribute="book">

<form:hidden path="bid"/> <!-- saving id -->

Book Name: <form:input path="bname"/><br><br>
Book Type: <form:input path="btype"/><br><br>
Book Author: <form:input path="author"/><br><br>
Book Price: <form:input path="bprice"/><br><br>

<input type="submit" value="Update">
<a href="/viewAll">View all Book Records</a>

</form:form>


</body>
</html>