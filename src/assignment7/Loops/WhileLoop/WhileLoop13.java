package assignment7.Loops.WhileLoop;

import java.util.Scanner;

// 13. Find the sum of odd numbers between 1 and n .

public class WhileLoop13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1, sum = 0;
		
		while(i <= n) {
			sum += i;
			i+=2;
		}
		System.out.println("Sum of odd numbers: "+sum);
		sc.close();
	}

}
