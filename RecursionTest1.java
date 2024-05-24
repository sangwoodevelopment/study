package recursion;

public class RecursionTest1 {
	public void test(int count) {
		if(count<=0) {
			return;//void메소드에서 return; 하면 메소드 실행을 종료하고 호출한 곳으로 되돌아간다
		}
		System.out.println("재귀알고리즘...");
		test(count-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionTest1 obj = new RecursionTest1();
		obj.test(5);
		System.out.println("end");
	}

}
