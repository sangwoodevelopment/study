package recursion;

import java.util.Scanner;
//배열에 저장하고 리턴
//배열에 저장된 걸 꺼내서 출력할 수 있도록 작업
//배열은 static멤버변수로 정의
public class FibonacciRecursionTest_Memoization {
	static int[] myarr;
	public static int getFibonacci(int count) {
		if(myarr[count]>0) {
			return myarr[count];
		}
		if(count==1 | count==2) {
			return myarr[count] = 1;
		}else {
			return myarr[count] = getFibonacci(count-2)+getFibonacci(count-1);
		}
		//return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		myarr = new int[num+1];
		getFibonacci(num);
		for(int i=1; i<=num;i++) {
			System.out.print(myarr[i]+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}
	}

}
