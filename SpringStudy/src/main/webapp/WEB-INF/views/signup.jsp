<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/signup" method="post">
		아   이   디 :  <input type="text" name="id"><br>
		비 밀 번 호 :<input type="password" name="pw"><br>
		이   메   일 :  <input type="email" name="email"><br>
		성         별 :  <input type="radio" name="gender" value="male" checked>
							 <label for="male">남성</label>
							 <input type="radio" name="gender" value="female">
							 <label for="famale">여성</label><br>							 
		<button type="submit">확 인</button>
	</form>
	<script type="text/javascript">
		var signup = ${signup};
		if(signup == false) alert('회원가입에 실패했습니다.');
		
	</script>
</body>
</html>