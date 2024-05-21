package datastructor;

import java.util.Arrays;
import java.util.Random;

public class ArrayExam {
	public static void main(String[] args) {
		int[] myarr = new int[1000];
		Random rand = new Random();
		
		for(int i=0;i<myarr.length;i++) {
			myarr[i] = rand.nextInt(1000)+1;
			
		}
		System.out.println(Arrays.toString(myarr));
		int max = myarr[0];
		for(int num:myarr) {
			if(num>max) {
				max = num;
			}
		}
		System.out.println("max=>"+max);
		
		int count = 0;
		for(int num:myarr) {
			if(num==max) {
				count++;
			}
		}
		System.out.println("최대값의 갯수=>"+count);
	}
}
