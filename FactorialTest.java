package recursion;

public class FactorialTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println("=============================");
		int sum=1;
		for(int i=1; i<=5; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
	}
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		return factorial(num-1) * num;
	}

}
