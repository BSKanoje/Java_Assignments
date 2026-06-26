package assignment9.Arrays;

import java.util.Scanner;

//2. Read 5 integers from user using Scanner and store them in an array. Print the array.

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nArray element are:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ "  ");
		}
		sc.close();
	}
}
