package assignment5.DatatypeConstructorMethods;

// 11. Find the factorial of a number using a parameterized method.

public class C11 {

	public int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		C11 c = new C11();
		System.out.println("Factorial : "+ c.factorial(0));
	}
}
