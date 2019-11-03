package DeadLock;

public class DeadLockDemo implements Runnable {
	A a=new A();
	B b=new B();
	DeadLockDemo(){
		Thread t=new Thread(this);
		t.start();
		a.foo(b);
	}

	@Override
	public void run() {
b.bar(a);		
	}
	public static void main(String[] args) {
		new DeadLockDemo();
	}
	 
}
