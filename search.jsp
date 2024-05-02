<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-10">
				<h1>주소로검색하기</h1>
				<hr/>
				<form method="post" action="/serverweb/mvc/search.do">
					검색어:<input type="text" name="search">
					<input type="submit" value="검색">
				</form>
			</div>
		</div>
	</div>



	
</body>
</html>