package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 20. Simple Voting System
//		Input age and citizenship Y/N.
//		If age ≥18 and citizen Y/y, print "Eligible to vote".

public class IfElse20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age   : ");
		int age = sc.nextInt();
		
		System.out.print("Citizenship(Y/N) : ");
		char c = sc.next().charAt(0);
		c = Character.toUpperCase(c);
		
		if(age >= 18 && c == 'Y')
			System.out.println("Eligible to vote");
		else 
			System.out.println("Not eligible to vote");
		
		sc.close();
	}

}
