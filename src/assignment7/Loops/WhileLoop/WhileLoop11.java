package assignment7.Loops.WhileLoop;

import java.util.Scanner;

//11. Find the sum of numbers from 1 to n .

public class WhileLoop11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("sum = "+sum);
		sc.close();
	}

}
