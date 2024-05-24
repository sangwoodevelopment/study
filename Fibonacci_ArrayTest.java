package recursion;

import java.util.Arrays;
import java.util.Scanner;

//피보나치수열을 배열로 처리
//피보나치
//첫째와 둘째 항이 1로 표현 i-1, i-2의 합으로 구성
//5
//1 1 2 3 5
public class Fibonacci_ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<num; i++) {
			arr[i] = arr[i-2]+arr[i-1];
		}
		System.out.println(Arrays.toString(arr));
	}

}
