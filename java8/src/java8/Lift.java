package java8;

public class Lift {
	 static int  floor=0,person=0,choice1;
public static void main(String[] args) {
	
	floor=(int) (Math.random()*10+1);
	System.out.println(" the elevator is on floor"+floor);
	System.out.println(" which floor are u at now:");
	//choice1=Keyboard.readInt();
	if(floor==choice1) {
		System.out.println(" enter the elevator");
	}
	else if (floor<choice1){
		liftUp();
		
	}
	else if(floor>choice1) {
		liftDown();
	}
	System.out.println(" whic floor u want to go:");
	//choice1=keyboard.readInt();
	if(floor>choice1) {
		liftDown();
		
	}
	else if(floor<choice1) {
		liftUp();
	}
	
}
public static void liftUp() {
for(person=choice1;choice1>=floor;floor++) {
	System.out.println(" floor");
	System.out.println(" the elevator arraived");
	
}
	
}
public static void liftDown() {
	for(person=choice1;choice1<=floor;floor--) {
		System.out.println(" floor");
		System.out.println(" lift arrived");
	}
	
}


}
