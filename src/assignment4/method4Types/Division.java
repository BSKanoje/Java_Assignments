package assignment4.method4Types;

public class Division {

	public void divisionVoid() {
		int a = 78;
		int b = 89;
		int div = a / b;
		System.out.println("divisionVoid : "+div);
	}
	
	public int divisionReturn() {
		int a = 789;
		int b = 78;
		int div = a / b;
		return div;
	}
	
	public void divisionVoidParam(int a, int b) {
		int div = a / b;
		System.out.println("divisionVoidParam : "+div);
	}
	
	public int divisionReturnParam(int a, int b) {
		int div = a / b;
		return div;
	}
}
