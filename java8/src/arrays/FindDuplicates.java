package arrays;

public class FindDuplicates {
	public static void printDuplicate(int arr[],int n) {
	for(int i=0;i<n;i++) {
		int index=arr[i]%n;
		arr[index]+=n;
		
	}
	for(int i=0;i<n;i++) {
		if((arr[i]/n)>1) {
			System.out.println(i);
		}
		
	}
	
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,5,6,3};
		int n=arr.length;
		System.out.println(" duplicate elements are:");
		printDuplicate(arr,n);
	}

}
