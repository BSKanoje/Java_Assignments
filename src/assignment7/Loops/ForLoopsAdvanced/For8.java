package assignment7.Loops.ForLoopsAdvanced;

import java.util.Scanner;

//8. Print numbers from 1 to n but skip multiples of 5.

public class For8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}
		sc.close();
	}
}
