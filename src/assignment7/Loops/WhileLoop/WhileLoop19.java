package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 19. Find the product of digits in a number.

public class WhileLoop19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find product of digits: ");
		int n = sc.nextInt();
		int pro = 1, lastDigit;
		
		while(n > 0) {
			lastDigit = n % 10;
			pro *= lastDigit;
			n /= 10;
		}
		System.out.println("Product of digits : "+pro);
		sc.close();
	}

}
