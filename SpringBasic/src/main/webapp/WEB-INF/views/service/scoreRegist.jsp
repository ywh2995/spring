<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>점수입력</h2>
	
	<form action="scoreForm" method="post">
		이름:<input type="text" name="name">
		국어:<input type="text" name="kor">
		영어:<input type="text" name="eng">
		수학:<input type="text" name="math">
		<button type="submit">제출</button>
	</form>
</body>
</html>