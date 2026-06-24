package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//33. Count how many digits in a number are odd.

public class For33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n < 0) {
			n = -n;
		}
		
		int oddCount = 0;
		int lastDigit;
		
		while(n > 0) {
			lastDigit = n % 10;
			if(lastDigit % 2 != 0) {
				oddCount++;
			}
			n /= 10;
		}
		
		System.out.println("Number of odd digits in number is "+oddCount);
		sc.close();
	}
}
