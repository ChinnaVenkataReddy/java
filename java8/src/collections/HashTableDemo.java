package collections;

import java.util.Hashtable;

public class HashTableDemo {
	public HashTableDemo(int i) {
		this.i = i;
	}

	int i;

	@Override
	public String toString() {
		return i+" ";
		
	}
	public int hashCode() {
		return i;
	}
	
	public static void main(String[] args) {
		Hashtable h=new Hashtable(25);
		h.put(new HashTableDemo(5)," chinna");
		h.put(new HashTableDemo(15)," honey");
		h.put(new HashTableDemo(52)," lippi");
		h.put(25, " demo");
		System.out.println(h);
		
	}

}
