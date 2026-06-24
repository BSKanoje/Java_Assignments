package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//18. Find the product of digits in a number.

public class For18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find product of digits: ");
		int n = sc.nextInt();
		int pro = 1, lastDigit;
		
		if(n == 0) {
			pro = 0;
		}
		else {
			for(; n > 0; n /= 10) {
				lastDigit = n % 10;
				pro *= lastDigit;
			}
		}
		System.out.println("Product of digits are: "+pro);
		sc.close();
	}
}
