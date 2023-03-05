package loops;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		//int age=5;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible for DL");
	}
	 else {  
		  
		 System.out.println("you are not");
	}

	}
}