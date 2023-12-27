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
<form method = "POST">
	Court Name
	<input type = "text" name = "courtName"/>
	<input type = "submit" value = "Query"/>
</form>
<table border = "1">
	<tr>
		<th>Court Name</th>
		<th>DATE</th>
		<th>Hour</th>
		<th>Player</th>
	</tr>
	<c:forEach items = "${reservations }" var = "reservation">
		<tr>
		<th>${reservation.courtName }</th>
		<th>${reservation.date }</th>
		<th>${reservation.hour }</th>
		<th>${reservation.player.name }</th>
	</tr>
	</c:forEach>
</table>
</body>
</html>







