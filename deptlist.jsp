<%@page import="com.multi.erp.dept.DeptDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<%
		ArrayList<DeptDTO> deptlist = (ArrayList<DeptDTO>)request.getAttribute("deptlist");
	%>
			<div >
				<h3>부서목록</h3>
				<div style="padding-top: 30px">
					
					<table class="table">
						<thead>
							<tr>
								<th>부서번호</th>
								<th>부서명</th>
								<th>부서생성일</th>
								<th>부서레벨</th>
								<th>부서스텝</th>
								<th>상위부서번호</th>
								<th>업무분류</th>
								<th>관리자</th>
								<th>부서주소</th>
								<th>전화번호</th>
								<th>삭제</th>
							</tr>
						</thead>
						<tbody>
							<%for (DeptDTO dept:deptlist){ %>
								<tr>
									<td><a href="/erp/dept/read.do?deptno=<%=dept.getDeptno() %>&action=READ"><%=dept.getDeptno() %></a></td>
									
									
									<td><%=dept.getDeptname() %></td>
									<td><%=dept.getDeptStartDay() %></td>
									<td><%=dept.getDeptlevel() %></td>
									<td><%=dept.getDeptstep() %></td>
									<td><%=dept.getDeptuppercode() %></td>
									<td><%=dept.getJob_category() %></td>
									<td><%=dept.getMgr_id() %></td>
									<td><%=dept.getDeptaddr() %></td>
									<td><%=dept.getDepttel() %></td>
									<td><a
										href="/erp/dept/delete.do?deptno=<%=dept.getDeptno()%>">삭제</a></td>
								</tr>
							<%} %>
						</tbody>
					</table>
				</div>
			
			</div>
</body>
</html>
