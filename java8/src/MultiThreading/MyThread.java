package MultiThreading;

public class MyThread extends  Thread {



DisplayOfSync d;
String name;
public MyThread(DisplayOfSync d, String name) {
	super();
	this.d = d;
	this.name = name;
}


	@Override
	public void run() {
		d.display(name);
		
	}
	

}
