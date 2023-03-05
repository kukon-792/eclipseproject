package loops;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		//int age = 22;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		
		if(age>=18) {
			System.out.println("you are superhero");
		}
		else {
			System.out.println("you are not superhero");
	}
	

	}

}
