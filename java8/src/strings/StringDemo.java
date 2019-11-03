package strings;

public class StringDemo {
	
	public static void main(String[] args) {
		String s=new String(" chinna");
		String ss=new String("chinna");
		String s1="chinna";
		String s2="chinna";
		s.concat("honey");
		System.out.println(s);
		System.out.println(s.equals(ss));
		System.out.println(s==ss);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb=new StringBuffer(" chinna");
		sb.append("honey");
		System.out.println(sb);
		
		
		
		String string ="chinna";
		String string2 = string.concat("honey");
		System.out.println(string.hashCode()+" "+string2.hashCode());
		
		
	}

}
