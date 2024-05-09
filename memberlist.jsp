<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
	<h3>회원목록</h3>
	<div style="padding-top: 30px">
	<form action="#">
		<select name="tag">
			<option value="deptno">부서</option>
			<option value="name">성명</option>
			<option value="group">그룹</option>
			<option value="startday">입사일</option>
		</select> <input type="text" name="search" /> <input type="submit" value="검색">
		<input type="button" value="비밀번호변경" id="passmodify">
		
	</form>
	<br/>
		<table class="table">
			<thead>
				<tr>
					<th><input type="checkbox" id="all"/></th>
					<th>아이디</th>
					<th>성명</th>
					<th>부서코드</th>
					<th>입사일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="member" items="${memberlist }">
				<tr>
					<td><input type="checkbox" id=""/></td>
					<td>${member.id }</td>
					<td>${member.name }</td>
					<td>${member.deptno }</td>
					<td>${member.startday }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
	
</body>
</html>
