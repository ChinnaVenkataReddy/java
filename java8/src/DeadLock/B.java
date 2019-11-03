package DeadLock;

public class B {
	public synchronized void bar(A a) {
		System.out.println(" thread 2 exection of bar()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}System.out.println(" thread 2  trying to call a.last()");
		a.last();
		
	}
	public synchronized void last() {
		System.out.println(" this is last() in B");
		
	}

}
