package arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingSet {
	public static void remove(int arr[]) {
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,3,5,6};
		remove(arr);
	}

}
