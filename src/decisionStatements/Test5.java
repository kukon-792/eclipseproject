package decisionStatements;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
	//int times=12;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the times");
		int times=s.nextInt();
		if(times<12) {
			System.out.println("good morning");
		}
		else if(times<=18) {
			System.out.println("Good evening");
		}
		else {
			System.out.println("Good night");
		}
		
	}
        
	}


