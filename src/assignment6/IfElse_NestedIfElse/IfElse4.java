package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 4. Triangle Validity
//		Input 3 angles.
//		Check if they form a valid triangle (sum = 180 and all > 0

public class IfElse4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 angles of triangle \nto check if they form a valid triangle or not : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		
		if(sum == 180 && a > 0 && b > 0 && c > 0) {
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("Invalid triangle");
		}
	}
}
