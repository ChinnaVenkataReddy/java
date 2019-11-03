package serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Custom  implements Serializable{
	String user="chinna";
	transient String pswd=" honey";
			
private void writeObject(ObjectOutputStream os)throws Exception {
	os.defaultWriteObject();
	String p="123"+pswd;
	os.writeObject(p);
	
}
private void readObject(ObjectInputStream oi)  throws Exception{
	oi.defaultReadObject();
	String p=(String)oi.readObject();
	pswd=p.substring(3);
	       
}
}
