package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//1. setter메소드를 이용해서 멤버변수를 셋팅하기
//		MemberDAO dao = new MemberDAO();
//		Insa insa = new InsaImpl();
//		insa.setDao(dao);
		
		//2. 생성자를 이용해서 멤버변수를 셋팅
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/constructor.xml");
		Insa insa = (Insa)factory.getBean("insa");
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}
