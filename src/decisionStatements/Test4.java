package decisionStatements;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=s.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("A+ Gread");
		}
		else if(marks>=80 && marks<=90) {
			System.out.println("A Gread");
		}
		else if(marks>=70 && marks<=80) {
			System.out.println("B Gread");
		}
		else if(marks>=60 && marks<=70) {
			System.out.println("C Gread");
		}
		else if(marks<=50) {
			System.out.println("Fail");
		}
		}
	}


