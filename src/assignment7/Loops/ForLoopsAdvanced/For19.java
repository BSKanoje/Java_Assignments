package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//19. Find the maximum digit in a number.

public class For19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int max = 0, lastDigit;
		
		if(n < 0) {
			n = -n;
		}
		
		for(; n > 0; n /= 10) {
			lastDigit = n % 10;
			if(lastDigit > max) {
				max = lastDigit;
			}
		}
		System.out.println("Maximum digit value in number is "+max);
		sc.close();
	}
}
