package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//36. Print digits of a number from right to left using for .

public class For36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int lastDigit;
		
		for(;n > 0; n /= 10) {
			lastDigit = n % 10;
			System.out.print(lastDigit+" ");	
		}
		sc.close();
	}
}
