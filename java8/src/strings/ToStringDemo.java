package strings;

public class ToStringDemo {
	String name;
	int rollno;
	public ToStringDemo(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
		
	}
	
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + rollno;
	return result;
}

	
@Override
	public String toString() {
		return getClass()+" [name=" + name + ", rollno=" + rollno + "]";
	}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ToStringDemo other = (ToStringDemo) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (rollno != other.rollno)
		return false;
	return true;
}

public static void main(String[] args) {
	ToStringDemo ss = new ToStringDemo("chinna", 222);
	ToStringDemo sss = new ToStringDemo("honey", 215);
	String s1=new String("chinna");
	String s2=new String("honey");
	StringBuffer sb=new StringBuffer("chinna");
	String s3="chinnareddy";
	String s4="chinnareddy";
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s4));
	System.out.println(s1==s2);
	System.out.println(s3==s4);
	System.out.println(s1.equals(sb));
	String c="chinnaaaa";
	String cc = c.concat("ra");
	System.out.println(c.hashCode());
	System.out.println(cc.hashCode());	
}
	
}
