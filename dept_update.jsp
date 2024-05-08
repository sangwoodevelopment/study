<%@page import="com.multi.erp.dept.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<% DeptDTO dept = (DeptDTO)request.getAttribute("dept"); %>
			<div class="col-lg-10">
				<form role="form" class="form-horizontal"
				 action="/erp/dept/update.do" method="post">
					<fieldset>
						<div id="legend">
							<legend>아래 양식을 작성해주세요.</legend>
						</div>
						<div class="form-group">
							<!-- 부서코드 -->
							<label class="control-label col-sm-2" for="deptcode">부서코드</label>
							<div class="col-sm-3">
								<%= dept.getDeptno() %>
								<input type="hidden" name="deptno" value="<%= dept.getDeptno() %>">
							</div>
						</div>



						<div class="form-group">
							<!-- 부서명-->
							<label class="control-label col-sm-2" for="name">부서명</label>
							<div class="col-sm-3">
								<!-- 부서명을 이곳에 출력하세요 -->
								<%= dept.getDeptname() %>
							</div>
						</div>
						<div class="form-group">
							<!-- 아이디-->
							<label class="control-label col-sm-2" for="id">부서생성일</label>
							<div class="col-sm-3">
								<!-- 부서생성일 이곳에 출력하세요 -->
								<%= dept.getDeptStartDay() %>
							</div>
						</div>
						<div class="form-group">
							<!-- 주소-->
							<label class="control-label col-sm-2" for="addr">부서레벨</label>
							<div class="col-sm-3">
								<!-- 부서레벨을 이곳에 출력하세요 -->
								<%= dept.getDeptlevel() %>
							</div>
						</div>

						<div class="form-group">
							<!-- 입사날짜-->
							<label class="control-label col-sm-2" for="hiredate">부서스텝</label>
							<div class="col-sm-3">
								<!-- 부서스텝를 이곳에 출력하세요 -->
								 <%= dept.getDeptstep() %>
							</div>
						</div>
						<div class="form-group">
							<!-- 포인트-->
							<label class="control-label col-sm-2" for="point">상위부서번호</label>
							<div class="col-sm-3">
								<!-- 상위부서번호를 이곳에 출력하세요 -->
								<%= dept.getDeptuppercode() %>
							</div>
						</div>
						<div class="form-group">
							<!-- 등급-->
							<label class="control-label col-sm-2" for="grade">업무분류</label>
							<div class="col-sm-3">
								<!-- 업무분류를 이곳에 출력하세요 -->
								<%= dept.getJob_category()%>
							</div>
						</div>
						<div class="form-group">
							<!-- 등급-->
							<label class="control-label col-sm-2" for="grade">관리자</label>
							<div class="col-sm-3">
								<input type="text"
							 value="<%= dept.getMgr_id()%>" name="mgr_id"/>
							</div>
						</div>
						<div class="form-group">
							<!-- 등급-->
							<label class="control-label col-sm-2" for="grade">부서주소</label>
							<div class="col-sm-3">
								<!-- 부서주소를 이곳에 출력하세요 -->
								<input type="text"
							 value="<%= dept.getDeptaddr()%>" name="deptaddr"/>
							</div>
						</div>
						<div class="form-group">
							<!-- 등급-->
							<label class="control-label col-sm-2" for="grade">전화번호</label>
							<div class="col-sm-3">
								<!-- 전화번호를 이곳에 출력하세요 -->
								<input type="text"
							 value="<%= dept.getDepttel()%>" name="depttel"/>
							</div>
						</div>
						<div class="form-group">
							<!-- Button -->
							<div class="col-sm-3 col-sm-offset-2">
								<input type="submit" value="수정" class="btn btn-success" />
							</div>
						</div>
					</fieldset>
				</form>
			</div>
</body>
</html>