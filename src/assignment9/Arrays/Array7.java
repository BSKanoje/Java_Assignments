package assignment9.Arrays;

//7. Count even and odd numbers in an array.

public class Array7 {
	public static void main(String[] args) {
		int arr[] = {25, 22, 45, 56, 34, 65, 75, 768, 77, 12, 987};
		int even = 0, odd = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even count: "+even);
		System.out.println("Odd count: "+odd);
	}
}
