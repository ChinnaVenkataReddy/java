package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TypeSafe {
	public static void main(String[] args) {
		String [] s=new String[2];
		s[0]="chinna";
		s[1]="honey";
		//s[2]=new Integer(10);
		String name=s[0];
		System.out.println(name);
		/*for(String str:s) {
			str.getBytes();
			System.out.println(str);
		}*/
		
		ArrayList l=new ArrayList();
		l.add("chinna");
		l.add(" honey");
		
		String s1 =(String) l.get(1);
		
		/*Iterator itr = l.iterator();
		while(itr.hasNext()) {
			 String ss= (String)itr.next();
			 System.out.println(ss);
		}*/
		
	}

}
