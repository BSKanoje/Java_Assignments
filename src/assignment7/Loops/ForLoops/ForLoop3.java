package assignment7.Loops.ForLoops;

import java.util.Scanner;

// 3. Write a program to print tables by taking user input.

public class ForLoop3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print table : ");
		int n = sc.nextInt();
		
		for(int i = n; i <= n*10; i = i+n) {
			System.out.println(i);
		}
	}
}
