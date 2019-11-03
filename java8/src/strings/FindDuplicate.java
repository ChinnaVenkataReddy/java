package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicate {
	static void find(String s) {
		String[] str = s.split(" ");
		HashMap<String,Integer> h=new HashMap<>();
	for(String temp:str) {
		if(h.get(temp)!=null) {
			h.put(temp,h.get(temp)+1);
		}
		else {
			h.put(temp, 1);
		}
			
			
		}
		//System.out.println(h);
		/*for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
	Iterator<String> itr = h.keySet().iterator();
	while(itr.hasNext()) {
		String ss = itr.next();
		if(h.get(ss)>1) {
			System.out.println(" the word "+ss+" occurs "+h.get(ss));
		}
	}
}
	static void findChar(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(hm.get(c)!=null) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm); 
		
	}
	public static void main(String[] args) {
		find("i am am java dev dev");
		//findChar("java j2ee");
	}

}
