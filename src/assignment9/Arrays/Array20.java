package assignment9.Arrays;

//20. Find the frequency of each element in an array.

public class Array20 {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 1,4, 2, 3, 4, 5, 6,5, 6, 1, 1};
		
		for(int i = 0; i < arr.length; i++) {
			
			boolean visited = false;
			
			for(int k = 0; k < i; k++) {
				if(arr[i] == arr[k]) {
					visited = true;
					break;
				}
			}
			
			if(visited)
				continue;
			
			
			int freq = 1;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					freq++;
				}
			}
			
			System.out.println("Frequency of "+arr[i]+" is "+freq);
		}
	}
}
