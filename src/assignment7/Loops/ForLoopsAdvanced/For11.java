package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//11. Find the sum of numbers from 1 to n .

public class For11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}
}
