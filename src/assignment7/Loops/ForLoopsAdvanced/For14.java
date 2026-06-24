package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//14. Count the number of digits in a number.

public class For14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to count digit: ");
		int n = sc.nextInt();
		
		int count = 0;
		
		if(n == 0) {
			count = 1;
		}
		else {
			for(; n > 0; n /= 10) {
				count++;
			}
		}
		System.out.println("Count: "+count);
		sc.close();
	}
}
