package assignment7.Loop1.ForLoops;

import java.util.Scanner;

// 1. Write a program to print all natural numbers from 1 to n (n is a user input).

public class ForLoop1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
