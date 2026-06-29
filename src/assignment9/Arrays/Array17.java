package assignment9.Arrays;

//17. Swap the first and last elements of an array.

public class Array17 {
	public static void main(String[] args) {
		int arr[] = {12, 23, 45, 1, 2, 4, 9, 1, 90};

		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		
		System.out.println("Array after swapping:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
