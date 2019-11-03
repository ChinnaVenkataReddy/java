package strings;

public class InternDemo {
	public static void main(String[] args){
		String s=new String("chinna");
		String s1 = s.intern();
		System.out.println(s==s1);
		String s2="chinna";
		System.out.println(s2==s1);
		
	}
}
