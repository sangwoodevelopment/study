package app2;

public class MyBeanStyleB implements MyBeanStyle{
	@Override
	public void testHello(String name) {
		System.out.println("안녕하세요..."+name+"님!!!");
	}
}
