package recursion;

import java.util.Scanner;

public class FibonacciRecursionTest {
	public static int getFibonacci(int count) {
		int result = 0;
		if(count==1 | count==2) {
			result = 1;
		}else {
			result = getFibonacci(count-2)+getFibonacci(count-1);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		for(int i=1; i<=num;i++) {
			System.out.print(getFibonacci(i)+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}
	}

}
