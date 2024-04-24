package app2;

public class MyBeanStyleA implements MyBeanStyle{
	@Override
	public void testHello(String name) {
		System.out.println("hello..."+name+"!!!");
	}
}
