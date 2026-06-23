package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 8. Print the cube of all numbers from 1 to n (user input).

public class WhileLoop8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n) {
			int cube = i * i * i;
			System.out.println("Cube of "+i+" = "+cube);
			i++;
		}
		sc.close();
	}

}
