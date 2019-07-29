<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert.bit" method="post">
		<div>
			<label for="sub">제목</label>
			<input type="text" name="sub" id="sub" value="" placeholder="sub" />
		</div>
		<div>
			<label for="name">글쓴이</label>
			<input type="text" name="name" id="name" value="" placeholder="name" />
		</div>
		<div>
			<textarea name="content" id="content" value="" placeholder="content" ></textarea>
		</div>
		<div>
			<button type="submit">입력</button>
			<button type="reset">취소</button>
		</div>
	</form>
</body>
</html>