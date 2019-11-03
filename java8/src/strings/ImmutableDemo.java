package strings;

public class ImmutableDemo {
	private int i;
	
	ImmutableDemo(int i){
		this.i=i;
	}
	
	public ImmutableDemo modify(int i) {
		if(this.i==i) {
			return this;
		}
		else 
			return (new ImmutableDemo(i));
	}

	public static void main(String[] args) {
		
		ImmutableDemo id=new ImmutableDemo(100);
		ImmutableDemo id1 = id.modify(10);
		System.out.println(id==id1);
		
		
	}
	
	
}
