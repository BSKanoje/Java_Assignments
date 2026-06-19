package assignment4.methodReturnType;

public class Test1 {
	public static void main(String[] args) {
		ReturnTypeOp r = new ReturnTypeOp();
		
		int sum = r.sum();
		System.out.println("Sum: "+sum);
		
		int sub = r.subtract();
		System.out.println("Difference: "+sub);
		
		int pro = r.multiply();
		System.out.println("Product: "+pro);
		
		int div = r.divide();
		System.out.println("Divide: "+div);
		
		int mod = r.modulus();
		System.out.println("Mod operation: "+mod);
	}
}
