package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//16. Calculate the factorial of a number using for .

public class For16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find factorial: ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of "+n+" = "+fact);
		sc.close();
	}
}
