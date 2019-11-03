package java8;

import java.util.Random;

public class RandomOrder {
	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();
		for(int i=1;i<100;i++) {
		Integer randomNumber = r.nextInt(100);
		System.out.print(randomNumber+" ");
		}
		
	}
	

}
