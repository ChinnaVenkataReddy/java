package Oops.Inheritence;

public class InheritenceDemo {
	public static void main(String[] args) {
		Parent p=new Parent();
		
		p.method1();
		
		Child c=new Child();
		c.method1();
		c.method2();
		
		Parent pp=new Child();
		pp.method1();
		
	//	Child cc-new Parent();
		
		
	}
	
	

}
