package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 16. Temperature Converter
//		- Input a number and a unit C or F.
//		- Convert accordingly:
//			- If C, convert to Fahrenheit.
//			- If F, convert to Celsius.

public class IfElse16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature: ");
		double temp = sc.nextFloat();
		System.out.println("Enter unit : \n C for celsius \n F for Fahrenheit");
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		
		if(ch == 'C') {
			double f = (temp * 1.8) + 32;
			System.out.println("Temperature in Fahrenheit is "+f);
		}
		else if(ch == 'F') {
			double c = (temp - 32) / 1.8;
			System.out.println("Temperature in Celsius is "+c);
		}
		else {
			System.out.println("Invalid unit!!!!");
		}
		
	}

}
