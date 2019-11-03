package MultiThreading;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Runnable r=()-> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<5;i++) {
				System.out.println(" child");
			}
			
		};
		
		Thread t=new Thread(r);
		t.start();
		t.join();
		for(int i=0;i<5;i++) {
			System.out.println(" main");
		}
		
	}

}
