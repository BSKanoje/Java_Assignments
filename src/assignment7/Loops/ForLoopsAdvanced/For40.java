package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//40. Check if a number has more even digits or odd digits.

public class For40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int lastDigit, even = 0, odd = 0;
		
		while(n > 0) {
			lastDigit = n % 10;
			
			if(lastDigit % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			n /= 10;
		}
		
		if(even > odd) {
			System.out.println("More even digits: "+even);
		}
		else if(odd > even) {
			System.out.println("More odd digits: " + odd);
		}
		else {
			System.out.println("Even and odd digits are equal");
		}
		sc.close();
	}
}
