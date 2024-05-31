package com.example.erp.dept;

import java.util.List;


public interface DeptDAO {
	//List<DeptDTO> getDeptName();
	//부서저장
	int insert(DeptDTO dept);
	//전체사원목을 조회하는 메소드
	public List<DeptDTO> select();
	public int delete(String deptno);
	public DeptDTO read(String deptno);
	int update(DeptDTO dept);
	//하위부서를 조회하기 위한 메소드
	//public List<DeptDTO> getSubDeptlist(String uppercode);
}
