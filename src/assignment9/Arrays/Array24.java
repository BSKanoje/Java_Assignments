package assignment9.Arrays;

//24. Find the difference between the largest and smallest element in the array.

public class Array24 {
	public static void main(String[] args) {
		int arr[] = {10, 34, 100, 23, 45, 56, 9, 81, 99, 8};
		
		int temp;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int largest = arr[arr.length-1];
		int smallest = arr[0];
		int diff = largest - smallest;
		
		System.out.println("Difference : "+diff);
	}
}

//package assignment9.Arrays;
//
////24. Find the difference between the largest and smallest element in the array.
//
//public class Array24 {
//
//  public static void main(String[] args) {
//
//      int arr[] = {12, 45, 67, 23, 89, 34, 5};
//
//      int largest = arr[0];
//      int smallest = arr[0];
//
//      for (int i = 1; i < arr.length; i++) {
//
//          if (arr[i] > largest) {
//              largest = arr[i];
//          }
//
//          if (arr[i] < smallest) {
//              smallest = arr[i];
//          }
//      }
//
//      int difference = largest - smallest;
//
//      System.out.println("Largest Element = " + largest);
//      System.out.println("Smallest Element = " + smallest);
//      System.out.println("Difference = " + difference);
//  }
//}
