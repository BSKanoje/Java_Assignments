package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//49. Create a number lock: keep asking until the correct 4-digit PIN is entered.

public class For49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int pin = 4567;
		
		do {
			System.out.print("Enter 4-digit PIN: ");
			n = sc.nextInt();
			
			if(n != pin) {
				System.err.println("Wrong PIN. Try again.");
			}
			
		} while(pin != n);
		
		System.out.println("PIN correct. Lock opened.");
		sc.close();
	}
}
