package arrays;

import java.util.Arrays;

public class FindDuplicates {

	public static void findDuplicate(int[] arr, int length) {
		int count = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					

					System.out.println(arr[j]);
					
					count++;
				}
			}

		}
		System.out.println("number of duplicate elements are:"+count);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 2, 3,1 };
		int length = arr.length;
		System.out.println("the duplicate elements are:");
		findDuplicate(arr, length);

	}

}
