<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_if</title>
</head>
<body>
	<!-- JSTL(JavaServerPage Standard Tag Library) - 자바표준태그라이브러리 
		- 기본 자바코드를 태그로 사용할 수 있도록 지원
		- EL과 같이 사용
		- JSTL을 사용하기 위해서 태그라이브러리를 추가(taglib)
		- 접두사 c로 정의하기 때문에 c:XXXX태그를 이용해서 작업
	
	-->
	<h3>c:if사용 - 자바의 if문(true인 경우만 체크)</h3>
	1. 전송된 파라미터의 name을 체크해서 name이 홍길동이면 "홍길동님 환영합니다." 메시지 출력하기
	<h3>${param.name }</h3>
	<h3>${param.addr }</h3>
	<c:if test="${param.name=='홍길동'}">
		<h3>${param.name }님 환영합니다.</h3>
	</c:if>
	
	2. age를 체크해서 age가 70이상이면 실버를 출력하세요</br>
	<c:if test="${param.age>70}">
		<h3>실버</h3>
	</c:if>
	
	3. age를 체크해서 age가 10~20사이이면 청소년을 출력하세요
	<c:if test="${param.age>=10 && param.age<=20}">
		<h3>청소년</h3>
	</c:if>
	
	
</body>
</html>