<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<form action="<%= request.getContextPath() %>/" method="get">
	<input type="text" name="id">
	<button type="submit">확 인</button>
</form>
<P>  The time on the server is ${serverTime}. </P>
<a href="<%= request.getContextPath() %>/signup">회 원 가 입</a>
	<script type="text/javascript">
		var signup = ${signup};
		if(signup == true) alert('회원가입에 성공했습니다.');
		
	</script>
</body>
</html>
