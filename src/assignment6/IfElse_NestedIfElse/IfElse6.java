package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

//6. Grade Calculator
//		Input marks 0100.
//		Print grade based on this:
//		90-100: A
//		80-89: B
//		70-79: C
//		60-69: D
//		Below 60: F


public class IfElse6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter obtained marks out of 100 : ");
		int marks = sc.nextInt();
		
		if(marks >= 90 && marks <=100) {
			System.out.println("A");
		}
		else if(marks >= 80 && marks <= 89) {
			System.out.println("B");
		}
		else if(marks >= 70 && marks <= 79) {
			System.out.println("C");
		}
		else if(marks >= 60 && marks <= 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
