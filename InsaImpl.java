package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	String msg;
	public InsaImpl() {
		System.out.println("기본생성자 - InsaImpl");
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("매개변수1개생성자 - InsaImpl");
	}
	

	public InsaImpl(MemberDAO dao, String msg) {
		super();
		this.dao = dao;
		this.msg = msg;
		System.out.println("매개변수2개생성자 - InsaImpl");
	}

	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
