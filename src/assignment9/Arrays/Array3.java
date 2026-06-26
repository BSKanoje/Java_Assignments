package assignment9.Arrays;

//3. Find the maximum value in an array.

public class Array3 {
	public static void main(String[] args) {
		
		int arr[] = {1, 23, 54, 100, 45, 78, 56, 99};
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print("Maximum value in array is "+max);
	}
}
