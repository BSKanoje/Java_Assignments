package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 20. Find the greatest digit in a number.

public class WhileLoop20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find largest digit: ");
		int n = sc.nextInt();
		int lastDigit, largest = 0;
		
		while(n > 0) {
			lastDigit = n % 10;
			if(largest < lastDigit) {
				largest = lastDigit;
			}
			n /= 10;
		}
		System.out.println("Largest digit in number is "+ largest);
		sc.close();
	}

}
