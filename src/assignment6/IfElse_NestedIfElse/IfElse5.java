package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 5. Leap Year Checker
//		Input a year.
//		Check if it’s a leap year using nested conditions (divisible by 4, not 100 unless divisible by 400.

public class IfElse5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year \nTo check it is leap year or not : ");
		int year = sc.nextInt();
		
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 00 )) {
			System.out.println(year+" is Leap year");
		}
		else {
			System.out.println(year+" is not Leap year");
		}
	}
}
