package assignment4.method4Types;

public class Addition {

	public void additionVoid() {
		int a = 10;
		int b = 50;
		int add =  a + b;
		System.out.println("additionVoid : "+add);
	}
	
	public int additionReturn() {
		int a = 39;
		int b = 34;
		int add = a + b;
		return add;
	}
	
	public void additionVoidParam(int a, int b) {
		int add = a + b;
		System.out.println("additionVoidParam : "+add);
	}
	
	public int additionReturnParam(int a, int b) {
		int add = a + b;
		return add;
	}
}
