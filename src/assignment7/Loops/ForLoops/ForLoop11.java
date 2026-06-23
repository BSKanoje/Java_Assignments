package assignment7.Loops.ForLoops;

import java.util.Scanner;

// 11. Write a program to find sum of all natural numbers between 1 to n.

public class ForLoop11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum : "+sum);
	}

}
