package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

//10. Electricity Bill Calculator
//		- Input total units consumed.
//		- Use nested if-else to calculate cost:
//			* ≤100 units: ₹5/unit
//			* 101-300: ₹7/unit
//			* 300: ₹10/unit

public class IfElse10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total units Consumed: ");
		int unit = sc.nextInt();
		int bill;
		
		if(unit <= 100) {
			bill = 5 * unit;
		}
		else if(unit <= 299) {
			bill = 7 * unit;
		}
		else {
			bill = 10 * unit;
		}
		
		System.out.println("You have to pay ₹"+bill+" electricity bill this month.");
	}
}
