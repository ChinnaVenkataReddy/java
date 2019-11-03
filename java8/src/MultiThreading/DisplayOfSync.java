package MultiThreading;

public class DisplayOfSync {
	public synchronized void display(String name)  {
		for(int i=0;i<5;i++) {
			System.out.println(" gm:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(name);				
			}
			
		}
	}

}
