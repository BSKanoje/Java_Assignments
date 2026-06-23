package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 17. Reverse the digits of a number (e.g., 123 → 321.

public class WhileLoop17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int n = sc.nextInt();
		int lastDigit, rev = 0;
		
		while(n > 0) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		System.out.println("Reverse number is "+rev);
		sc.close();
	}

}
