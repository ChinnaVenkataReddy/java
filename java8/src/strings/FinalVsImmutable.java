package strings;

public class FinalVsImmutable {
	
	public static void main(String[] args) {
		
		final StringBuffer sb=new StringBuffer("Chinna");
		sb.append("Venkata Reddy");
		System.out.println(sb);
		//sb=new StringBuffer("lippi"); final only for variable ,if we declare then,
		// we cant change to that reference but we can do the changes to main object
		
		
		StringBuffer s=new StringBuffer("java");
		s.append("developer").insert(s.length(), " at iqvia");
		System.out.println(s);
		
		
		
	}

}
