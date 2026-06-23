package assignment7.Loops.ForLoops;

import java.util.Scanner;

//17. Write a Program to Check Given Number is a Palindrome or Not.

public class ForLoop17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check it is palindrome or not: ");
		int n = sc.nextInt();
		int nbackup = n;
		int rev = 0, lastDigit;
		
		for(; n > 0 ; n = n/10) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
		}
		
		if(nbackup == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}

}
