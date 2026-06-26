package assignment9.Arrays;

import java.util.Scanner;

//5. Calculate the sum of all elements in an array.

public class Array5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("sum of element: "+sum);
		sc.close();
	}
}
