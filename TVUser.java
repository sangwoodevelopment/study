package exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		
		TV tv = (TV)factory.getBean("tv");
		tv.turnOff();
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
	
		
//		LgTV lgtv = new LgTV();
//		lgtv.turnOn();
//		lgtv.soundUp();
//		lgtv.soundDown();
//		lgtv.turnOff();
	}

}
