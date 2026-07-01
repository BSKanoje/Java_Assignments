package assignment9.Arrays;

//30. Find all pairs of elements in array whose sum is equal to a given number.

public class Array30 {
	public static void main(String[] args) {
		int arr[] = { 10, 8, 2, 5, 5, 1, 0, 4, 6 };

		int num = 10;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == num) {
					System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
	}
}
