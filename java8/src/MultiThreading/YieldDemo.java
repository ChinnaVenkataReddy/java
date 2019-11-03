package MultiThreading;

public class YieldDemo {
	public static void main(String[] args) {
		
	
	Runnable r=()->{
		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println(" child");
		}
		
	};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main ");
		}
		
	}
}

