package Basic;

public class NewinstanceDemo {
	
	public static void  create(String s) throws Exception {
		Object o = Class.forName(s).newInstance();
		System.out.println(o.getClass().getName());
	}
	public static void main(String[] args) throws Exception {
		create("A");
		
		
	}
}
