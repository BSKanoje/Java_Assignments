package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 18. Check if a number is a palindrome.

public class WhileLoop18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to check palindrome or not: ");
		int n = sc.nextInt();
		int nCopy = n;
		int lastDigit, rev = 0;
		
		while(n > 0) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		
		if(nCopy == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}

}
