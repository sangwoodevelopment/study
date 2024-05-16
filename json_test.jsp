<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		//자바스크립트에서 json객체 (자바스크립트의 사용자정의객체와 유사)
		let person = {
			"singlist" : [ {
				"no" : "1",
				"year" : "2020",
				"title" : "다이너마이트"
			}, {
				"no" : "2",
				"year" : "2016",
				"title" : "불타오르네"
			}, {
				"no" : "3",
				"year" : "2016",
				"title" : "봄날"
			} ],
			"subject" : [ "자바", "스프링", "하둡", "안드로이드" ],
			"name" : "방탄소년단",
			"id" : "bts",
			"age" : "30"
			]
		}
			"score":{
				"mnet" : "1",
				"mbc" : "1";
			},
			"name" : "방탄소년단",
			"id" : "bts",
			"age" : "30";
			
		}
		
		alert(person);
		document.write("<h3>"+person.name+"</h3>");
		document.write("<h3>"+person.id+"</h3>");
		document.write("<h3>"+person.age+"</h3>");
		document.write("<h3>"+person.score.mnet+"</h3>");
		document.write("<h3>"+person.score.mbc+"</h3>");
		//jsonarray는 
		document.write("<h3>"+person.subject[0]+"</h3>");
		document.write("<h3>"+person.subject[2]+"</h3>");
		document.write("<h3>"+person.singlist[2].title+"</h3>");
		
		alert(person.singlist.length);	//문자열
		let jsonObj = JSON.parse(deptlist);
		
		alert(deptlist.dept.length);
	</script>
</body>
</html>