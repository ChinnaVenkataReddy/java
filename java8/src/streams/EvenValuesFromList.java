package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenValuesFromList {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l.add(i);
		}
		
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(l2);
		Object[] array = l2.toArray();
		List<Object> ll = Arrays.asList(array);
		System.out.println(ll);
		
		System.out.println(Arrays.toString(array));
	}

}
