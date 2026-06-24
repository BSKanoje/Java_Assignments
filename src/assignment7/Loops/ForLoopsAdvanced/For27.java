package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//27. Keep asking for a number until a prime number is entered.

public class For27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean isPrime;
		
		do {
			System.out.print("Enter a number: ");
			n = sc.nextInt();
			
			isPrime = true;
			if(n <= 1) {
				isPrime = false;
			}
			else {
				for(int i = 2; i <= n / 2; i++) {
					if(n % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			
			
			if(!isPrime) {
				System.out.println("Not a prime number, try again.");
			}
			
		} while(!isPrime);
		
		System.out.println(n + " is a prime number.");
		sc.close();
	}
}
