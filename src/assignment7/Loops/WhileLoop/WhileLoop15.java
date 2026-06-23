package assignment7.Loops.WhileLoop;

import java.util.Scanner;

//15. Find the sum of digits in a given number.

public class WhileLoop15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int lastDigit, sum = 0;
		
		while(n > 0) {
			lastDigit = n % 10;
			sum += lastDigit;
			n /= 10;
		}
		System.out.println("Sum of digits is "+sum);
		sc.close();
	}

}
