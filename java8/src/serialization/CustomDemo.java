package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomDemo {
	public static void main(String[] args) throws Exception {
		Custom c = new Custom();
		FileOutputStream fo=new FileOutputStream(" abc.ser");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(c);
		
		FileInputStream fi=new FileInputStream(" abc.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Custom cc=(Custom)oi.readObject();
		System.out.println(cc.user+":"+cc.pswd);
	}

}
