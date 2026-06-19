package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 8. Odd Difference Evaluator
//		Input two integers.
//		If both are odd, print their absolute difference. If one is even, print "Invalid".

public class IfElse8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % 2 == 1 && b % 2 == 1) {
			int diff = Math.abs(a - b);
			System.out.println(diff);
		}
		else {
			System.out.println("Invalid");
		}
	}
}
