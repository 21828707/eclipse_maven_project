<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Spring5MVC2/member/remove">
		<input type="text" name="memberName" /> <input type="submit"
			value="Remove" />
	</form>

	<form action="/Spring5MVC2/member/add" method="post">
		Name : <input type="text" name="name" /><br> Phone : <input
			type="text" name="phone" /><br> Email : <input type="text"
			name="email" /><br> <input type="submit" value="Add" />
	</form>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Phone</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${guests }" var="guest">
			<tr>
				<th>${guest.name }</th>
				<th>${guest.phone }</th>
				<th>${guest.email }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>