package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 18. Three-Sided Shape Type
//		Input 3 sides of triangle.
//		Check and classify: equilateral, isosceles, or scalene.

public class IfElse18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three side of Triangle : ");
		System.out.print("Enter first side  : ");
		int a = sc.nextInt();
		System.out.print("Enter second side : ");
		int b = sc.nextInt();
		System.out.print("Enter third side  : ");
		int c = sc.nextInt();
		
		if (a == b && b == c)
			System.out.println("Equilateral Triangle");
		else if(a == b || b == c || c == a) 
			System.out.println("Isosceles Triangle");
		else 
			System.out.println("Scalene Triangle");
	}

}
