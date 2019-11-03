package Oops;

public class OverloadingDemo {
	
	public void m(int x,float y) {
		System.out.println(" int -float");
	}
	public void m(float x,int y) {
		System.out.println(" int -float");
	}
public static void main(String[] args) {
	OverloadingDemo o=new OverloadingDemo();
			o.m(10,10.5f);
			o.m(10.5f, 5);
	
}

}
