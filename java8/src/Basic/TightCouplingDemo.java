package Basic;

public class TightCouplingDemo {
	public void method() {
		Test.add();
	}
	Test t=new Test();
	
}
