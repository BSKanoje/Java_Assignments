package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//5. Print squares of numbers from 1 to n (user input).

public class For5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to print square till: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int sq = i * i;
			System.out.println("Square of "+i+" = "+sq);
		}
		sc.close();
	}
}
