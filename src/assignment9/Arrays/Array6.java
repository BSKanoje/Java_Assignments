package assignment9.Arrays;

//6. Calculate the average of array elements.

public class Array6 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 99};
		int sum = 0;
		double avg;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = (double) sum / (arr.length);
		System.out.println("Average: "+avg);
	}
}
