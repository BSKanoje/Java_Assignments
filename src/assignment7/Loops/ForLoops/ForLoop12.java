package assignment7.Loops.ForLoops;

import java.util.Scanner;

//12. Write a program to find sum of all even numbers between 1 to n.

public class ForLoop12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
