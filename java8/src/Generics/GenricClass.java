package Generics;

public class GenricClass<T> {
	T t;
	 GenricClass(T t) {
		this.t=t;
	}
	 
	 public void show() {
		 System.out.println(" the given value is being in:"+t.getClass().getName());
	 }
	 
	 public T getObject() {
		 return t;
	 }
}
