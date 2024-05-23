package search;

import java.util.Scanner;

public class SequenceSearch_SentinelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int searchValue = key.nextInt();
		int[] arr = {77,19,22,23,7,4,5,searchValue};
		System.out.println("=====size"+arr.length);
		System.out.print("찾을 숫자:");
		
		long start = System.nanoTime();
		int result = search(arr, searchValue);
		long end = System.nanoTime();
		System.out.println("걸린시간:"+(end-start));
		//찾는 숫자는 배열에서 6번 위치에 있습니다.
		//찾는 숫자는 배열에 없습니다.
		if(result==arr.length-1) {
			System.out.println("찾는 데이터가 없습니다");
		}else {
			System.out.println("데이터위치:"+result);
		}
	}
	//searchValue의 위치를 리턴, 없으면 -1을 리턴하기
	public static int search(int[] arr,int searchValue) {
		int result = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==searchValue) {
			result=i;
			break;
		}
	}
		return result;
	}
	
}
