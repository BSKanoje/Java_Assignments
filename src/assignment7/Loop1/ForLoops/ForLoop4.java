package assignment7.Loop1.ForLoops;

import java.util.Scanner;

// 4. Write a program to print reverse tables by taking user input.

public class ForLoop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print reverse table: ");
		int n = sc.nextInt();
		
		for(int i = n*10; i >= n; i = i-n) {
			System.out.println(i);
		}
	}

}
