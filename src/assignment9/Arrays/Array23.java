package assignment9.Arrays;

//23. Find common elements between two arrays.

public class Array23 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int arr2[] = {1, 2, 3,1, 4, 5, 6, 7, 8};
		
        System.out.println("Common Elements:");

		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr2.length; j++) {
				
				if(arr[i] == arr2[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
