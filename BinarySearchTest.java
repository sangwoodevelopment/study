package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("찾을숫자:");
		int searchValue = key.nextInt();
		
		int[] arr = {77,19,22,23,7,4,5,33};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int result = search(arr, searchValue);
		if(result==-1) {
			System.out.println("찾는 데이터가 없습니다");
		}else {
			System.out.println("데이터위치:"+result);
		}
	}
	public static int search(int[] arr,int searchValue) {
		int searchIndex =-1;
		int result = 0;
		int startIndex = 0;
		int endIndex = arr.length-1;
		int mediumIndex = 0;
		while(startIndex<=endIndex) {
			mediumIndex = (startIndex+endIndex)/2;
			System.out.println(startIndex+","+mediumIndex+","+endIndex);
			if(arr[mediumIndex]== searchValue) {
				searchIndex = mediumIndex;
				break;
			}else if(arr[mediumIndex]>searchValue) {
				endIndex = mediumIndex -1;
			}else {
				startIndex = mediumIndex +1;
			}
		}
		
		return searchIndex;
	}

}
