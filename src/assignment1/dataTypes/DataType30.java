package assignment1.dataTypes;

// 30. WAP to swap two numbers using a third variable.

public class DataType30 {
	public static void main(String[] args) {
		
		int a = 90;
		int b = 80;
		
		System.out.println("Before Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
