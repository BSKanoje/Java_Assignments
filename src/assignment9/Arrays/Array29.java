package assignment9.Arrays;

//29. Replace every element with the product of all other elements.

public class Array29 {
	public static void main(String[] args) {
		
		int arr[] = {2, 3, 4, 5};
        int result[] = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int product = 1;

            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }

            result[i] = product;  
        }
        
        System.out.println("New Array:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

	}
}
