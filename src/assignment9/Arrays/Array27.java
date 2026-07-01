package assignment9.Arrays;

//27. Check if the array is sorted in ascending order.

public class Array27 {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4,10, 5, 6, 7, 8, 9, 10};
		
		boolean sorted = true;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				sorted = false;
				break;
			}
		}
		
		if (sorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }
	}
}
