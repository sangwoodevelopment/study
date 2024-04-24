package basic;
public class MemberDAO {
	public void add(MemberDTO user){
		System.out.println("db에 insert하기");
	}
	public MemberDTO getUser(String id){
		System.out.println("사용자정보 가져오기 - db에서 조회");
		return null;
	}
}