package assignment7.Loop1.ForLoops;

import java.util.Scanner;

// 13. Write a program to find sum of all odd numbers between 1 to n.

public class ForLoop13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i+=2) {
			sum += i;
		}
		
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
