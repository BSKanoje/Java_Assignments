package assignment4.method4Types;

public class Multiply {

	public void multiplyVoid() {
		int a = 100;
		int b = 10;
		int mul = a * b;
		System.out.println("multiplyVoid : "+mul);
	}
	
	public int multiplyReturn() {
		int a = 100;
		int b = 10;
		int mul = a * b;
		return mul;
	}
	
	public void multiplyVoidParam(int a, int b) {
		int mul = a * b;
		System.out.println("multiplyVoidParam : "+mul);
	}
	
	public int multiplyReturnParam(int a, int b) {
		int mul = a * b;
		return mul;
	}
}
