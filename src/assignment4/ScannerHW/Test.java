package assignment4.ScannerHW;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String fname = sc.next();
		
		System.out.print("Enter last name: ");
		String lname = sc.next();
		
		System.out.print("Enter birth year: ");
		int yob = sc.nextInt();
		
		UsernameGenerator ug = new UsernameGenerator();
		String un = ug.getUsername(fname, lname, yob);
		System.out.println(un);
	}
}
