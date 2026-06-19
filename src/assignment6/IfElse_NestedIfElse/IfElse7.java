package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

//7. Age Category Checker
//		Input age.
//		Categorize:
//			0-12: Child
//			13-17: Teen
//			18-59: Adult
//			60+: Senior

public class IfElse7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if (age < 0)
		    System.out.println("Invalid age");
		else if (age <= 12) 
		    System.out.println("Child");
		else if(age <= 17)
			System.out.println("Teen");
		else if(age <= 59)
			System.out.println("Adult");
		else 
			System.out.println("Senior");
	}
}
