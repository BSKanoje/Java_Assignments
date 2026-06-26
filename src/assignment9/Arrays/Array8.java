package assignment9.Arrays;

//8. Count how many positive and negative numbers are in an array.

public class Array8 {
	public static void main(String[] args) {
		int arr[] = {-2, -4, -7, -788, 80, 23, 44, 55, 0};
		int positive = 0, negative = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				positive++;
			}
			else if(arr[i] < 0) {
				negative++;
			}
		}
		System.out.println("Positive count: "+positive);
		System.out.println("Negative count: "+negative);
	}
}
