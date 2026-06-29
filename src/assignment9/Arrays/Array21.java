package assignment9.Arrays;

//21. Count number of elements greater than a given number.

public class Array21 {
	public static void main(String[] args) {
		
		int arr[] = {1, 34, 54, 67, 87, 89, 98, 54, 21 , 34, 33};
		int num = 90;
		int count =0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > num) {
				System.out.println(arr[i]);
				count++;
			}
		}
		
		System.out.println("Count = "+count);
			
	}
}
