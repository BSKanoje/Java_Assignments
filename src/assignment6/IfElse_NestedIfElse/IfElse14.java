package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 14. ATM Withdrawal
//		Input balance and withdrawal amount.
//		If withdrawal is a multiple of 100 and ≤ balance, approve. Else reject.

public class IfElse14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your balance: ");
		int bal = sc.nextInt();
		System.out.print("Enter your withdrawal amount: ");
		int wd = sc.nextInt();
		sc.close();
		
		if(wd % 100 == 0 && wd <= bal) {
			System.out.println("Approve");
		}
		else {
			System.out.println("Reject");
		}
	}
}
