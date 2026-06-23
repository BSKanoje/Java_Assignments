package assignment7.Loops.ForLoops;

import java.util.Scanner;

//18. Write a Java program to display the cube of the given number up to an integer.

public class ForLoop18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number of terms: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int cube = i * i * i;
			System.out.println("Number is : "+i+" and cube of "+i+" is : "+cube);
		}
		sc.close();
	}
}
