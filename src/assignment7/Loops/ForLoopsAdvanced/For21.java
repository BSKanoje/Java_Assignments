package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//21. Keep asking the user to enter a positive number until they do so.

public class For21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter a positive number: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		System.out.println("You entered a positive number: "+n);
		sc.close();
	}
}
