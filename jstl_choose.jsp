<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_choose</title>
</head>
<body>
	<h2>자바의 if~else(if ~ else if ~ else if ~ else)를 표현</h2>
	<h2>컨트롤러가 공유해준 데이터를 체크(컨트롤러에서 공유한 user객체가 null인지 체크하기)</br>
		c:when이 if
		c:otherwise가 else에 해당
		if - c:when
		else if - c:when
		else if - c:when
		else - c:otherwise</h2>
		<!-- EL이 주로 하는 일은 컨트롤러가 공유해준 공유객체(컨트롤러에서 공유하는 공유명이 EL에서 객체명)를 액세스 -->
	<c:choose>
		<c:when test="${user ==null }">
			<h3>user객체는 널이다</h3>
		</c:when>
		<c:otherwise>
			<h3>user객체는 널이 아니다</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>