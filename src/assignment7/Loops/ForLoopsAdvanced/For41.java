package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//41. Print the series: 2 4 8 16 32 ... up to n terms.

public class For41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to print series to N terms: ");
		int n = sc.nextInt();
		int term = 1;
		
		for(int i = 1; i <= n; i++) {
			term = term * 2;
			System.out.print(term+ " ");
		}
		sc.close();
	}
}
