package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 7. Print the multiplication table of a number (e.g. 7) up to 10.

public class WhileLoop5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to print table: ");
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= 10) {
			System.out.println(n+" X "+i+" = "+n*i);
			i++;
		}
		sc.close();
	}
}
