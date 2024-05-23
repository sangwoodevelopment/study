package sort;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {77,19,22,23,7,4,5};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				System.out.println("i:"+i+",j:"+j+",arr[j]="+arr[j]+",arr[j+1]="+arr[j+1]);
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}
