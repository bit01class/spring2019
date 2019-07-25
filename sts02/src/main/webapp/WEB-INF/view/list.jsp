<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css"/>
<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div class="page-header">
				<h1>목록<small>(리스트 페이지)</small></h1>
			</div>		
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<a href="list.bit" class="btn btn-primary btn-block" role="button">리스트</a>
			<a href="add.bit" class="btn btn-default btn-block" role="button">글쓰기</a>
		
		</div>
		<div class="col-md-8">
			<table class="table">
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>이름</th>
					<th>날짜</th>
				</tr>
				<c:forEach items="${alist }" var="bean">
					<tr>
						<td>${bean.num }</td>
						<td>${bean.sub }</td>
						<td>${bean.name }</td>
						<td>${bean.nalja }</td>
					</tr>
				</c:forEach>
			</table>		
		</div>
	</div>
</div>
</body>
</html>










