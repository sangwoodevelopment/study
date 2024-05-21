package basic;

import java.util.Scanner;

//시간복잡도 테스트 - 빅오표기법
//빅오표기법은 최악의 경우를 체크하는 표기법으로 불필요한 연산을 제거해서 알고리즘 분석을 쉽게 하기 위한 목적으로 사용
//시간복잡도 - 실행되는 연산의 횟수(cpu의 처리속도)
//공간복잡도 - 실행될때 사용하는 메모리
public class SearchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int[] numArr = {20,40,60,70,90};
		System.out.print("숫자입력:");
		int searchNum = key.nextInt();
		
		//[출력형태]
		//숫자입력:20
		//1회에 찾기 성공 O(n)
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i]==searchNum) {
				System.out.println((i+1)+"회에 찾기 성공");
			}
		}
	}

}
