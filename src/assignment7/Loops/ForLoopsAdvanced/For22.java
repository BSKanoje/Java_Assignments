package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//22. Ask the user to enter a number greater than 100; repeat if input is smaller.

public class For22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Enter a number greater than 100: ");
			n = sc.nextInt();
		} while(n <= 100);
		
		System.out.print("You entered a number greater than 100: "+n);
		sc.close();
	}
}
