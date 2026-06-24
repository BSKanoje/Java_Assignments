package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//28. Ask the user for a valid age between 1–120.

public class For28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		do {
			System.out.print("Enter your age(1-120): ");
			age = sc.nextInt();
			
		} while(age < 1 || age > 120);
		
		System.out.println("Valid age is "+age);
		sc.close();
	}
}
