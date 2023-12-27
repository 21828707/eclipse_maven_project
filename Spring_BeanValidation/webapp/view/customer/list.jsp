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
	<h1>고객목록 화면</h1>
	<c:if test="${editCustomer != null }">
	아래 고객이 갱신 되었습니다.
	</c:if>
	
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
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>이름</th>
			<th>주소</th>
			<th>이메일</th>
			<th></th>
		</tr>
		<c:forEach items="${customers }" var="customer">
			<tr>
				<td><c:out value="${customer.id }"></c:out></td>
				<td><c:out value="${customer.name }"></c:out></td>
				<td><c:out value="${customer.address }"></c:out></td>
				<td><c:out value="${customer.emailAddress }"></c:out></td>
				<td><c:url value="/customer/${customer.id }" var="url"></c:url>
					<a href="${url }">상세</a> <c:url
						value="/customer/${customer.id }/edit" var="url"></c:url> <a
					href="${url }">편집</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>