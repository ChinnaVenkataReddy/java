package strings;

final class CreateImmutable {
	private int i;

	public CreateImmutable( int i) {
		this.i=i;
	}
	
	public CreateImmutable modify(int i) {
		if(this.i==i) {
			return this;
		}
		else return (new CreateImmutable(i));
		
	}
public static void main(String[] args) {
	CreateImmutable c1 = new CreateImmutable(10);
	CreateImmutable c2 = c1.modify(100);
}
}
