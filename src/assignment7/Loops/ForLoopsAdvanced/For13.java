package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//13. Find the sum of odd numbers between 1 and n .

public class For13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i+=2) {
			sum += i;
		}
		System.out.println("Sum of odd digits : "+sum);
		sc.close();
	}
}
