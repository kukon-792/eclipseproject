package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.45);
		a.add("Hello");
		a.add('A');
		a.add(true);
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20.45);
		a1.add("Hello");
		a1.add('A');
		a1.add(true);
		
		System.out.println(a.retainAll(a));
		System.out.println(a.removeAll(a1));
	

	}

}
