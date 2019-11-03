package Generics;

public class GenericsClassTest {
	public static void main(String[] args) {
		GenricClass<Integer> g1=new GenricClass<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());
		
		GenricClass<String> g2=new GenricClass<String>(" chinna");
		g2.show();
		System.out.println(g2.getObject());
		
		
		GenricClass<Number> g3=new GenricClass<Number>(22);
		
		//GenricClass<Long> g4=new GenricClass<Long>();
		GenricClass<Character> g4=new GenricClass<Character>('c');
	}

}
