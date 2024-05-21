package datastructor;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr= {100,20,40,88,99,78};
		//int[] myarr2 = myarr;//얕은복사
		int[] myarr2 = myarr.clone();//깊은복사 - 독립적인 배열을 생성
		myarr2[2] = 70;
		System.out.println("myarr=>"+Arrays.toString(myarr));
		System.out.println("myarr2=>"+Arrays.toString(myarr2));
		System.out.println(myarr==myarr2);
		System.out.println(Arrays.equals(myarr, myarr2));
		
		Arrays.sort(myarr);
		System.out.println("myarr=>"+Arrays.toString(myarr));
		
		//배열의 값을 복사
		//특정배열에서 index사이의 배열요소를 복사해서 다른 배열로 리턴
		//myarr에서 1번 index에서 4번index사이의 배열요소를 새로운 배열로 리턴
		int[] otherArr = Arrays.copyOfRange(myarr, 1, 4);
		System.out.println("myarr=>"+Arrays.toString(otherArr));
		/*binarySearch
		 * 매개변수로 전달받은 배열에서 특정 값의 위치값을 반환
		 * => 내부적으로 이진 검색 알고리즘을 사용해서 검색
		 * => 이진검색 알고리즘을 내부에서 사용하므로 사용전에 정렬 되어 있어야 제대로 동작
		*/
		System.out.println(Arrays.binarySearch(myarr, 100));
	}

}
