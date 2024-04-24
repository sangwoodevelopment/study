package app1;

/*
 * 결합도가 극도로 높은 프로그램
 * => 클래스결합도가 높고 의존성이 높다. 사용하는 클래스가 변경되면 이 클래스를 이용해서 작업하는 클래스와 메소드가 변경되어야 한다
 * => OOP특성이 적용되지 않았다
 * => 상위인터페이스와 구현체(상위인터페이스를 상속 받아서 실제 코드를 구현해놓은 클래스 - 하위클래스)를 분리하지 않았다
 *    ----------------------------------------------------------------------
 *    	다형성을 적용하지 않았다
*/
//MyBeanTest는 MyBeanStyle~~ 클래스를 사용하는 클래스로 지금 한 개의 클래스에 메소드를 3개를 구현했지만 더 많을 수 있다
public class MyBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
		change(obj);
	}
	public static void run(MyBeanStyleA obj) {
		System.out.println("=================");
		obj.testHello("BTS");
		System.out.println("=================");
	}
	public static void show(MyBeanStyleA obj) {
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
	}
	public static void change(MyBeanStyleA obj) {
		System.out.println("*****************");
		obj.testHello("BTS");
		obj.testHello("BTS");
		System.out.println("*****************");
	}

}
