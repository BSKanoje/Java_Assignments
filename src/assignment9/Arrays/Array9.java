package assignment9.Arrays;

//9. Search for a given element in the array (Linear search).

public class Array9 {
	public static void main(String[] args) {
		int arr[] = {12, 34, 56, 67, 45, 78};
		int search = 78, i;
		boolean found = false;
		
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Element found at index " + i);		}
		else {
			System.out.println("not found");
		}
	}
}
