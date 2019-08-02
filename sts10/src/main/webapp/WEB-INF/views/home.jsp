<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
</head>
<body>
	<form action="add" method="post">
	<div>
		num:<input type="text" name="num"/>
	</div>
	<div>
		sub:<input type="text" name="sub"/>
	</div>
	<div>
		<button>입력</button>
	</div>
	</form>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>날짜</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach items="${alist }" var="bean">
		<tr>
		<form action="edit" method="get">
			<td>${bean.num }<input type="hidden" name="num" value="${bean.num }" /></td>
			<td><input type="text" name="sub" value="${bean.sub }"/></td>
			<td>${bean.nalja }</td>
			<td><button>수정</button></td>
		</form>
		<form action="del" method="get"><input type="hidden" name="num" value="${bean.num }">
			<td><button>삭제</button></td>
		</form>
		</tr>
		</c:forEach>		
	</table>
</body>
</html>
