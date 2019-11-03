package Basic;

public class VarArgMethod {
	public static void method(int... x) {
		System.out.println(" vararg");
		
	}
	static void method1(int x ,int... y) {
		System.out.println(" double");
	}
	public static void main(String[] args) {
		/*method();
		method(0);
		method(10);
		method(10,10); */
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}

}
