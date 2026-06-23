package assignment7.Loop1.ForLoops;

import java.util.Scanner;

//15. Write a program to find the value of one number raised to the power of another.

public class ForLoop15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		System.out.print("Enter power: ");
		int p = sc.nextInt();
		
		int res = 1;
		
		for(int i = 1; i <= p; i++) {
			res = res * n;
		}
		
		System.out.println("result: "+res);
		sc.close();
	}
}
