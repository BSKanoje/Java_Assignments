package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 17. Login Authentication
//		Input username and password.
//		If both match predefined values (hardcoded), print "Access Granted", else "Denied".

public class IfElse17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String originalUsername = "bskanoje";
		String originalPassword = "Bskanoje@2003";
		
		System.out.print("Enter Username : ");
		String username = sc.next();
		System.out.print("Enter Password : ");
		String password = sc.next();
		
		if(originalUsername.equals(username) && originalPassword.equals(password))
			System.out.println("Access Granted");
		else
			System.out.println("Denied");
		
	}
}
