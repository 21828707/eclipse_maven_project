<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="board_update_action.do" method="post">
		<input type="hidden" name="seq" value="${board.seq }"/>
		<table>
			<tr>
				<td>게시글 제목</td>
				<td><input type="text" name="title" value="${board.title }" /></td>
			</tr>
			<tr>
				<td>게시글 작성자</td>
				<td><input type="text" name="writer" value="${board.writer }"/></td>
			</tr>
			<tr>
				<td>게시글 내용</td>
				<td><textarea rows="10" cols="20" name="content" >${board.content}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="글쓰기" /></td>
			</tr>
		</table>
	</form>
</body>
</html>