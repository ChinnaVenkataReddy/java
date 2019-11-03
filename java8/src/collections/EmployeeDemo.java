package collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDemo {
	public static void main(String[] args) {
		Map<Employee,String> m=new HashMap<>();
		m.put(new Employee(1,"A"),"b");
		m.put(new Employee(2,"b "),"c");
		System.out.println(m);
		System.out.println(new Employee(1,"A"));
		System.out.println(m.get(new Employee(1,"A")));
		for(Map.Entry entry:m.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());	
		}
		/*m.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
			
		})*/;
		/*System.out.println(m);
		System.out.println(m.get(new Employee(2,"b")));*/
	}

}
