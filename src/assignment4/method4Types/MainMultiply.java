package assignment4.method4Types;

public class MainMultiply {
	public static void main(String[] args) {
		Multiply m = new Multiply();
		m.multiplyVoid();
		
		System.out.println("-----------------");
		int mulr = m.multiplyReturn();
		System.out.println("multiplyReturn : "+mulr);
		
		System.out.println("-----------------");
		m.multiplyVoidParam(100, 100);
		
		System.out.println("------------------");
		int mulrp = m.multiplyReturnParam(100, 100);
		System.out.println("multiplyReturnParam : "+mulrp);
	}
}
