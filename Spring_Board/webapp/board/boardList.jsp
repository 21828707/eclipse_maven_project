<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function fn_insert_form(){
		location.href="board_insert_form.do";
	}//비지니스 로직을 돌리는 것이 아닌 화면만 보여주면 된다.
</script>

</head>
<body>
	<hr>
		<input type="button" value="글쓰기" onclick="fn_insert_form()"/>
	<hr>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>등록자</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${boardList }" var="board">
			<tr>
				<td>${board.seq }</td>
				<td><a href="board_detail.do?seq=${board.seq}">${board.title }</a></td>
				<td>${board.writer }</td>
				<td>${board.regdate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>