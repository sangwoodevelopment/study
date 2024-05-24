package recursion;

public class RecursionExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {55,88,77,99,100};
		System.out.println(sumArr(arr, arr.length));
	}
	public static int sumArr(int[] arr,int size) {
		if(size<=0) {
			return 0;
		}else {
			System.out.println(arr[size-1]);
			return sumArr(arr, size-1)+arr[size-1];
		}
	}
}
