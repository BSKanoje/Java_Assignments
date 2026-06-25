package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//35. Reverse a number and check if the reversed number is even.

public class For35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int nCopy = n;
		int lastDigit, rev = 0;
		
		while(n > 0) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		
		System.out.println("Reverse of "+nCopy+ " is "+rev);
		if(rev % 2 == 0) {
			System.out.println("Reverse number is even");
		}
		else {
			System.out.println("Reverse number is not even");
		}
		sc.close();
	}
}
