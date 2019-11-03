package java8;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeDemo {
	public static void main(String[] args) {
		ArrayList<EmployeeComparator> l=new ArrayList<EmployeeComparator>();
		l.add(new EmployeeComparator(" chinna",222));
		l.add(new EmployeeComparator(" honey",215));
		l.add(new EmployeeComparator(" namo",225));
		
		Comparator<EmployeeComparator> c=(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0;
		
		
		//java.util.Collections.sort(l,(e1,e2)-> e1.name.compareTo(e2.name));
		java.util.Collections.sort(l,c);
		System.out.println(l);
	}
	
	

}
