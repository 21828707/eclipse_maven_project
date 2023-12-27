<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.messageItem{
		border-bottom: 1px solid blue;
	}
	.messageGuestName{
		color : red;
	}
	.messageContent{
		font-size:x-larg;
	}
</style>
</head>
<body>
	<h1>방명록</h1>
	<c:if test="${empty listResult.message}">
		등록된 메세지가 없습니다.
	</c:if>
	<c:if test="${not empty listResult.message}">
		<c:forEach items="${listResult.message }" var="message">
			<section class="messageItem">
				<section class="messageGuestName">
					${message.guestName }님께서 남긴 글
				</section>
				<section class="messageContent">
					${message.content }
				</section>
			</section>
		</c:forEach>
	</c:if>
	
	<form action="write" method="post">
		<label for="guestName">방문자</label>
		<input type="text" name="guestName" id="guestName"/><br>
		<label for="content">내용</label>
		<textarea rows="2" cols="30" name="content" id="content"></textarea><br>
		<input type="submit" value="메세지 남기기"/>
	</form>
	
</body>
</html>