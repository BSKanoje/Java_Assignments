package assignment4.method4Types;

public class Modulus {

	public void modVoid() {
		int a = 89;
		int b = 90;
		int mod = a % b;
		System.out.println("modVoid : "+mod);
	}
	
	public int modReturn() {
		int a = 90;
		int b = 9;
		int mod = a % b;
		return mod;
	}
	
	public void modVoidParam(int a, int b) {
		int mod = a % b;
		System.out.println("modVoidParam : "+mod);
	}
	
	public int modReturnParam(int a, int b) {
		int mod = a % b;
		return mod;
	}
}
