package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//42. Print the sum of the series: 1 + 1/2 + 1/3 + ... + 1/n

public class For42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value of n: ");
		int n = sc.nextInt();

		double sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + 1.0 / i;
		}

		System.out.println("Sum of series = " + sum);
		sc.close();
	}
}
