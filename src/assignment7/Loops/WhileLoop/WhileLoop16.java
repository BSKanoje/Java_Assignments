package assignment7.Loops.WhileLoop;

import java.util.Scanner;

//16. Calculate the factorial of a number.

public class WhileLoop16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int i = 1;
		int fact = 1;
		
		while(i <= n) {
			fact *= i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+fact);
		sc.close();
	}

}
