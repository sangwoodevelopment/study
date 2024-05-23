package sort;

import java.util.Arrays;

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,5,2,4,8,9};
		
		System.out.println(Arrays.toString(num));
		int temp = num[1];
		num[1] = num[4];
		num[4] = temp;
		System.out.println(Arrays.toString(num));
		
	}

}
