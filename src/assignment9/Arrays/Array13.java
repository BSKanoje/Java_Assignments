package assignment9.Arrays;

//13. Merge two arrays into a third array.

public class Array13 {
	public static void main(String[] args) {

		int arr1[] = {10, 20, 30, 40};
		int arr2[] = {50, 60, 70, 80};

		int arr3[] = new int[arr1.length + arr2.length];

		int index = 0;

		// Copy first array
		for(int i = 0; i < arr1.length; i++) {
			arr3[index] = arr1[i];
			index++;
		}

		// Copy second array
		for(int i = 0; i < arr2.length; i++) {
			arr3[index] = arr2[i];
			index++;
		}

		System.out.println("Merged Array:");

		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}