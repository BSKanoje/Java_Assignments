package assignment9.Arrays;

//19. Find the second largest number in an array.

public class Array19 {
	public static void main(String[] args) {
		int arr[] = {12, 23, 45, 56, 78, 99, 100};
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
		
		System.out.println("Second largest element is "+arr[1]);
	}
}
