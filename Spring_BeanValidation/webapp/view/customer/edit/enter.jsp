<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 스프링 제공 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력 화면</h1>
	<form:form modelAttribute="editCustomer">
		<dl>
			<dt>
				이름
			</dt>
			<dd>
				<form:input path="name"/>
				<form:errors path="name"></form:errors>
			</dd>
			<dt>
				주소
			</dt>
			<dd>
				<form:input path="address"/>
				<form:errors path="address"></form:errors>
			</dd>
			<dt>
				이메일 주소
			</dt>
			<dd>
				<form:input path="emailAddress"/>
				<form:errors path="emailAddress"></form:errors>
				<form:errors path="ngEmail"></form:errors>
			</dd>
		</dl>
		
		<button type="submit" name="_event_proceed" value ="proceed">다음</button>
	</form:form>
</body>
</html>