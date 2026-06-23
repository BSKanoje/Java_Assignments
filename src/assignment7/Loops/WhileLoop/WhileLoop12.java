package assignment7.Loops.WhileLoop;

import java.util.Scanner;

//12. Find the sum of even numbers between 1 and n .

public class WhileLoop12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 2;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			i += 2;
		}
		System.out.println("Sum of Even numbers: "+sum);
		sc.close();
	}

}
