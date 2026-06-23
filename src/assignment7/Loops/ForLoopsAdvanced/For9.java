package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//9. Print numbers in reverse from n to 1 (user input).

public class For9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		for(; n >= 1; n--) {
			System.out.println(n);
		}
		sc.close();
	}
}
