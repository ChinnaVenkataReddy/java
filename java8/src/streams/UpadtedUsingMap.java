package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpadtedUsingMap {
	
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l.add(i);
		}
		System.out.println(l);
		List<Integer> list = l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(list);

	}
}
