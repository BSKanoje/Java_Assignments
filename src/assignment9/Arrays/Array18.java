package assignment9.Arrays;

//18. Rotate the array to the right by 1 position.

public class Array18 {
	public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int last = arr[arr.length - 1];
        
        for(int i = arr.length - 1; i > 0; i--) {
        	arr[i] = arr[i - 1];
        }
        
        arr[0] = last;
        
        System.out.println("Array after rotation right by 1 position:");
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i]+" ");
        }
        
	}
}
