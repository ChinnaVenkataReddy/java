package strings;

public class Cloing implements Cloneable {
	int i=20;
	int j=10;
	public static void main(String[] args) throws CloneNotSupportedException {
		Cloing c = new Cloing();
		Cloing c1=(Cloing)c.clone();
		c1.i=25;
		c1.j=35;
		
	}

}
