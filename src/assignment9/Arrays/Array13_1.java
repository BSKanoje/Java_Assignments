package assignment9.Arrays;

//13. Merge two arrays into a third array.

public class Array13_1 {
	public static void main(String[] args) {
		int arr1[] = {10, 20, 30, 40, 50};
		int arr2[] = {60, 70, 80, 90, 100};
		
		int arr[] = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
