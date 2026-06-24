package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//26. Ask for a password; allow a maximum of 3 tries.

public class For26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password, originalPassword = "Pass@123";
		int tries = 0;
		boolean found = false;
		
		do {
			System.out.print("Enter password: ");
			password = sc.next();
			
			if(originalPassword.equals(password)) {
				found = true;
			}
			tries++;
		} while(tries < 3 && !found);
		
		if(found) {
			System.out.println("You entered a correct password");
		}
		else {
			System.out.println("Sorry, you reached the maximum 3 attempts.");
		}
		sc.close();
	}
}
