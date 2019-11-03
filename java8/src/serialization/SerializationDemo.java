package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static void main(String[] args) throws Exception {
	SerAndDesr sd = new SerAndDesr();
	
	FileOutputStream fo=new FileOutputStream(" abc.ser");
	ObjectOutputStream oo=new ObjectOutputStream(fo);
	oo.writeObject(sd);
	
	FileInputStream fi=new FileInputStream(" abc.ser");
	ObjectInputStream oi=new ObjectInputStream(fi);
	
	/*SerAndDesr ds=(SerAndDesr)oi.readObject();
	System.out.println(ds.i);
	System.out.println(ds.j);*/
	
	// if we dont know the serialization order
	
	Object o = oi.readObject();
	
	if(o instanceof SerAndDesr) {
		SerAndDesr ds= (SerAndDesr)o; 
	
	}
}
}
