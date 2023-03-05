package collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test17 {

	public static void main(String[] args) {
		TreeSet a=new TreeSet();
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(8);
		a.add(100);
		
		System.out.println(a);
		System.out.println(a.descendingSet());

	}

}
