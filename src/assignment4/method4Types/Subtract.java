package assignment4.method4Types;

public class Subtract {

	public void subtractVoid() {
		int a = 90;
		int b = 45;
		int sub = a - b;
		System.out.println("subtractVoid : "+sub);
	}
	
	public int subtractReturn() {
		int a = 67;
		int b = 90;
		int sub = a - b;
		return sub;
	}
	
	public void subtractVoidParam(int a, int b) {
		int sub = a - b;
		System.out.println("subtractVoidParam : "+sub);
	}
	
	public int subtractReturnParam(int a, int b) {
		int sub = a - b;
		return sub;
	}
}
