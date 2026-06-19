package assignment4.method4Types;

public class MainModulus {
	public static void main(String[] args) {
		
		Modulus m = new Modulus();
		m.modVoid();
		
		System.out.println("----------------");
		int mr = m.modReturn();
		System.out.println("modReturn : "+mr);
		
		System.out.println("------------------");
		m.modVoidParam(789, 78);
		
		System.out.println("---------------------");
		int mrp = m.modReturnParam(78000, 789);
		System.out.println("modReturnParam : "+mrp);
	}
}
