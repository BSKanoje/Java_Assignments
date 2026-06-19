package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

//1. Even or Odd Difference
//		Input two integers.
//		Print the larger one only if it is even; else print the smaller one.

public class IfElse1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
		int min;
		
		if(a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		
		if(max % 2 == 0) {
			System.out.println(max);
		}
		else {
			System.out.println(min);
		}
	}
}
