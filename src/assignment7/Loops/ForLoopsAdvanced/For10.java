package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//10. Print multiplication table for a number using do-while .

public class For10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		
		do {
			System.out.println(i*n);
			i++;
		} while(i <= 10);
		sc.close();
	}
}
