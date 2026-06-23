package assignment7.Loops.ForLoops;

import java.util.Scanner;

//16. write a program to reverse the given Digits.

public class ForLoop16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to reverse it: ");
		int n = sc.nextInt();
		int lastdigit;
		int rev = 0;
		
		for(; n > 0; n = n/10) {
			lastdigit = n % 10;
			rev = rev * 10 + lastdigit;
		}
		
		System.out.println("Reverse: "+rev);
		sc.close();
	}

}
