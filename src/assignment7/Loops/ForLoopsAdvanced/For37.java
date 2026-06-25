package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//37. Print digits of a number from left to right using for .

public class For37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int lastDigit, rev=0;
		
		// Step 1: Reverse the number
		while(n > 0) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		
		// Step 2: Print digits of reversed number
		for(;rev > 0; rev /= 10) {
			lastDigit = rev % 10;
			System.out.print(lastDigit+" ");
		}
		sc.close();
	}
}
