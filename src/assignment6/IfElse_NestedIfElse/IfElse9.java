package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 9. Positive Negative Zero
//		Input a number.
//		Check if it's positive, negative, or zero.
		
public class IfElse9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		sc.close();
		
		if(n < 0)
			System.out.println("Negative number");
		else if(n > 0)
			System.out.println("Positive number");
		else
			System.out.println("Zero");
	}
}
