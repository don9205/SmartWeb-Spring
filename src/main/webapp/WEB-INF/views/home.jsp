<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/bootstrap.css">
</head>
<body>
<h1>
	사 이 트 
</h1>
<%-- jsp에서 컨트롤러로 데이터를 전달하려면 form태그를 이용  --%>
<<<<<<< Updated upstream
<form method="post" action="<%= request.getContextPath()%>/" style="<c:if test="${user != null}">display:none;</c:if>">
=======
<form method="post" action="<%= request.getContextPath()%>">
>>>>>>> Stashed changes
	<!-- 전달하려는 데이터가 있는 태그의 속성 name을 입력한다. -->
	<input type="text" name="id"><br>
	<input type="password" name="pw"><br>
	<button class="btn btn-primary">로 그 인</button>
</form>
<a href="<%= request.getContextPath()%>/signup">회 원 가 입</a>
</body>
</html>
