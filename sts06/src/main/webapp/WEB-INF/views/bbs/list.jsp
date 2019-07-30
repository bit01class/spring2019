<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>list page</h1>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${alist }" var="bean">
		<tr>
			<td><a href="detail?idx=${bean.num }">${bean.num }</a></td>
			<td><a href="detail?idx=${bean.num }">${bean.sub }</a></td>
			<td><a href="detail?idx=${bean.num }">${bean.name }</a></td>
			<td><a href="detail?idx=${bean.num }">${bean.nalja }</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href="add">입 력</a>
</body>
</html>

















