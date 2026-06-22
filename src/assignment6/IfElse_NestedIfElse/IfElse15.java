package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 15. Tax Bracket Checker
//		- Input income.
//		- Tax slabs:
//			- 2.5L: No tax
//			- 2.5L-5L: 5%
//			- 5L-10L: 20%
//			- 10L: 30%

public class IfElse15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your income: ");
		int income = sc.nextInt();
		double tax;
		
		if(income <= 250000) {
			System.out.println("No Tax");
			tax = 0;
		}
		else if(income <= 500000) {
			System.out.println("5% Tax");
			tax = income * 5 / 100.0;
		}
		else if(income <= 1000000) {
			System.out.println("20% Tax");
			tax = income * 20 / 100.0;

		}
		else {
			System.out.println("30% Tax");
			tax = income * 30 / 100.0;
		}
			
		System.out.println("Tax = "+tax);
		sc.close();
	}

}
