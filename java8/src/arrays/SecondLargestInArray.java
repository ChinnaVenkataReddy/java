package arrays;

import java.util.Arrays;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,25,56,87,21,33};
		int n=arr.length;
		/*int largest=arr[0];
		int second=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				second=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>second) {
				second=arr[i];
			}
		}
		System.out.println(second);*/
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int res=arr[n-2];
		System.out.println(res);
		
	}

}
