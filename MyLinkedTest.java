package datastructor.linked;

public class MyLinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("사과");
		list.add("배");
		list.add("바나나");
		list.printAll();
		
		list.insert(2,"수박");
		list.printAll();
		
		list.remove(1);
		list.printAll();
	}

}
