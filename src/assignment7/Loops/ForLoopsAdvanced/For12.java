package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//12. Find the sum of even numbers between 1 and n .

public class For12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 2; i <= n; i +=2) {
			sum += i;
		}
		System.out.println("sum of even numbers: "+sum);
		sc.close();
	}
}
