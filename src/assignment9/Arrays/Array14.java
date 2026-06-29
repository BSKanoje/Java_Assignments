package assignment9.Arrays;

//14. Remove duplicates from an array.

public class Array14 {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 1, 2, 3, 3, 4, 5, 1};
		
		int size = arr.length;
		
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; i++ ) {
				
				if(arr[i] == arr[j]) {
					
					for(int k = j; k < size-1; k++) {
						arr[k] = arr[k+1];
					}
					size--;
					j--;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}