package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 9. Print the first n natural numbers.

public class WhileLoop9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}
