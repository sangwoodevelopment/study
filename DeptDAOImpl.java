package com.multi.erp.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl implements DeptDAO{
	private JdbcTemplate template;
	@Autowired
	public DeptDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int insert(DeptDTO dept) {
		// TODO Auto-generated method stub
		String sql = "insert into dept values(?,?,?,null,?,?,?,?,?,?,?)";
		return template.update(sql, dept.getDeptno(), dept.getDeptname(), dept.getDeptStartDay(),
				dept.getDeptlevel(),dept.getDeptstep(),dept.getDeptuppercode()
				,dept.getJob_category(),dept.getMgr_id(),dept.getDeptaddr(),dept.getDepttel());
	}

	@Override
	public List<DeptDTO> select() {
		// TODO Auto-generated method stub
		return template.query("select * from dept", new DeptRowMapper());
	}

	@Override
	public int delete(String deptno) {
		// TODO Auto-generated method stub
		return template.update("delete from dept where deptno=?",deptno);
	}

	@Override
	public DeptDTO read(String deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(DeptDTO dept) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
