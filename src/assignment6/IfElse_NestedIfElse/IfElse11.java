package assignment6.IfElse_NestedIfElse;

import java.util.Scanner;

// 11. Exam Pass/Fail
//		Input marks in 3 subjects.
//		If any subject is below 33, print "Fail", else print "Pass".

public class IfElse11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of eng, math and science subjects: ");
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int sci = sc.nextInt();
		
		if(eng > 33 && math > 33 && sci > 33)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
