<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게 시 판</title>
<style>
	  div,input{
		border: 1px solid black;
		width: 100px;
		height:30px;
		display:inline-block;
		
	}
</style>
<form action="<%= request.getContextPath()%>/bbs" method="post">
아이디 : <div name="id"></div>
제목 : <input type="text" name="title">
내용 : <input type="text" name="content">
글쓴이 : <input type="text" name="writer">
작성날짜 : <div name="registered_date"></div>
상태 : <div type="text" name="state"></div><br>
<button type="submit">등 록</button>
</form>

</head>
<body>

</body>
</html>