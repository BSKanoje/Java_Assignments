package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 2. Character Classifier
// 		Input a single character.
// 		Check if it is uppercase, lowercase, digit, or special character.

public class IfElse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a single character: ");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");

        } else {
            System.out.println("Special Character");
        }
	}
}
