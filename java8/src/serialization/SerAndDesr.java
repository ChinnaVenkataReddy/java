package serialization;

import java.io.Serializable;

public class SerAndDesr implements Serializable {
	final  transient int i=10;
	int j=20;
	
	public static void main(String[] args) {
		SerAndDesr s = new SerAndDesr();
		
		System.out.println(s instanceof SerAndDesr);
		
	}
	
	

}
