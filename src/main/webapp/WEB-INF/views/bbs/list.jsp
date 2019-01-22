<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로 그 인 완 료 화 면</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.css">
</head>
<body>
	<h1>로 그 인 완 료</h1>
	<table class="table table-bordered">
		<tr>
			<td>아이디 :${user.id}</td>
			<td>비밀번호 :${user.pw}</td>
		<tr>
	</table>
	<!-- BoardController에 model.addAttribute("user",user) 추가하지 않아도 사용이 가능해진다 -->
	<br>
	<table class="table table-bordered">
		<tr>
			<td>번 호</td>
			<td>제 목</td>
			<td>작 성 자</td>
			<td>내 용</td>
			<td>작 성 일</td>
			<td>상 태</td>
		</tr>
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.id}</td>
				<td>${board.title}</td>
				<td>${board.writer}</td>
				<td>${board.content}</td>
				<td>${board.registered_date}</td>
				<td>${board.state}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a class="btn btn-outline-primary"
		href="<%=request.getContextPath() %>/bbs/register">글 쓰 기 이 동</a>
</body>
</html>
