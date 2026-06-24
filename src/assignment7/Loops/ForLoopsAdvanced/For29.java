package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//29. Let the user input numbers until they enter an even number.

public class For29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Enter a number: ");
			n = sc.nextInt();
			
		} while(n % 2 != 0);
		
		System.out.println("You entered an even number: "+n);
		sc.close();
	}
}
