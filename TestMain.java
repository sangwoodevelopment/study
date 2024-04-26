package di.constructor.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ArticleDTO dto = new ArticleDTO();
		dto.setName("백엔드");
		dto.setTitle("스프링");
		dto.setContent("의존성 주입");
		dto.setDate("2024-04-26");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/constructor.xml");
		IWriteArticleMgr mgr = factory.getBean("Manager",IWriteArticleMgr.class);
		mgr.write(dto);
	}
}
