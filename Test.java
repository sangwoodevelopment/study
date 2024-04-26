package di.constructor.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/constructor.xml");
		MyService bean = factory.getBean("service", MyService.class);
		
	}

}
