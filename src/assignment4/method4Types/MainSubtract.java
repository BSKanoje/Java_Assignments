package assignment4.method4Types;

public class MainSubtract {

	public static void main(String[] args) {
		Subtract s = new Subtract();
		s.subtractVoid();
		
		System.out.println("--------------");
		int subr = s.subtractReturn();
		System.out.println("subtractReturn : "+subr);
		
		System.out.println("---------------");
		s.subtractVoidParam(100, 50);
		
		System.out.println("---------------");
		int subrp = s.subtractReturnParam(752, 789);
		System.out.println("subtractReturnParam : "+subrp);
	}
	
	
}
