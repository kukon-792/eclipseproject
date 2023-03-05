package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test3 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		// LinkedList p=new LinkedList();
		p.add(10);
		p.add(20);
		p.add(90);
		p.add(30);
		p.add(40);
		
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println("After using pool method "+p);
		System.out.println(p.peek());
		System.out.println("After using peek method "+p);

	}

}
