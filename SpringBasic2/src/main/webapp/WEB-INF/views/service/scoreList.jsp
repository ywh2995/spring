<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>점수 결과 화면 </h2>
	
	<c:forEach var="vo" items="${list }" varStatus="num">
		번호:${num.index }
		이름:${vo.name }
		이름:${vo.kor }
		이름:${vo.eng }
		이름:${vo.math }
		<button type="button" onclick="loction.href= 'scoreDelete?num=${num.index}'">삭제</button>
	</c:forEach>
		
	<a href="scoreRegist">점수 추가 등록</a>	
	
	<script>
		(function(){
			if('${num}' !== ''){
				alert('${num}' +'가 삭제 되었습니다.');
			}
		})()
	</script>
	
</body>
</html>