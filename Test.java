package datastructor;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("숫자3개입력");
		System.out.println("숫자1");
		int num1 = key.nextInt();
		System.out.println("숫자2");
		int num2 = key.nextInt();
		System.out.println("숫자3");
		int num3 = key.nextInt();
		
		int max = num1;
		if(num2>max) {
			max = num2;
		}
		if(num3>max) {
			max = num3;
		}
		System.out.println("최대값=>"+max);
	}

}
