<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="board_insert_action.do" method="post">
	<table>
		<tr>
			<td>게시글 제목</td>
			<td><input type="text" name="title"/></td>
		</tr>
		<tr>
			<td>게시글 작성자</td>
			<td><input type="text" name="writer"/></td>
		</tr>
		<tr>
			<td>게시글 내용</td>
			<td><textarea rows="10" cols="20" name="content"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="글쓰기" /></td>
		</tr>
	</table>
</form>
</body>
</html>