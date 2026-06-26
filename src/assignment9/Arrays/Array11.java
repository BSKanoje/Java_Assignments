package assignment9.Arrays;

//11. Print elements in reverse order.

public class Array11 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		System.out.println("Array in reverse order:");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+"  ");
		}
	}
}
