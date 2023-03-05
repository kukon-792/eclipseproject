package decisionStatements;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		if(age>=60 && age<=70) {
			System.out.println("he is senior");
		}
		else if(age>=50 && age<60) {
			System.out.println("he is not sinior");
		}
		
		else {
			System.out.println("he is jonior");
		}
	
			
		}
		
	}


