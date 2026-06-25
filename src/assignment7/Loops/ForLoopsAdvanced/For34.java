package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//34. Sum all digits of a number until a single digit is obtained (repeated sum).

public class For34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum;
		
		do {
			sum = sumOfDigit(n);
			n = sum;
		}while(sum > 9);
			
		System.out.println("Repeated sum = " + sum);
		sc.close();
	}
	
	public static int sumOfDigit(int n) {
		int lastDigit, sum = 0;
		
		for(; n > 0; n /= 10) {
			lastDigit = n % 10;
			sum += lastDigit;
		}
		return sum;
	}
}
