package assignment9.Arrays;

//28. Count how many times a number appears in an array.

public class Array28 {
	public static void main(String[] args) {
		int arr[] = { 10, 60, 1, 20, 40, 20, 50, 40, 60 };

		int num = 20;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		
        System.out.println(num + " appears " + count + " times.");

	}
}
