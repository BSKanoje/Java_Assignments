package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//46. Simulate a simple number guessing game using for .

public class For46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = (int) (Math.random()*100)+1;
		int guess;
		System.out.println(n);
		System.out.println("************Guessing Game****************\n");
		do {
			System.out.print("Guess a number between 1 to 100: ");
			guess = sc.nextInt();
			
			if(guess != n) {
				System.out.println("Oh no!! Wrong Guess");
				System.out.println("Please try again...");
				System.out.println("-----------------------------------------");
			}
			
		} while(n != guess);
		
		System.out.println("Yay, you win the game..");
		sc.close();
	}
}
