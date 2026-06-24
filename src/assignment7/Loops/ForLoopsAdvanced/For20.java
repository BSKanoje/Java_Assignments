package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//20. Find the minimum digit in a number.

public class For20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		if(n < 0) {
			n = -n;
		}
		
		int min = n % 10, lastDigit;
		
		for(; n > 0; n /= 10) {
			lastDigit = n % 10;
			if(lastDigit < min) {
				min = lastDigit;
			}
		}
		System.out.println("Minimum digit in number is "+min);
		sc.close();
	}
}
