package Basic;

public class StaticVariable {
	int i=10;
static int j=10;
void method() {
	 final int x;
	
	
}

public static void main(String[] args) {
	
	StaticVariable s=new StaticVariable();
	System.out.println(s.i+" "+ s.j);	
	s.i=11;
	s.j=11;
	System.out.println(s.i+" "+ s.j);	

	StaticVariable ss=new StaticVariable();
	System.out.println(ss.i+" "+ss.j);
	
	
	
}

}
