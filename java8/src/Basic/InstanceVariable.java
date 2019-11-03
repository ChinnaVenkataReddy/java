package Basic;

public class InstanceVariable {
	int i=10;
public void method() {
	System.out.println(i);
}
	public static void main(String[] args) {
		InstanceVariable in=new InstanceVariable();
		in.i=11;
		System.out.println(in.i);
		InstanceVariable ii=new InstanceVariable();
		System.out.println(ii.i);
		
	}

}
