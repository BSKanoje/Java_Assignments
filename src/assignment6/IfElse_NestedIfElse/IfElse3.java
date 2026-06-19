package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 3. Biggest Among Three
//		Input 3 numbers.
//		Use nested if-else to find and print the greatest number.

public class IfElse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b) {
			if(a > c)
				System.out.println("Greatest number is: "+a);
			else
				System.out.println("Greatest number is: "+c);
		}
		else {
			if(b > c)
				System.out.println("Greatest number is: "+b);
			else
				System.out.println("Greatest number is: "+c);
		}
	}
}
