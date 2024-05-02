<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>가입정보</h2>
	<hr/>
	<h2>성명:${post.userName }</h2>
	<h2>아이디:${post.userId }</h2>
	<h2>패스워드:${post.userpasswd }</h2>
	<h2>닉네임:${post.nickname }</h2>
	<h2>성별:${post.gender }</h2>
	<h2>직업:${post.job }</h2>
</body>
</html>