package app2;

/*
 * OOP 특성을 적용해서 변경
 * 클래스명, 메스도명, 구조 ... 모두 변경 가능
 * => 객체를 변경해도 이 객체를 활용하는 클래스나 기존의 메소드는 변경하지 않아도 잘 동작한다
 * => 그러나 ... 객체를 사용하기 위해서 생성하는 코드는 객체가 바뀌면 변경해야 한다
*/
public class MyBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBeanStyle obj = new MyBeanStyleA();
		run(obj);
		show(obj);
		change(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("=================");
		obj.testHello("BTS");
		System.out.println("=================");
	}
	public static void show(MyBeanStyle obj) {
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
		obj.testHello("BTS");
	}
	public static void change(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.testHello("BTS");
		obj.testHello("BTS");
		System.out.println("*****************");
	}

}
