package collections;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		Vector a=new Vector();
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
		
		
		System.out.println(a);

		
		
		System.out.println("The size o the array "+a.size());
		
		for(int i=0;i<a.size();i++){
			
			System.out.println(a.get(i));

	}

		System.out.println("the capacity 0 the vector "+a.capacity());
	}
}