package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 12. Menu Choice Math Ops)
//		Input two numbers.
//		Input a choice 1: add, 2: subtract, 3: multiply, 4: divide).
//		Print result using nested if-else.

public class IfElse12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.err.println("----------------------------------------------");
		System.out.println("Enter a number to perform following operation");
		System.out.println(" 1: Add \n 2: Subtract \n 3: Multiply \n 4: Divide");
		System.err.println("----------------------------------------------");
		
		int op = sc.nextInt();
		int result = 0;
		
		if(op == 1)
			result = a + b;
		else if(op == 2)
			result = a - b;
		else if(op == 3)
			result = a * b;
		else if(op == 4) {
			try {
				result = a / b;
			}
			catch(ArithmeticException e) {
				System.out.println("Divide by 0 "+e);
			}
		}
		else
			System.err.println("Invalid Choice");
		
		System.out.println("Result is "+result);
	}

}
