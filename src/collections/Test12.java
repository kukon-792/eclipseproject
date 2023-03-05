package collections;

import java.util.ArrayList;

public class Test12 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.45);
		a.add("Hello");
		a.add('A');
		a.add(10);
		a.add(20.45);
		a.add("Hello");
		a.add('A');
		a.add(true);
		a.add(10);
		
		for(Object b:a) {
			System.out.println(b);
		}
	}

}
