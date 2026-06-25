package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//39. Convert a decimal number to octal using a loop.

public class For39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		int n = sc.nextInt();
		
		int octal = decToOctal(n);
		System.out.println("Octal number is "+octal);
		
		sc.close();
	}
	
	public static int reverse(int n) {
		
		int lastDigit, rev = 0;
		for(; n > 0; n /= 10) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
		}
		return rev;
	}
	
	public static int decToOctal(int n) {
		int rem, rev = 0;
		while(n > 0) {
			rem = n % 8;
			rev = rev * 10 + rem;
			n /= 8;
		}
		
		int oct = reverse(rev);
		return oct;
	}
}
