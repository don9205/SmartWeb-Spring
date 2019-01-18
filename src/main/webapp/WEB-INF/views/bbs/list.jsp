<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로 그 인 완 료 화 면</title>
</head>
<body>
	<h1>로 그 인 완 료</h1>
	${user.id}
  ${user.pw}
  <!-- BoardController에 model.addAttribute("user",user) 추가하지 않아도 사용이 가능해진다 -->
</body>
</html>
