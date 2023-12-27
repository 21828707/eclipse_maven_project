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
	<h1>지정된 고객을 찾을 수 없습니다.</h1>
	<c:url value="/customer" var="url"></c:url>
	<a href="${url} }">목록</a>
</body>
</html>