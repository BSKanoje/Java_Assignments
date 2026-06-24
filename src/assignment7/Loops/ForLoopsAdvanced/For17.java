package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//17. Reverse the digits of a number (e.g., 456 → 654).

public class For17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to reverse it: ");
		int num = sc.nextInt();
		int n = num;
		
		int rev = 0, lastDigit;
		
		for(;n > 0; n /= 10) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
		}
		System.out.println("Reverse of "+num+" is "+rev);
		sc.close();
	}
}
