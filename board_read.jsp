<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<title>인사관리시스템</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	
	
		$(document).ready(function(){
			let category = "${board.category}";
			$("#category").val(category).attr("selected","selected");
		});
	
	</script>
</head>
<body>

	<form class="form-horizontal" 
		action="" 
		method="post" >

		
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="id" class="control-label">번호</label>
			</div>
			<div class="col-md-8">${board.board_no }</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="id" class="control-label">게시글종류</label>
			</div>
			<div class="col-md-3">
				<select name="category" class="form-control" 
							id="category">
					<option value="경조사" >경조사</option>
					<option value="사내소식">사내소식</option>
					<option value="게시판">게시판(익명)</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="id" class="control-label">작성자</label>
			</div>
			<div class="col-md-8">${board.id }</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">제목</label>
			</div>
			<div class="col-md-8">${board.title}</div>
		</div>
		
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">첨부파일</label>
			</div>
			<div class="col-md-8">
				<!-- 디비에 저장된 파일명을 출력  -->
				<c:forEach var="file" items="${boardfiledtolist }">
					<h4>
						<a href="/erp/board/download/${board.id}/${board.board_no}/${file.board_file_no}">
						${file.originalFilename }</a></h4>
					<img src="/erp/upload/${ file.storeFilename}" width="200">
				</c:forEach>
			</div>
		</div>
		
		
		
		
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">작성날짜</label>
			</div>
			<div class="col-md-8">${board.write_date }</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="text" class="control-label">내용</label>
			</div>
			<div class="col-md-8"
				style="width: 500px; height: 400px; border: solid 1px;">
				${board.content }
				</div>
		</div>

		<div class="form-group">
			<div class="col-md-10 text-center">
				
				<button type="button" class="btn btn-danger btn-lg"
					onclick="location.href='/erp/board/list?category=all'">
					<i class="fa fa-fw fa-close"></i> 목록
				</button>
				<c:if test="${board.id==user.id }">
					<input type="button" class="btn btn-lg btn-primary" 
					value="수정"
					onclick="location.href='/erp/board/read?board_no=${board.board_no}&action=UPDATE'">
					
					<button type="button" class="btn btn-danger btn-lg"
						id="deletebtn">
						<i class="fa fa-fw fa-close"></i> 삭제
					</button>
				</c:if>
			</div>
		</div>
	</form>

</body>
</html>