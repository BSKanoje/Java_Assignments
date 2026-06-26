package assignment9.Arrays;

import java.util.Arrays;

//12. Copy all elements of one array into another array using Arrays.copyOf().

public class Array12_1 {
	public static void main(String[] args) {

		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		int arr2[] = Arrays.copyOf(arr, arr.length);

		System.out.println("Array 1:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nArray 2 copied:");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}