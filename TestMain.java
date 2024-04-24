package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. setter메소드를 이용해서 멤버변수를 셋팅하기
		MemberDAO dao = new MemberDAO();
//		Insa insa = new InsaImpl();
//		insa.setDao(dao);
		
		//2. 생성자를 이용해서 멤버변수를 셋팅
		Insa insa = new InsaImpl(dao);
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}
