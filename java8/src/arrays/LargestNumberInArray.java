package arrays;

import java.util.Arrays;

public class LargestNumberInArray {
	static void  largest(int arr[]) {
	
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
	
		System.out.println(max);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,25,56};
		/*int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);*/
		largest(arr);
		
		
	}

}
