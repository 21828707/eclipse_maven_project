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
	<h1>갱신 완료</h1>

	<c:if test="${editCustomer != null }">
	아래 고객이 갱신 되었습니다.
	
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
	</c:if>

	<c:url var="url" value="/customer"></c:url>
	<a href="${url }">뒤로</a>
</body>
</html>