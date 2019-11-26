package arrays;

public class ArrayElementAssignment {
	public static void main(String[] args) {
		
		int[] a=new int[10];
		a[0]=10;
		//a[1]=1.56;
		byte b='a';
		a[1]=b;
		char c='c';
		a[2]=c;
		
		Object[] o=new Object[5];//only allow child classes
		o[0]=new Integer(10);
		
		o[1]=new String("chinna");
		
		
		
		Runnable[] r=new Runnable[5];
		r[0]=new Thread();
		//r[1]=new String("chinna");  if it is interface array ,only allow child clasees
		
	}

	
	
	
}
