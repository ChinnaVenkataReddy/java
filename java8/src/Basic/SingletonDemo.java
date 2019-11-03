package Basic;

public class SingletonDemo {
	
	public static SingletonDemo s=null;
	private SingletonDemo() {
		
	}
	public static SingletonDemo getInstance() {
		if(s==null) 
			return s=new SingletonDemo();
		return s;
		
	}
	public static void main(String[] args) {
		SingletonDemo s1 = getInstance();
		SingletonDemo s2 = getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==(s2));
	}

}
