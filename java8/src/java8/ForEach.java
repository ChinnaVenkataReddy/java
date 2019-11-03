package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ForEach {
	public static void main(String[] args) {
		 ArrayList<Integer> l=new ArrayList();
		 l.add(12);
		 l.add(22);
		 l.add(23);
		 
		/* for(int i:l) {
			 System.out.println(i); 
		 }*/
		/* Iterator<Integer> it = l.iterator();
		 while(it.hasNext()) {
			 Integer i = it.next();
			 System.out.println(i);
		 }
		 */
		 
      l.forEach(list->System.out.println(list));
		 
		 Map<Integer,String> m=new HashMap();
		 m.put(1, " chinna");
		 
		 m.put(2, " venkata");
		 m.put(3, " reddy");
		 
		/*for(Map.Entry entry :m.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}*/
		
		 m.forEach((key,value)->{
			 System.out.println(key+" "+value);
		 });
	}

}
