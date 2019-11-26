package arrays;

public class IfArrayContainsValueOrNot {
	
	public static boolean contains(int arr[],int input) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==input)
				return true;
			
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int input=0;
		
		boolean result = contains(arr,input);
		System.out.println(result);
		
	}

}
