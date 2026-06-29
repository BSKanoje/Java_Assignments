package assignment9.Arrays;

//16. Sort the array in descending order.

public class Array16 {
	public static void main(String[] args) {
		
		int arr[] = {12, 23, 45, 1, 2, 4, 9, 1, 90};
		int temp;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Descending order array is ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
