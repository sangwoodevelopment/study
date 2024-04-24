package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl() {
		
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
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
