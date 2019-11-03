package java8;

import java.util.ArrayList;
import java.util.Comparator;

public class Collections {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l.add(i);
		}
		
		Comparator<Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
		System.out.println(l);
		java.util.Collections.sort(l,c);
		System.out.println(l);
		
	}

}
