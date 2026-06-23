package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//7. Print all numbers divisible by 3 between 1 and 30.

public class For6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to print square till: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int cube = i * i * i;
			System.out.println("Cube of "+i+" = "+cube);
		}
		sc.close();
	}
}
