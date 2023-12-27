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
	<h1>확인 화면</h1>

	<form method="post">
		<dl>
			<dt>이름</dt>
			<dd>
				<c:out value="${editCustomer.name }"></c:out>
			</dd>
			<dt>주소</dt>
			<dd>
				<c:out value="${editCustomer.address }"></c:out>
			</dd>
			<dt>이메일</dt>
			<dd>
				<c:out value="${editCustomer.emailAddress }"></c:out>
			</dd>
		</dl>
		<button type="submit" name="_event_confirmed">갱신</button>
		<button type="submit" name="_event_edited">갱신(세션 종료)</button>
		<button type="submit" name="_event_revise">재입력</button>
	</form>
</body>
</html>