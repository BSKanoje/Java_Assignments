package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//38. Convert a binary number (as int) to decimal using a loop.

public class For38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		int n = sc.nextInt();
		
		int lastDigit, power = 0, decimal = 0;

		for(; n > 0; n /= 10) {
			lastDigit = n % 10;
			decimal = decimal + lastDigit * (int)Math.pow(2, power);
			power++;
		}
		System.out.println("Decimal number = "+decimal);
		sc.close();
	}
}
