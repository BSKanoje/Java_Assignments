package assignment9.Arrays;

//4. Find the minimum value in an array.

public class Array4 {
	public static void main(String[] args) {
		int arr[] = {88, 34, 65, 76, 0, 1, 100, 2};
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum value: "+min);
	}
}
