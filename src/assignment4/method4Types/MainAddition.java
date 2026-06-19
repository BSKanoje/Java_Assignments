package assignment4.method4Types;

public class MainAddition {
	public static void main(String[] args) {

		Addition a = new Addition();
		a.additionVoid();
		
		System.out.println("------------");
		int addr = a.additionReturn();
		System.out.println("additionReturn : "+addr);
		
		System.out.println("---------------");
		a.additionVoidParam(100, 200);
		
		System.out.println("----------------");
		int addrp = a.additionReturnParam(450, 800);
		System.out.println("additionReturnParam : "+addrp);
	}
}
