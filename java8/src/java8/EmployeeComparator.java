package java8;

public class EmployeeComparator {
	public EmployeeComparator(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	String name;
	int eno;
	@Override
	public String toString() {
		return "EmployeeComparator [name=" + name + ", eno=" + eno + "]";
	}
	
	
}
