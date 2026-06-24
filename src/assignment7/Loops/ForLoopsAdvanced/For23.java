package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//23. Keep asking for a username until "admin" is entered.

public class For23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		
		do {
			System.out.print("Enter a username: ");
			username = sc.next();
			
		} while(!username.equals("admin"));
		System.out.println("Correct username...");
		sc.close();
	}
}
