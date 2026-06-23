package assignment7.Loops.WhileLoop;

import java.util.Scanner;

//10. Print the first n even numbers.

public class WhileLoop10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n) {
			System.out.println(i*2);
			i++;
		}
		sc.close();
	}

}
