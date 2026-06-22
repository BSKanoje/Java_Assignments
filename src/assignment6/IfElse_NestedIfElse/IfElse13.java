package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 13. Vowel or Consonant
//		Input a character.
//		Check if it's a vowel (a, e, i, o, u – case insensitive) or consonant.

public class IfElse13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' ||
		   ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

}
