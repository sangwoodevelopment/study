<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="result1"></div>
<div id="result2"></div>
<div id="result3"></div>
<div id="result4"></div>
	<script type="text/javascript">
		//텍스트형식으로 json이 전달되는 경우
		let deptlist = '{"dept":' 
			+'[{"code":"001","name":"정보시스템팀","loc":"4층"},'
			+'{"code":"002","name":"시스템지원팀","loc":"7층"},'
			+'{"code":"003","name":"기업영업팀","loc":"6층"},'
			+'{"code":"004","name":"전산실","loc":"5층"}'
			+']'	
			+ '}';
		alert(deptlist);
		//문자열로 json이 전달된 경우 자바스크립트의 JSON파서를 이용해서 파싱해서 JSON객체를 만들고 작업
		let jsonObj = JSON.parse(deptlist);
		alert(jsonObj);
		alert(jsonObj.dept.length);
		//각 부서의 부서명을 result1,result2,result3,result4에 출력하기
		
	</script>
</body>
</html>