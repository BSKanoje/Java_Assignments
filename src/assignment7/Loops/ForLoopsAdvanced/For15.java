package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//15. Calculate the sum of digits of a number.

public class For15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0, lastDigit;
		
		for(; n > 0; n /= 10) {
			lastDigit = n % 10;
			sum += lastDigit;
		}
		System.out.println("Sum of digits is "+sum);
		sc.close();
	}
}
