package Basic;

public class UnIntializedArray {
	int[] n;
	static int [] m;
public static void main(String[] args) {
	UnIntializedArray ui=new UnIntializedArray();
	System.out.println(ui.n);
	//System.out.println(ui.n[0]);
	System.out.println(m);
	//System.out.println(m[0]);
	
	int x='A';
	int y=10;
	System.out.println(x);
	byte bb=(byte)y;
	System.out.println(bb);
	
	
int a,b,c,d;
a=b=c=d=20;
System.out.println(a+" "+b+" "+c+" "+d);
int i=10;
i+=5;
System.out.println(i);

}
}
