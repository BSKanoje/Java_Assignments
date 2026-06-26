package assignment9.Arrays;

//12. Copy all elements of one array into another array.

public class Array12 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int[] arr2 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println("Array 1: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\nArray 2 copied: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
	}
}
