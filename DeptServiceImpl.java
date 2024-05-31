package com.example.erp.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DeptServiceImpl implements DeptService{
	DeptDAO dao;
	@Autowired
	public DeptServiceImpl(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int insert(DeptDTO dept) {
		return dao.insert(dept);
	}

	@Override
	public List<DeptDTO> select() {
		return dao.select();
	}

	@Override
	public int delete(String deptno) {
		return dao.delete(deptno);
	}

	@Override
	public DeptDTO read(String deptno) {
		return dao.read(deptno);
	}

	@Override
	public int update(DeptDTO dept) {
		// TODO Auto-generated method stub
		return dao.update(dept);
	}

}
