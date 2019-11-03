package Oops;

public class Overloading {
	
	public void m() {
		System.out.println("m");
	}
	

	public void m(int x) {
		System.out.println("int m");
	}
	
	
	public void m(double x) {
		System.out.println("d m");
	}
	
	public void m(Float f) {
		System.out.println("f m");
	}

	
	public static void main(String[] args) { 
		
		Overloading o=new Overloading();
		o.m();
		o.m(15.6);
		o.m(10);
		o.m('a');
		
		
	}
	
	
}
