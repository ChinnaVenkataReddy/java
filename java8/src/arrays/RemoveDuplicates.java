package arrays;

public class RemoveDuplicates {
	static int remove(int arr[],int n) {
		if(n==0||n==1) {
			return n;
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				temp[j++]=arr[n-1];
			}
		
		}
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,5,2,1,6,7};
	int n=arr.length;
	n=remove(arr,n);
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		
	}
}

}
