<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramresult</title>
</head>
<body>
	<h2>response되는 뷰(스프링이 공유해 준 데이터 출력하기)</h2>
	<hr/>
	<h3>jsp코드로 출력하기:<%= request.getAttribute("msg") %></h3>
	<h3>EL로 출력:${msg}</h3>
	<h3>data:${data }</h3>
	<h4>EL(expression Language)은 공유한 이름을 $기호와 함께 {}안에 적용
		공유한 이름을 page scope에서 찾고 없으면 request scope -> session scope ->
										application scope에서 찾는다.
										모든 scope에서 공유된 객체를 찾지 못하면 그냥 출력하지 않는다.
										
	</h4>
</body>
</html>