<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세페이지</h1>
	<div>
		<span>글번호</span>
		<span>${bean.num }</span>
		<span>글쓴이</span>
		<span>${bean.name }</span>
		<span>날짜</span>
		<span>${bean.nalja }</span>
	</div>
	<div>
		<span>제목</span>
		<span>${bean.sub }</span>
	</div>
	<div>
		<pre>${bean.content }</pre>
	</div>
	<div>
		<a href="update?idx=${requestScope.idx }">수정</a>
		<a href="delete?idx=${requestScope.idx }">삭제</a>
	</div>
</body>
</html>













