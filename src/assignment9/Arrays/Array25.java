package assignment9.Arrays;

//25. Replace all negative numbers in an array with 0.

public class Array25 {
	public static void main(String[] args) {
		int arr[] = { -1, 3, 4, -4, 6, -90, 40, -55};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = 0;
			}
		}
	    
        System.out.println("Array after replacing negative numbers:");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
