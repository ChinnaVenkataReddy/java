package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGenric {
	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		
		l.add("a");
		l.add(null);
		//l.add(10);
		method(l);
		System.out.println(l);
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
			
		}
		
	}

	private static void method(ArrayList l) {
		l.add(10);
		l.add(15);
	}

}
