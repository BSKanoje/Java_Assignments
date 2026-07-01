package assignment9.Arrays;

import java.util.Scanner;

// 26. Read 10 marks from user and print grade for each (use if-else ):
// 		=90: A, >=80: B, >=70: C, >=60: D, else: F

public class Array26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter "+(i+1)+" marks: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Grade of 10 student: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) +" received Grade: ");
			
			if (arr[i] < 0 || arr[i] > 100) {
			    System.out.println("Invalid Marks");
			}
			else if (arr[i] >= 90) {
			    System.out.println("A");
			}
			else if(arr[i] >= 80) {
				System.out.println("B");
			}
			else if(arr[i] >= 70) {
				System.out.println("C");
			}
			else if(arr[i] >= 60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
		
		sc.close();
		
	}
}
