<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 필요! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<dl>
		<dt>이름</dt>
		<dd>
			<c:out value="${customer.name }"></c:out>
		</dd>
		<dt>주소</dt>
		<dd>
			<c:out value="${customer.address }"></c:out>
		</dd>
		<dt>이메일</dt>
		<dd>
			<c:out value="${customer.emailAddress }"></c:out>
		</dd>
	</dl>
	<c:url value="/customer" var="url"></c:url>
	<a href="${url}">목록</a>
</body>
</html>